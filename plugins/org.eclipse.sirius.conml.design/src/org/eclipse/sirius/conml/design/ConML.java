package org.eclipse.sirius.conml.design;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class ConML {

  private ConML() {}

  @SuppressWarnings("unchecked")
  public static <T> Collection<T> getAllElementsOfTypeFrom(EObject parentObject, Class<T> clazz) {
    Set<T> candidates = new HashSet<>();
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
    EObject rootContainer = EcoreUtil.getRootContainer(ref);
    Stream<Container> descedentContainersStream =
        getAllElementsOfTypeFrom(rootContainer, containerClass).stream();
    Stream<Container> containersStream =
        containerClass.isInstance(rootContainer)
            ? Stream.concat(
                Stream.of(containerClass.cast(rootContainer)), descedentContainersStream)
            : descedentContainersStream;
    return containersStream
        .filter(container -> EcoreUtil.equals(ref, referenceGetter.apply(container)))
        .findAny()
        .isPresent();
  }
}
