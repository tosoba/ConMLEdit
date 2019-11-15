package org.eclipse.sirius.conml.design.util;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import conml.Model;
import conml.ModelElement;
import conml.instances.InstanceModel;
import conml.types.BaseDataType;
import conml.types.Generalization;
import conml.types.TypeModel;

public class ConML {

  private ConML() {}

  public static <C extends EObject, E extends ModelElement>
      boolean containsOnlyOneExactlyEqualElement(
          final C container, final E element, final Function<C, EList<E>> elementsGetter) {
    return elementsGetter
            .apply(container)
            .stream()
            .filter(el -> EcoreUtil.equals(el, element))
            .count()
        == 1;
  }

  @SuppressWarnings("unchecked")
  public static <T> Collection<T> getAllElementsOfTypeFrom(
      final EObject parentObject, final Class<T> clazz) {
    final Set<T> candidates = new HashSet<>();
    forEachEObjectOf(
        parentObject,
        object -> {
          if (clazz.isInstance(object)) candidates.add((T) object);
        });
    return candidates;
  }

  private static void forEachEObjectOf(final EObject parentObject, final Consumer<EObject> action) {
    parentObject.eAllContents().forEachRemaining(action);
  }

  public static <T> Stream<T> getStreamOfAllElementsOfTypeFromModel(
      final Model model, final Class<T> clazz) {
    if (model instanceof TypeModel) {
      final TypeModel typeModel = (TypeModel) model;
      return typeModel.getElements().stream().filter(clazz::isInstance).map(clazz::cast);
    } else if (model instanceof InstanceModel) {
      final InstanceModel instanceModel = (InstanceModel) model;
      return instanceModel.getElements().stream().filter(clazz::isInstance).map(clazz::cast);
    } else throw new IllegalStateException();
  }

  public static <RefType extends EObject, Container extends EObject>
      boolean anyExistingContainerHasReferenceTo(
          final RefType ref,
          final Function<Container, RefType> referenceGetter,
          final Class<Container> containerClass) {
    final EObject rootContainer = EcoreUtil.getRootContainer(ref);
    final Stream<Container> descedentContainersStream =
        getAllElementsOfTypeFrom(rootContainer, containerClass).stream();
    final Stream<Container> containersStream =
        containerClass.isInstance(rootContainer)
            ? Stream.concat(
                Stream.of(containerClass.cast(rootContainer)), descedentContainersStream)
            : descedentContainersStream;
    return containersStream
        .filter(container -> EcoreUtil.equals(ref, referenceGetter.apply(container)))
        .findAny()
        .isPresent();
  }

  public static <R, T extends EObject> R castAndRunOrReturn(
      final EObject object,
      final Class<T> clazz,
      final Function<T, R> action,
      final R unsuccessfulCastResult) {
    if (!clazz.isInstance(object)) return unsuccessfulCastResult;
    final T castedObject = clazz.cast(object);
    return action.apply(castedObject);
  }

  public static <E extends EObject, C extends EObject>
      ElementContainerPair<E, C> castElementAndContainer(
          final EObject element,
          final Class<E> elementClass,
          final EObject container,
          final Class<C> containerClass) {
    return new ElementContainerPair<E, C>(element, elementClass, container, containerClass);
  }

  public static <E extends EObject, C extends EObject>
      ElementContainerPair<E, C> castElementAndContainer(
          final EObject element, final Class<E> elementClass, final Class<C> containerClass) {
    return new ElementContainerPair<E, C>(
        element, elementClass, element.eContainer(), containerClass);
  }

  public static class ElementContainerPair<E extends EObject, C extends EObject> {
    private final E element;
    private final C container;

    public ElementContainerPair(final E element, final C container) {
      this.element = element;
      this.container = container;
    }

    public ElementContainerPair(
        final EObject element,
        final Class<E> elementClass,
        final EObject container,
        final Class<C> containerClass) {
      this.element = elementClass.isInstance(element) ? elementClass.cast(element) : null;
      this.container = containerClass.isInstance(container) ? containerClass.cast(container) : null;
    }

