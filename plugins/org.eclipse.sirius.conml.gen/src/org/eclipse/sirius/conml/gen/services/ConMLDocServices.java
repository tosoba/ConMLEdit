package org.eclipse.sirius.conml.gen.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.util.EcoreUtil;

import conml.NamedElement;
import conml.types.Attribute;
import conml.types.Class;
import conml.types.EnumeratedItem;
import conml.types.EnumeratedType;
import conml.types.Feature;
import conml.types.Package;
import conml.types.SemiAssociation;
import conml.types.TypeModel;

public class ConMLDocServices {

  public Package getOverallPackage(final TypeModel typeModel) {
    return typeModel
        .getElements()
        .stream()
        .filter(
            element -> {
              if (!(element instanceof Package)) return false;
              final Package packageToCheck = (Package) element;
              return packageToCheck.isOverall();
            })
        .findAny()
        .map(Package.class::cast)
        .orElse(null);
  }

  public String namedElementFilePath(
      final NamedElement namedElement, final String pathBeginning, final String pathEnd) {
    final StringBuilder sb = new StringBuilder();
    if (pathBeginning != null) sb.append(pathBeginning);
    sb.append(namedElement.getName()).append('-').append(namedElement.hashCode());
    if (pathEnd != null) sb.append(pathEnd);
    return sb.toString();
  }

  public String classAspectsString(final Class clazz) {
    final ArrayList<String> aspectMarkers = new ArrayList<>();
    if (clazz.isUsedAsSubjectiveAspect()) aspectMarkers.add("S");
    if (clazz.isUsedAsTemporalAspect()) aspectMarkers.add("T");
    if (aspectMarkers.isEmpty()) return "";
    else return aspectMarkers.stream().collect(Collectors.joining(","));
  }

  public String featureCardinalityString(final Feature feature) {
    final StringBuilder sb = new StringBuilder();
    sb.append(feature.getMinimumCardinality());
    if (!Objects.equals(feature.getMinimumCardinality(), feature.getMaximumCardinality())) {
      sb.append("..");
      if (feature.getMaximumCardinality() != null) {
        sb.append(feature.getMaximumCardinality());
      } else {
        sb.append("*");
      }
    }
    if (feature.isSorted()) sb.append("^");
    return sb.toString();
  }

  public String featureMarkersString(final Feature feature) {
    final ArrayList<String> markers = new ArrayList<>();
    if (feature.isConstant()) markers.add("K");
    if (feature.isSubjective()) markers.add("S");
    if (feature.isTemporal()) markers.add("T");
    if (markers.isEmpty()) return "";
    else return markers.stream().collect(Collectors.joining(","));
  }

  private <T extends Feature> Set<T> getFeaturesIncludingInherited(
      final Class clazz, final Function<Class, List<T>> featuresGetter) {
    if (clazz.getGeneralizations().isEmpty()) return new HashSet<>(featuresGetter.apply(clazz));
    return Stream.concat(
            featuresGetter.apply(clazz).stream(),
            clazz
                .getGeneralizations()
                .stream()
                .filter(gen -> gen.getGeneralizedClass() != null)
                .map(
                    gen -> getFeaturesIncludingInherited(gen.getGeneralizedClass(), featuresGetter))
                .flatMap(Collection::stream))
        .collect(Collectors.toSet());
  }

  private <T extends Feature> Set<T> getFeaturesIncludingInheritedFilteringRedefined(
      final Class clazz,
      final Function<Class, List<T>> featuresGetter,
      final Function<T, T> redefinedFeatureGetter) {
    final Set<T> redefinedFeatures = new HashSet<>();
    final Set<T> allFeatures = getFeaturesIncludingInherited(clazz, featuresGetter);
    for (final T feat : allFeatures) {
      final T redefined = redefinedFeatureGetter.apply(feat);
      if (redefined == null) continue;
      redefinedFeatures.add(redefined);
    }
    allFeatures.removeAll(redefinedFeatures);
    return allFeatures;
  }

  public Set<Attribute> getAttributesIncludingInheritedFilteringRedefined(final Class clazz) {
    return getFeaturesIncludingInheritedFilteringRedefined(
        clazz, Class::getAttributes, Attribute::getRedefinedAttribute);
  }

  public Set<SemiAssociation> getSemiAssociationsIncludingInheritedFilteringRedefined(
      final Class clazz) {
    return getFeaturesIncludingInheritedFilteringRedefined(
        clazz, Class::getSemiAssociations, SemiAssociation::getRedefinedSemiAssociation);
  }

  public int enumeratedItemDepth(final EnumeratedItem enumItem) {
    int depth = 0;
    EnumeratedItem iter = enumItem;
    while (iter.getSuperItem() != null && !EcoreUtil.equals(iter, iter.getSuperItem())) {
      iter = iter.getSuperItem();
      ++depth;
    }
    return depth;
  }

  public List<EnumeratedItem> depthFirstEnumeratedItemList(final EnumeratedType enumType) {
    final ArrayList<EnumeratedItem> enumItems = new ArrayList<>();
    enumType
        .getOwnedItems()
        .stream()
        .filter(item -> item.getSuperItem() == null)
        .forEach(enumItem -> buildDepthFirstEnumeratedItemList(enumItem, enumItems));
    return enumItems;
  }

  private void buildDepthFirstEnumeratedItemList(
      final EnumeratedItem enumItem, final List<EnumeratedItem> currentItems) {
    currentItems.add(enumItem);
    enumItem
        .getSubItems()
        .forEach(subItem -> buildDepthFirstEnumeratedItemList(subItem, currentItems));
  }
}
