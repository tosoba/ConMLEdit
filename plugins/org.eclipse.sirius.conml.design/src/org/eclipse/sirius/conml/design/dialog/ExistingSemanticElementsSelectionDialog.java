package org.eclipse.sirius.conml.design.dialog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Consumer;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.provider.EcoreItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ICheckStateProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.window.Window;
import org.eclipse.sirius.conml.design.provider.ModelFilteredTreeContentProvider;
import org.eclipse.sirius.conml.design.services.common.UIServices;
import org.eclipse.sirius.conml.design.util.ModelElementsSelectionDialogPatternMatcher;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.ui.provider.DiagramUIPlugin;
import org.eclipse.sirius.diagram.ui.tools.api.image.DiagramImagesPath;
import org.eclipse.sirius.ext.base.Option;
import org.eclipse.sirius.ext.base.Options;
import org.eclipse.sirius.ui.tools.api.color.VisualBindingManager;
import org.eclipse.sirius.ui.tools.internal.views.common.navigator.SiriusCommonLabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.CheckedTreeSelectionDialog;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import conml.Domain;
import conml.Model;
import conml.ModelElement;
import conml.ModelPart;
import conml.instances.util.InstancesAdapterFactory;
import conml.types.EnumeratedItem;
import conml.types.EnumeratedType;
import conml.types.util.TypesAdapterFactory;
import conml.util.conmlAdapterFactory;

@SuppressWarnings("restriction")
public class ExistingSemanticElementsSelectionDialog {

  protected final class CustomTreeSelectionDialog extends CheckedTreeSelectionDialog {

    @Override
    protected void createButtonsForButtonBar(Composite parent) {
      super.createButtonsForButtonBar(parent);
      if (initExtraButtons != null) initExtraButtons.accept(parent);
    }

    private static final String REGEXP_TOOL_TIP =
        "Expression that will be used to filter elements by name (for example 'abc', 'a?c', '*c'...)";
    private static final String REGEXP_TITLE = "Filter elements by name";
    private static final String REGEXP_EXPLANATIONS = "? = any character, * = any String";

    private ModelElementsSelectionDialogPatternMatcher patternMatcher;
    private final Set<Object> checkedElements = Sets.newHashSet();

    private CustomTreeSelectionDialog(
        Shell parent, ILabelProvider labelProvider, ITreeContentProvider contentProvider) {
      super(parent, labelProvider, contentProvider);
      patternMatcher = new ModelElementsSelectionDialogPatternMatcher("");
    }

    private Button addButton(
        Composite parent, String toolTipText, Image image, SelectionListener action) {
      final Button button = new Button(parent, SWT.PUSH);
      button.setToolTipText(toolTipText);
      button.setImage(image);
      button.addSelectionListener(action);
      return button;
    }

    @SuppressWarnings("unchecked")
    private void checkAll() {
      final Collection<Object> roots = (Collection<Object>) getTreeViewer().getInput();
      setRecursiveState(roots, true);
    }

    private void collapseAll() {
      getTreeViewer().collapseAll();
    }

    @Override
    protected Control createContents(Composite parent) {
      final Control result = super.createContents(parent);

      if (isMultiSelect) {
        getTreeViewer()
            .setCheckStateProvider(
                new ICheckStateProvider() {
                  public boolean isChecked(Object element) {
                    return checkedElements.contains(element);
                  }

                  public boolean isGrayed(Object element) {
                    return isGrayed.apply(element);
                  }
                });
        getTreeViewer()
            .addCheckStateListener(
                new ICheckStateListener() {
                  public void checkStateChanged(CheckStateChangedEvent event) {
                    if (!isGrayed.apply(event.getElement())) {
                      if (event.getChecked()) {
                        checkedElements.add(event.getElement());
                      } else {
                        checkedElements.remove(event.getElement());
                      }
                    }
                  }
                });
      } else {
        getTreeViewer()
            .setCheckStateProvider(
                new ICheckStateProvider() {
                  public boolean isChecked(Object element) {
                    Object[] checkedElements = getTreeViewer().getCheckedElements();
                    if (checkedElements.length == 0) return false;
                    else return Objects.equals(checkedElements[0], element);
                  }

                  public boolean isGrayed(Object element) {
                    return isGrayed.apply(element);
                  }
                });
        getTreeViewer()
            .addCheckStateListener(
                new ICheckStateListener() {
                  public void checkStateChanged(CheckStateChangedEvent event) {
                    if (!isGrayed.apply(event.getElement())) {
                      checkedElements.clear();
                      checkedElements.add(event.getElement());
                      getTreeViewer().setCheckedElements(new Object[] {event.getElement()});
                    }
                  }
                });
      }
      getTreeViewer().expandToLevel(2);
      return result;
    }