    public E getElement() {
      return element;
    }

    public C getContainer() {
      return container;
    }

    public void ifBothCastsSuccessful(final BiConsumer<E, C> action) {
      if (element != null && container != null) action.accept(element, container);
    }

    public <R> R runIfBothCastsSuccessful(final BiFunction<E, C, R> action) {
      return runIfBothCastsSuccessful(action, null);
    }

    public <R> R runIfBothCastsSuccessful(
        final BiFunction<E, C, R> action, final R unsuccessfulCastResult) {
      if (element != null && container != null) return action.apply(element, container);
      else return unsuccessfulCastResult;
    }
  }

  public enum ElementMovementDirection {
    UP,
    DOWN
  }

  public static boolean areClassesAncestorAndDescedant(
      final conml.types.Class ancestor, final conml.types.Class descendant) {
    final Generalization specialization = ancestor.getSpecialization();
    if (specialization.getSpecializedClasses().isEmpty()) {
      return false;
    } else if (specialization
        .getSpecializedClasses()
        .stream()
        .anyMatch(clazz -> EcoreUtil.equals(clazz, descendant))) {
      return true;
    } else {
      return specialization
          .getSpecializedClasses()
          .stream()
          .map(clazz -> areClassesAncestorAndDescedant(clazz, descendant))
          .anyMatch(found -> found);
    }
  }

  private static final Map<BaseDataType, Set<BaseDataType>> typeCoersionMap = new HashMap<>();

  static {
    typeCoersionMap.put(
        BaseDataType.BOOLEAN,
        new HashSet<>(Arrays.asList(BaseDataType.BOOLEAN, BaseDataType.TEXT, BaseDataType.DATA)));
    typeCoersionMap.put(
        BaseDataType.NUMBER,
        new HashSet<>(Arrays.asList(BaseDataType.NUMBER, BaseDataType.TEXT, BaseDataType.DATA)));
    typeCoersionMap.put(
        BaseDataType.TIME,
        new HashSet<>(Arrays.asList(BaseDataType.TIME, BaseDataType.TEXT, BaseDataType.DATA)));
    typeCoersionMap.put(
        BaseDataType.TEXT, new HashSet<>(Arrays.asList(BaseDataType.TEXT, BaseDataType.DATA)));
    typeCoersionMap.put(BaseDataType.DATA, new HashSet<>(Arrays.asList(BaseDataType.DATA)));
  }

  public static boolean canBaseDataTypeCorceInto(
      final BaseDataType type, final BaseDataType intoType) {
    return typeCoersionMap.get(type).contains(intoType);
  }

  public static boolean clashesWithAnyKeyword(final String name) {
    return keywords.contains(name) || conMLKeywords.contains(name);
  }

  private static final Set<String> keywords =
      new HashSet<>(
          Arrays.asList(
              "abstract",
              "assert",
              "boolean",
              "break",
              "byte",
              "case",
              "catch",
              "char",
              "class",
              "const",
              "continue",
              "default",
              "do",
              "double",
              "else",
              "extends",
              "false",
              "final",
              "finally",
              "float",
              "for",
              "goto",
              "if",
              "implements",
              "import",
              "instanceof",
              "int",
              "interface",
              "long",
              "native",
              "new",
              "null",
              "package",
              "private",
              "protected",
              "public",
              "return",
              "short",
              "static",
              "strictfp",
              "super",
              "switch",
              "synchronized",
              "this",
              "throw",
              "throws",
              "transient",
              "true",
              "try",
              "void",
              "volatile",
              "while"));

  private static final Set<String> conMLKeywords =
      new HashSet<>(
          Arrays.asList(
              "con",
              "enum",
              "false",
              "language",
              "null",
              "package",
              "ref",
              "sha",
              "true",
              "unknown"));
}
