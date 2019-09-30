/**
 */
package conml.types.provider;


import conml.types.TypesFactory;
import conml.types.TypesPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link conml.types.Class} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassItemProvider extends TypeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addIsAbstractPropertyDescriptor(object);
			addIsTemporalAspectPropertyDescriptor(object);
			addIsSubjectiveAspectPropertyDescriptor(object);
			addIsTemporalAspectOfPropertyDescriptor(object);
			addIsSubjectiveAspectOfPropertyDescriptor(object);
			addGeneralizationPropertyDescriptor(object);
			addSpecializationPropertyDescriptor(object);
			addDominantGeneralizationPropertyDescriptor(object);
			addOwnsSemiassociationsPropertyDescriptor(object);
			addIsOppositeClassInPropertyDescriptor(object);
			addInstancedByPropertyDescriptor(object);
			addBelongsToPackagePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Is Abstract feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsAbstractPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Class_isAbstract_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_isAbstract_feature", "_UI_Class_type"),
				 TypesPackage.Literals.CLASS__IS_ABSTRACT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Temporal Aspect feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsTemporalAspectPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Class_isTemporalAspect_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_isTemporalAspect_feature", "_UI_Class_type"),
				 TypesPackage.Literals.CLASS__IS_TEMPORAL_ASPECT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Subjective Aspect feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsSubjectiveAspectPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Class_isSubjectiveAspect_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_isSubjectiveAspect_feature", "_UI_Class_type"),
				 TypesPackage.Literals.CLASS__IS_SUBJECTIVE_ASPECT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Temporal Aspect Of feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsTemporalAspectOfPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Class_IsTemporalAspectOf_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_IsTemporalAspectOf_feature", "_UI_Class_type"),
				 TypesPackage.Literals.CLASS__IS_TEMPORAL_ASPECT_OF,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Subjective Aspect Of feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsSubjectiveAspectOfPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Class_IsSubjectiveAspectOf_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_IsSubjectiveAspectOf_feature", "_UI_Class_type"),
				 TypesPackage.Literals.CLASS__IS_SUBJECTIVE_ASPECT_OF,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Generalization feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGeneralizationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Class_Generalization_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_Generalization_feature", "_UI_Class_type"),
				 TypesPackage.Literals.CLASS__GENERALIZATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Specialization feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpecializationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Class_Specialization_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_Specialization_feature", "_UI_Class_type"),
				 TypesPackage.Literals.CLASS__SPECIALIZATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Dominant Generalization feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDominantGeneralizationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Class_DominantGeneralization_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_DominantGeneralization_feature", "_UI_Class_type"),
				 TypesPackage.Literals.CLASS__DOMINANT_GENERALIZATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(TypesPackage.Literals.CLASS__OWNS_SEMIASSOCIATIONS);
			childrenFeatures.add(TypesPackage.Literals.CLASS__OWNS_PROPERTIES);
			childrenFeatures.add(TypesPackage.Literals.CLASS__OWNS_ATTRIBUTES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This adds a property descriptor for the Owns Semiassociations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnsSemiassociationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Class_OwnsSemiassociations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_OwnsSemiassociations_feature", "_UI_Class_type"),
				 TypesPackage.Literals.CLASS__OWNS_SEMIASSOCIATIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Opposite Class In feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsOppositeClassInPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Class_IsOppositeClassIn_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_IsOppositeClassIn_feature", "_UI_Class_type"),
				 TypesPackage.Literals.CLASS__IS_OPPOSITE_CLASS_IN,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Instanced By feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInstancedByPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Class_InstancedBy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_InstancedBy_feature", "_UI_Class_type"),
				 TypesPackage.Literals.CLASS__INSTANCED_BY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Belongs To Package feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBelongsToPackagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Class_BelongsToPackage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_BelongsToPackage_feature", "_UI_Class_type"),
				 TypesPackage.Literals.CLASS__BELONGS_TO_PACKAGE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((conml.types.Class)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Class_type") :
			getString("_UI_Class_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(conml.types.Class.class)) {
			case TypesPackage.CLASS__IS_ABSTRACT:
			case TypesPackage.CLASS__IS_TEMPORAL_ASPECT:
			case TypesPackage.CLASS__IS_SUBJECTIVE_ASPECT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case TypesPackage.CLASS__OWNS_SEMIASSOCIATIONS:
			case TypesPackage.CLASS__OWNS_PROPERTIES:
			case TypesPackage.CLASS__OWNS_ATTRIBUTES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.CLASS__OWNS_SEMIASSOCIATIONS,
				 TypesFactory.eINSTANCE.createSemiAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.CLASS__OWNS_PROPERTIES,
				 TypesFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.CLASS__OWNS_ATTRIBUTES,
				 TypesFactory.eINSTANCE.createAttribute()));
	}

}