    @Override
    protected Label createMessageArea(Composite composite) {
      final Label createMessageArea = super.createMessageArea(composite);
      createSelectionButtonsAfterMessageArea(composite);
      createRegexpTypeZone(composite);
      return createMessageArea;
    }

    private void createRegexpTypeZone(Composite composite) {
      final Group expregGroup = new Group(composite, SWT.NONE);
      expregGroup.setText(REGEXP_TITLE);
      final GridLayout expregLayout = new GridLayout();
      expregGroup.setLayout(expregLayout);
      expregGroup.setFont(composite.getFont());
      expregGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

      final Label explanationsLabel = new Label(expregGroup, SWT.NONE);
      explanationsLabel.setText(REGEXP_EXPLANATIONS);

      final Text regularExpressionText = new Text(expregGroup, SWT.BORDER);
      regularExpressionText.setToolTipText(REGEXP_TOOL_TIP);
      regularExpressionText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

      regularExpressionText.addModifyListener(
          new ModifyListener() {
            public void modifyText(ModifyEvent e) {
              final String typedRegex = ((Text) e.getSource()).getText();
              setPatternMatcher(new ModelElementsSelectionDialogPatternMatcher(typedRegex));
              updateFilteringMode(mode);
            }
          });
    }

    @Override
    protected Composite createSelectionButtons(Composite composite) {
      final Composite buttonComposite =
          new Composite(composite, SWT.RIGHT) {
            @Override
            public Point computeSize(int wHint, int hHint, boolean b) {
              return super.computeSize(0, 0, b);
            }
          };
      buttonComposite.setVisible(false);
      return buttonComposite;
    }

    private Composite createSelectionButtonsAfterMessageArea(Composite composite) {
      final Composite buttonComposite = new Composite(composite, SWT.RIGHT);
      final GridLayout layout = new GridLayout();
      layout.numColumns = 7;
      layout.makeColumnsEqualWidth = false;
      buttonComposite.setLayout(layout);
      buttonComposite.setFont(composite.getFont());

      GridData data = new GridData(GridData.HORIZONTAL_ALIGN_END | GridData.GRAB_HORIZONTAL);
      data.grabExcessHorizontalSpace = true;
      composite.setData(data);

      new Label(buttonComposite, SWT.LEAD).setText("Show");
      final Combo choices = new Combo(buttonComposite, SWT.READ_ONLY);
      choices.add(FilteringMode.SHOW_ALL.getName());
      choices.add(FilteringMode.SHOW_ONLY_UNDISPLAYED_ELEMENTS.getName());
      choices.select(0);
      choices.addSelectionListener(
          new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
              switch (choices.getSelectionIndex()) {
                case 0:
                  updateFilteringMode(FilteringMode.SHOW_ALL);
                  break;
                case 1:
                  updateFilteringMode(FilteringMode.SHOW_ONLY_UNDISPLAYED_ELEMENTS);
                  break;
                default:
                  throw new RuntimeException();
              }
            }
          });

      data = new GridData(GridData.HORIZONTAL_ALIGN_END | GridData.GRAB_HORIZONTAL);
      data.grabExcessHorizontalSpace = true;
      data.horizontalSpan = 2;
      choices.setLayoutData(data);

      data = new GridData(GridData.HORIZONTAL_ALIGN_FILL | GridData.GRAB_HORIZONTAL);
      data.grabExcessHorizontalSpace = true;

      if (isMultiSelect) {
        addButton(
                buttonComposite,
                "Check All",
                DiagramUIPlugin.getPlugin().getBundledImage(DiagramImagesPath.CHECK_ALL_ICON),
                new SelectionAdapter() {
                  @Override
                  public void widgetSelected(SelectionEvent e) {
                    checkAll();
                  }
                })
            .setLayoutData(data);
      }
      addButton(
              buttonComposite,
              "Uncheck All",
              DiagramUIPlugin.getPlugin().getBundledImage(DiagramImagesPath.UNCHECK_ALL_ICON),
              new SelectionAdapter() {
                @Override
                public void widgetSelected(SelectionEvent e) {
                  uncheckAll();
                }
              })
          .setLayoutData(data);

