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

			addAbstractPropertyDescriptor(object);
			addUsedAsTemporalAspectPropertyDescriptor(object);
			addUsedAsSubjectiveAspectPropertyDescriptor(object);
			addGeneralizationsPropertyDescriptor(object);
			addSpecializationPropertyDescriptor(object);
			addDominantGeneralizationPropertyDescriptor(object);
			addInstanceObjectsPropertyDescriptor(object);
			addPackagePropertyDescriptor(object);
			addPropertiesPropertyDescriptor(object);
			addAttributesPropertyDescriptor(object);
			addSemiAssociationsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Abstract feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAbstractPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Class_abstract_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_abstract_feature", "_UI_Class_type"),
				 TypesPackage.Literals.CLASS__ABSTRACT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Used As Temporal Aspect feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUsedAsTemporalAspectPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Class_usedAsTemporalAspect_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_usedAsTemporalAspect_feature", "_UI_Class_type"),
				 TypesPackage.Literals.CLASS__USED_AS_TEMPORAL_ASPECT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Used As Subjective Aspect feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUsedAsSubjectiveAspectPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Class_usedAsSubjectiveAspect_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_usedAsSubjectiveAspect_feature", "_UI_Class_type"),
				 TypesPackage.Literals.CLASS__USED_AS_SUBJECTIVE_ASPECT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Generalizations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGeneralizationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Class_Generalizations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_Generalizations_feature", "_UI_Class_type"),
				 TypesPackage.Literals.CLASS__GENERALIZATIONS,
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
	 * This adds a property descriptor for the Instance Objects feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInstanceObjectsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Class_InstanceObjects_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_InstanceObjects_feature", "_UI_Class_type"),
				 TypesPackage.Literals.CLASS__INSTANCE_OBJECTS,
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
			childrenFeatures.add(TypesPackage.Literals.CLASS__PROPERTIES);
			childrenFeatures.add(TypesPackage.Literals.CLASS__ATTRIBUTES);
			childrenFeatures.add(TypesPackage.Literals.CLASS__SEMI_ASSOCIATIONS);
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
	 * This adds a property descriptor for the Package feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPackagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Class_Package_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_Package_feature", "_UI_Class_type"),
				 TypesPackage.Literals.CLASS__PACKAGE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Properties feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPropertiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Class_Properties_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_Properties_feature", "_UI_Class_type"),
				 TypesPackage.Literals.CLASS__PROPERTIES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Attributes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAttributesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Class_Attributes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_Attributes_feature", "_UI_Class_type"),
				 TypesPackage.Literals.CLASS__ATTRIBUTES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Semi Associations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSemiAssociationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Class_SemiAssociations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_SemiAssociations_feature", "_UI_Class_type"),
				 TypesPackage.Literals.CLASS__SEMI_ASSOCIATIONS,
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
			case TypesPackage.CLASS__ABSTRACT:
			case TypesPackage.CLASS__USED_AS_TEMPORAL_ASPECT:
			case TypesPackage.CLASS__USED_AS_SUBJECTIVE_ASPECT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case TypesPackage.CLASS__PROPERTIES:
			case TypesPackage.CLASS__ATTRIBUTES:
			case TypesPackage.CLASS__SEMI_ASSOCIATIONS:
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
				(TypesPackage.Literals.CLASS__PROPERTIES,
				 TypesFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.CLASS__ATTRIBUTES,
				 TypesFactory.eINSTANCE.createAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.CLASS__SEMI_ASSOCIATIONS,
				 TypesFactory.eINSTANCE.createSemiAssociation()));
	}

}
