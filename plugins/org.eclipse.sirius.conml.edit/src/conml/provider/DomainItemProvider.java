/**
 */
package conml.provider;


import conml.Domain;
import conml.conmlFactory;
import conml.conmlPackage;

import conml.instances.InstancesFactory;

import conml.types.TypesFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link conml.Domain} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DomainItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainItemProvider(AdapterFactory adapterFactory) {
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

			addModelsPropertyDescriptor(object);
			addPartsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Models feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModelsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Domain_Models_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Domain_Models_feature", "_UI_Domain_type"),
				 conmlPackage.Literals.DOMAIN__MODELS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parts feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPartsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Domain_Parts_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Domain_Parts_feature", "_UI_Domain_type"),
				 conmlPackage.Literals.DOMAIN__PARTS,
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
			childrenFeatures.add(conmlPackage.Literals.DOMAIN__MODELS);
			childrenFeatures.add(conmlPackage.Literals.DOMAIN__PARTS);
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
	 * This returns Domain.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Domain"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Domain_type");
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

		switch (notification.getFeatureID(Domain.class)) {
			case conmlPackage.DOMAIN__MODELS:
			case conmlPackage.DOMAIN__PARTS:
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
				(conmlPackage.Literals.DOMAIN__MODELS,
				 TypesFactory.eINSTANCE.createTypeModel()));

		newChildDescriptors.add
			(createChildParameter
				(conmlPackage.Literals.DOMAIN__MODELS,
				 InstancesFactory.eINSTANCE.createInstanceModel()));

		newChildDescriptors.add
			(createChildParameter
				(conmlPackage.Literals.DOMAIN__PARTS,
				 conmlFactory.eINSTANCE.createTag()));

		newChildDescriptors.add
			(createChildParameter
				(conmlPackage.Literals.DOMAIN__PARTS,
				 conmlFactory.eINSTANCE.createLanguage()));

		newChildDescriptors.add
			(createChildParameter
				(conmlPackage.Literals.DOMAIN__PARTS,
				 TypesFactory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(conmlPackage.Literals.DOMAIN__PARTS,
				 TypesFactory.eINSTANCE.createGeneralization()));

		newChildDescriptors.add
			(createChildParameter
				(conmlPackage.Literals.DOMAIN__PARTS,
				 TypesFactory.eINSTANCE.createEnumeratedType()));

		newChildDescriptors.add
			(createChildParameter
				(conmlPackage.Literals.DOMAIN__PARTS,
				 TypesFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(conmlPackage.Literals.DOMAIN__PARTS,
				 TypesFactory.eINSTANCE.createPackage()));

		newChildDescriptors.add
			(createChildParameter
				(conmlPackage.Literals.DOMAIN__PARTS,
				 TypesFactory.eINSTANCE.createAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(conmlPackage.Literals.DOMAIN__PARTS,
				 TypesFactory.eINSTANCE.createSemiAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(conmlPackage.Literals.DOMAIN__PARTS,
				 TypesFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(conmlPackage.Literals.DOMAIN__PARTS,
				 TypesFactory.eINSTANCE.createSimpleDataType()));

		newChildDescriptors.add
			(createChildParameter
				(conmlPackage.Literals.DOMAIN__PARTS,
				 InstancesFactory.eINSTANCE.createReference()));

		newChildDescriptors.add
			(createChildParameter
				(conmlPackage.Literals.DOMAIN__PARTS,
				 InstancesFactory.eINSTANCE.createValueSet()));

		newChildDescriptors.add
			(createChildParameter
				(conmlPackage.Literals.DOMAIN__PARTS,
				 InstancesFactory.eINSTANCE.createReferenceSet()));

		newChildDescriptors.add
			(createChildParameter
				(conmlPackage.Literals.DOMAIN__PARTS,
				 InstancesFactory.eINSTANCE.createObject()));

		newChildDescriptors.add
			(createChildParameter
				(conmlPackage.Literals.DOMAIN__PARTS,
				 InstancesFactory.eINSTANCE.createLink()));

		newChildDescriptors.add
			(createChildParameter
				(conmlPackage.Literals.DOMAIN__PARTS,
				 InstancesFactory.eINSTANCE.createValue()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ConmlEditPlugin.INSTANCE;
	}

}