      addButton(
              buttonComposite,
              "Expand All",
              DiagramUIPlugin.getPlugin().getBundledImage(DiagramImagesPath.EXPAND_ALL_ICON),
              new SelectionAdapter() {
                @Override
                public void widgetSelected(SelectionEvent e) {
                  expandAll();
                }
              })
          .setLayoutData(data);

      addButton(
              buttonComposite,
              "Collapse All",
              DiagramUIPlugin.getPlugin().getBundledImage(DiagramImagesPath.COLLAPSE_ALL_ICON),
              new SelectionAdapter() {
                @Override
                public void widgetSelected(SelectionEvent e) {
                  collapseAll();
                }
              })
          .setLayoutData(data);

      return buttonComposite;
    }

    public void expandAll() {
      getTreeViewer().expandAll();
    }

    public Predicate<Object> getRegexpMatchPredicate() {
      return patternMatcher.getMatchPredicate();
    }

    public boolean isMatchingExpregOrHasMatchingExpregDescendantsAllMode(Object element) {
      return isOrHasDescendant(element, getRegexpMatchPredicate());
    }

    public boolean isMatchingExpregOrHasMatchingExpregDescendantsSubMode(Object element) {
      if (element instanceof Domain) return true;

      if (element instanceof EObject) {
        final List<EObject> subElements = Lists.newArrayList();
        eObject
            .eAllContents()
            .forEachRemaining(
                eObj -> {
                  if (eObj instanceof ModelElement
                      || eObj instanceof Model
                      || eObj instanceof Domain) subElements.add(eObj);
                });
        final Predicate<Object> isSubElementPredicate = Predicates.in(subElements);
        final Predicate<Object> isMatchinExpregPredicate = getRegexpMatchPredicate();
        return isOrHasDescendant(
            element, Predicates.and(isSubElementPredicate, isMatchinExpregPredicate));
      }

      return false;
    }

    private boolean isMatchingExpregOrHasMatchingExpregDescendantsUnrepresentedMode(
        Object element) {
      if (element instanceof EObject) {
        final Collection<EObject> existingElementsOnDiagram =
            UIServices.getInstance().getDisplayedNodes(diagram);
        final Predicate<Object> isSubElementPredicate =
            Predicates.not(Predicates.in(existingElementsOnDiagram));
        final Predicate<Object> isMatchinExpregPredicate = getRegexpMatchPredicate();
        return isOrHasDescendant(
            element, Predicates.and(isSubElementPredicate, isMatchinExpregPredicate));
      }
      return false;
    }

    private boolean isOrHasDescendant(Object element, final Predicate<Object> pred) {
      final boolean matches = pred.apply(element);
      if (matches) return true;
      return Iterables.any(
          Arrays.asList(contentProvider.getChildren(element)),
          input -> isOrHasDescendant(input, pred));
    }

    private void refresh() {
      getTreeViewer().refresh();
    }

    @Override
    public void setInitialElementSelections(@SuppressWarnings("rawtypes") List selectedElements) {
      @SuppressWarnings("unchecked")
      final List<Object> filteredSeletection =
          Lists.newArrayList(Iterables.filter(selectedElements, Predicates.not(isGrayed)));
      checkedElements.addAll(filteredSeletection);
      super.setInitialElementSelections(filteredSeletection);
    }

    @Override
    public void setInitialSelections(Object... selectedElements) {
      setInitialElementSelections(Lists.newArrayList(selectedElements));
    }

    public void setPatternMatcher(ModelElementsSelectionDialogPatternMatcher patternMatcher) {
      this.patternMatcher = patternMatcher;
    }

    private void setRecursiveState(Collection<Object> elements, boolean state) {
      for (final Object element : elements) {
        setRecursiveState(element, state);
      }
    }

    private void setRecursiveState(final Object element, final boolean state) {
      getTreeViewer().setChecked(element, state);
      if (!isGrayed.apply(element)) {
        if (state) {
          checkedElements.add(element);
        } else {
          checkedElements.remove(element);
        }
      }
      for (final Object child : contentProvider.getChildren(element)) {
        setRecursiveState(child, state);
      }
    }

    private void uncheckAll() {
      final Collection<?> roots = (Collection<?>) getTreeViewer().getInput();
      setRecursiveState(roots, false);
    }

    @SuppressWarnings("deprecation")
    public void refreshTreeViewer() {
      refresh();
      getTreeViewer().expandToLevel(2);
      getTreeViewer().setAllChecked(false);
      for (final Object element : checkedElements) {
        getTreeViewer().setChecked(element, true);
      }
    }

    public void updateFilteringMode(FilteringMode filteringMode) {
      mode = filteringMode;
      refreshTreeViewer();
    }
  }

  enum FilteringMode {
    SHOW_ALL("all elements"),
    SHOW_ONLY_UNDISPLAYED_ELEMENTS("only undisplayed elements");

    private final String name;

    private FilteringMode(String name) {
      this.name = name;
    }

    public String getName() {
      return name;
    }
  }

  private class ModeFilter extends ViewerFilter {

    @Override
    public boolean select(Viewer viewer, Object parentElement, Object element) {
      boolean show = true;
      switch (mode) {
        case SHOW_ALL:
          show = dialog.isMatchingExpregOrHasMatchingExpregDescendantsAllMode(element);
          break;
        case SHOW_ONLY_UNDISPLAYED_ELEMENTS:
          if (diagram != null) {
            show = dialog.isMatchingExpregOrHasMatchingExpregDescendantsUnrepresentedMode(element);
          }
          break;
        default:
          show = true;
          break;
      }

      return show;
    }
  }

  private class SelectionDialogLabelProvider extends SiriusCommonLabelProvider {
    @Override
    public Color getBackground(Object element) {
      return null;
    }

    @Override
    public Color getForeground(final Object element) {
      Color foreground = null;
      if (isGrayed.apply(element))
        foreground = VisualBindingManager.getDefault().getColorFromName("light_gray");
      return foreground;
    }
  }

  private static final Function<Object, Void> DO_NOTHING =
      new Function<Object, Void>() {
        public Void apply(Object from) {
          return null;
        }
      };

  private CustomTreeSelectionDialog dialog;

  public CustomTreeSelectionDialog getDialog() {
    return dialog;
  }

  private EObject eObject;
  private FilteringMode mode = FilteringMode.SHOW_ALL;
  private Predicate<Object> isGrayed = Predicates.alwaysFalse();
  private Function<Object, Void> selectedAction = DO_NOTHING;
  private ModelFilteredTreeContentProvider contentProvider;
  private DDiagram diagram;

  private final boolean isMultiSelect;
  private final String title;
  private final String message;
  private final Predicate<Object> isValidEObjectPredicate;
  private Consumer<Composite> initExtraButtons;

  public void setInitExtraButtons(Consumer<Composite> initExtraButtons) {
    this.initExtraButtons = initExtraButtons;
  }

  public Predicate<Object> getIsValidEObjectPredicate() {
    return isValidEObjectPredicate;
  }

  public ExistingSemanticElementsSelectionDialog(
      String title,
      String message,
      Predicate<Object> isValidEObjectPredicate,
      boolean isMultiSelect) {
    this.title = title;
    this.message = message;
    this.isValidEObjectPredicate = isValidEObjectPredicate;
    this.isMultiSelect = isMultiSelect;
  }

  public ExistingSemanticElementsSelectionDialog(
      String title,
      String message,
      Predicate<Object> isValidEObjectPredicate,
      Consumer<Composite> initExtraButtons) {
    this.title = title;
    this.message = message;
    this.isValidEObjectPredicate = isValidEObjectPredicate;
    this.isMultiSelect = true;
    this.initExtraButtons = initExtraButtons;
  }

  public ExistingSemanticElementsSelectionDialog(
      String title,
      String message,
      Predicate<Object> isValidEObjectPredicate,
      boolean isMultiSelect,
      Consumer<Composite> initExtraButtons) {
    this.title = title;
    this.message = message;
    this.isValidEObjectPredicate = isValidEObjectPredicate;
    this.isMultiSelect = isMultiSelect;
    this.initExtraButtons = initExtraButtons;
  }

  public void applyRequestedChanges(Set<Object> selectedBefore, Set<Object> selectedAfter) {
    for (final Object dde : Sets.difference(selectedAfter, selectedBefore)) {
      selectedAction.apply(dde);
    }
  }

  private Option<Set<Object>> askUserForNewSelection(Shell parent, Set<Object> initialSelection) {
    setupDialog(parent, initialSelection);
    final int result = dialog.open();
    if (result == Window.OK) {
      final Set<Object> selectedAfter = getElementsSelectedAfter();
      return Options.newSome(selectedAfter);
    }
    return Options.newNone();
  }

  private AdapterFactory getAdapterFactory() {
    final List<AdapterFactory> factories = new ArrayList<AdapterFactory>();
    factories.add(new conmlAdapterFactory());
    factories.add(new TypesAdapterFactory());
    factories.add(new InstancesAdapterFactory());
    factories.add(new ResourceItemProviderAdapterFactory());
    factories.add(new EcoreItemProviderAdapterFactory());
    factories.add(new ReflectiveItemProviderAdapterFactory());
    return new ComposedAdapterFactory(factories);
  }

  private Predicate<Object> getDisplayablePredicate() {
    return input ->
        input instanceof EObject && isOrHasDescendant((EObject) input, isValidEObjectPredicate);
  }

  private Set<Object> getElementsSelectedAfter() {
    final Set<Object> selectedElements = Sets.newHashSet();
    for (final Object obj : dialog.checkedElements) {
      selectedElements.add(obj);
    }
    return selectedElements;
  }

  private void initContentProvider() {
    final AdapterFactory adapterFactory = getAdapterFactory();
    contentProvider =
        new ModelFilteredTreeContentProvider(adapterFactory, getDisplayablePredicate());
  }

  private boolean isOrHasDescendant(EObject element, final Predicate<Object> predicate) {
    if (predicate.apply(element)) return true;

    if (element instanceof Domain) {
      final Domain domain = (Domain) element;
      for (final ModelPart part : domain.getParts()) {
        if (predicate.apply(part)) return true;
      }
      for (final Model model : domain.getModels()) {
        if (predicate.apply(model)) return true;
      }
    }

    if (element instanceof EnumeratedType) {
      final EnumeratedType enumType = (EnumeratedType) element;
      for (final EnumeratedItem item : enumType.getOwnedItems()) {
        if (predicate.apply(item)) return true;
      }
    }

    return false;
  }

  public List<Object> open(
      Shell parent, EObject selectedContainer, DDiagram ddiagram, boolean includeNodeLabel) {
    final List<Object> result = Lists.newArrayList();
    eObject = selectedContainer;
    diagram = ddiagram;

    initContentProvider();

    final Set<Object> allSelectedElements = Collections.unmodifiableSet(Sets.newHashSet());
    final Option<Set<Object>> response = askUserForNewSelection(parent, allSelectedElements);
    if (response.some()) {
      final Set<Object> selectedAfter = response.get();
      result.addAll(selectedAfter);
    }
    eObject = null;
    dialog = null;
    contentProvider = null;
    return result;
  }

  @SuppressWarnings("unchecked")
  public void setGrayedPredicate(Predicate<EObject> isGrayedPredicate) {
    isGrayed =
        Predicates.and(
            (Predicate<? super Object>)
                (isGrayedPredicate != null ? isGrayedPredicate : Predicates.alwaysFalse()),
            isValidEObjectPredicate);
  }

  public void setSelectedAction(Function<Object, Void> selectedAction) {
    this.selectedAction = selectedAction;
  }

  private void setupDialog(Shell parent, Set<Object> initialSelection) {
    dialog =
        new CustomTreeSelectionDialog(parent, new SelectionDialogLabelProvider(), contentProvider);
    dialog.setTitle(title);
    String msg = message;
    if (!Predicates.alwaysFalse().equals(isGrayed)) {
      final StringBuilder sb = new StringBuilder(message);
      sb.append("\n");
      sb.append("The wizard will have no effect on grayed elements.");
      msg = sb.toString();
    }
    dialog.setMessage(msg);
    dialog.setInput(eObject);
    dialog.addFilter(new ModeFilter());
    dialog.setInitialElementSelections(Lists.newArrayList(initialSelection));
  }
}
