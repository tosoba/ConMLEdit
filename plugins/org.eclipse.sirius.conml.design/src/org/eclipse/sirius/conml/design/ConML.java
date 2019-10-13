package org.eclipse.sirius.conml.design;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class ConML {

  private ConML() {}

  @SuppressWarnings("unchecked")
  public static <T> Collection<T> getAllElementsOfTypeFrom(EObject parentObject, Class<T> clazz) {
    final Set<T> candidates = new HashSet<>();
    forEachEObjectOf(
        parentObject,
        object -> {
          if (clazz.isInstance(object)) candidates.add((T) object);
        });
    return candidates;
  }

  private static void forEachEObjectOf(EObject parentObject, Consumer<EObject> action) {
    parentObject.eAllContents().forEachRemaining(action);
  }

  public static <RefType extends EObject, Container extends EObject>
      boolean anyExistingContainerHasReferenceTo(
          RefType ref,
          Function<Container, RefType> referenceGetter,
          Class<Container> containerClass) {
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
      EObject object, Class<T> clazz, Function<T, R> action, R unsuccessfulCastResult) {
    if (!clazz.isInstance(object)) return unsuccessfulCastResult;
    final T castedObject = clazz.cast(object);
    return action.apply(castedObject);
  }

  public static <E extends EObject, C extends EObject>
      ElementContainerPair<E, C> castElementAndContainer(
          EObject element, Class<E> elementClass, EObject container, Class<C> containerClass) {
    return new ElementContainerPair<E, C>(element, elementClass, container, containerClass);
  }

  public static <E extends EObject, C extends EObject>
      ElementContainerPair<E, C> castElementAndContainer(
          EObject element, Class<E> elementClass, Class<C> containerClass) {
    return new ElementContainerPair<E, C>(
        element, elementClass, element.eContainer(), containerClass);
  }

  public static class ElementContainerPair<E extends EObject, C extends EObject> {
    private final E element;
    private final C container;

    public ElementContainerPair(E element, C container) {
      this.element = element;
      this.container = container;
    }

    public ElementContainerPair(
        EObject element, Class<E> elementClass, EObject container, Class<C> containerClass) {
      this.element = elementClass.isInstance(element) ? elementClass.cast(element) : null;
      this.container = containerClass.isInstance(container) ? containerClass.cast(container) : null;
    }

    public E getElement() {
      return element;
    }

    public C getContainer() {
      return container;
    }

    public void ifBothCastsSuccessful(BiConsumer<E, C> action) {
      if (element != null && container != null) action.accept(element, container);
    }
  }

  public enum ElementMovementDirection {
    UP,
    DOWN
  }
}
