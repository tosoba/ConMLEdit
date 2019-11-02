/**
 */
package conml.types.provider;


import conml.types.SemiAssociation;
import conml.types.TypesPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link conml.types.SemiAssociation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SemiAssociationItemProvider extends FeatureItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemiAssociationItemProvider(AdapterFactory adapterFactory) {
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

			addRolePropertyDescriptor(object);
			addWholePropertyDescriptor(object);
			addStrongPropertyDescriptor(object);
			addPrimaryInAssociationPropertyDescriptor(object);
			addSecondaryInAssociationPropertyDescriptor(object);
			addInstanceReferenceSetsPropertyDescriptor(object);
			addInverseSemiAssociationPropertyDescriptor(object);
			addReferredClassPropertyDescriptor(object);
			addRedefinedSemiassociationPropertyDescriptor(object);
			addOwnerClassPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Role feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRolePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SemiAssociation_role_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SemiAssociation_role_feature", "_UI_SemiAssociation_type"),
				 TypesPackage.Literals.SEMI_ASSOCIATION__ROLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Whole feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWholePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SemiAssociation_whole_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SemiAssociation_whole_feature", "_UI_SemiAssociation_type"),
				 TypesPackage.Literals.SEMI_ASSOCIATION__WHOLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Strong feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStrongPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SemiAssociation_strong_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SemiAssociation_strong_feature", "_UI_SemiAssociation_type"),
				 TypesPackage.Literals.SEMI_ASSOCIATION__STRONG,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Primary In Association feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrimaryInAssociationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SemiAssociation_PrimaryInAssociation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SemiAssociation_PrimaryInAssociation_feature", "_UI_SemiAssociation_type"),
				 TypesPackage.Literals.SEMI_ASSOCIATION__PRIMARY_IN_ASSOCIATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

    /**
	 * This adds a property descriptor for the Secondary In Association feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecondaryInAssociationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SemiAssociation_SecondaryInAssociation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SemiAssociation_SecondaryInAssociation_feature", "_UI_SemiAssociation_type"),
				 TypesPackage.Literals.SEMI_ASSOCIATION__SECONDARY_IN_ASSOCIATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

    /**
	 * This adds a property descriptor for the Instance Reference Sets feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInstanceReferenceSetsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SemiAssociation_InstanceReferenceSets_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SemiAssociation_InstanceReferenceSets_feature", "_UI_SemiAssociation_type"),
				 TypesPackage.Literals.SEMI_ASSOCIATION__INSTANCE_REFERENCE_SETS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

    /**
	 * This adds a property descriptor for the Inverse Semi Association feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInverseSemiAssociationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SemiAssociation_InverseSemiAssociation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SemiAssociation_InverseSemiAssociation_feature", "_UI_SemiAssociation_type"),
				 TypesPackage.Literals.SEMI_ASSOCIATION__INVERSE_SEMI_ASSOCIATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Referred Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReferredClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SemiAssociation_ReferredClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SemiAssociation_ReferredClass_feature", "_UI_SemiAssociation_type"),
				 TypesPackage.Literals.SEMI_ASSOCIATION__REFERRED_CLASS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Redefined Semiassociation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRedefinedSemiassociationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SemiAssociation_RedefinedSemiassociation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SemiAssociation_RedefinedSemiassociation_feature", "_UI_SemiAssociation_type"),
				 TypesPackage.Literals.SEMI_ASSOCIATION__REDEFINED_SEMIASSOCIATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

    /**
	 * This adds a property descriptor for the Owner Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnerClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SemiAssociation_OwnerClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SemiAssociation_OwnerClass_feature", "_UI_SemiAssociation_type"),
				 TypesPackage.Literals.SEMI_ASSOCIATION__OWNER_CLASS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

        /**
	 * This returns SemiAssociation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SemiAssociation"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SemiAssociation)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SemiAssociation_type") :
			getString("_UI_SemiAssociation_type") + " " + label;
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

		switch (notification.getFeatureID(SemiAssociation.class)) {
			case TypesPackage.SEMI_ASSOCIATION__ROLE:
			case TypesPackage.SEMI_ASSOCIATION__WHOLE:
			case TypesPackage.SEMI_ASSOCIATION__STRONG:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

}
