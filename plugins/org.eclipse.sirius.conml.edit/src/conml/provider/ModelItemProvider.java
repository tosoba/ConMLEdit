/**
 */
package conml.provider;


import conml.Model;
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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link conml.Model} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelItemProvider 
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
	public ModelItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addVersionPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addDefaultLanguagePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Model_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Model_name_feature", "_UI_Model_type"),
				 conmlPackage.Literals.MODEL__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Model_version_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Model_version_feature", "_UI_Model_type"),
				 conmlPackage.Literals.MODEL__VERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Model_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Model_description_feature", "_UI_Model_type"),
				 conmlPackage.Literals.MODEL__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Language feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultLanguagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Model_DefaultLanguage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Model_DefaultLanguage_feature", "_UI_Model_type"),
				 conmlPackage.Literals.MODEL__DEFAULT_LANGUAGE,
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
			childrenFeatures.add(conmlPackage.Literals.MODEL__ELEMENTS);
			childrenFeatures.add(conmlPackage.Literals.MODEL__LANGUAGES);
			childrenFeatures.add(conmlPackage.Literals.MODEL__TAGS);
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
	 * This returns Model.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Model"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Model)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Model_type") :
			getString("_UI_Model_type") + " " + label;
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

		switch (notification.getFeatureID(Model.class)) {
			case conmlPackage.MODEL__NAME:
			case conmlPackage.MODEL__VERSION:
			case conmlPackage.MODEL__DESCRIPTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case conmlPackage.MODEL__ELEMENTS:
			case conmlPackage.MODEL__LANGUAGES:
			case conmlPackage.MODEL__TAGS:
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
				(conmlPackage.Literals.MODEL__ELEMENTS,
				 TypesFactory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(conmlPackage.Literals.MODEL__ELEMENTS,
				 TypesFactory.eINSTANCE.createGeneralization()));

		newChildDescriptors.add
			(createChildParameter
				(conmlPackage.Literals.MODEL__ELEMENTS,
				 TypesFactory.eINSTANCE.createEnumeratedType()));

		newChildDescriptors.add
			(createChildParameter
				(conmlPackage.Literals.MODEL__ELEMENTS,
				 TypesFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(conmlPackage.Literals.MODEL__ELEMENTS,
				 TypesFactory.eINSTANCE.createPackage()));

		newChildDescriptors.add
			(createChildParameter
				(conmlPackage.Literals.MODEL__ELEMENTS,
				 TypesFactory.eINSTANCE.createAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(conmlPackage.Literals.MODEL__ELEMENTS,
				 TypesFactory.eINSTANCE.createSemiAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(conmlPackage.Literals.MODEL__ELEMENTS,
				 TypesFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(conmlPackage.Literals.MODEL__ELEMENTS,
				 TypesFactory.eINSTANCE.createSimpleDataType()));

		newChildDescriptors.add
			(createChildParameter
				(conmlPackage.Literals.MODEL__ELEMENTS,
				 InstancesFactory.eINSTANCE.createReference()));

		newChildDescriptors.add
			(createChildParameter
				(conmlPackage.Literals.MODEL__ELEMENTS,
				 InstancesFactory.eINSTANCE.createValueSet()));

		newChildDescriptors.add
			(createChildParameter
				(conmlPackage.Literals.MODEL__ELEMENTS,
				 InstancesFactory.eINSTANCE.createReferenceSet()));

		newChildDescriptors.add
			(createChildParameter
				(conmlPackage.Literals.MODEL__ELEMENTS,
				 InstancesFactory.eINSTANCE.createObject()));

		newChildDescriptors.add
			(createChildParameter
				(conmlPackage.Literals.MODEL__ELEMENTS,
				 InstancesFactory.eINSTANCE.createLink()));

		newChildDescriptors.add
			(createChildParameter
				(conmlPackage.Literals.MODEL__ELEMENTS,
				 InstancesFactory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(conmlPackage.Literals.MODEL__LANGUAGES,
				 conmlFactory.eINSTANCE.createLanguage()));

		newChildDescriptors.add
			(createChildParameter
				(conmlPackage.Literals.MODEL__TAGS,
				 conmlFactory.eINSTANCE.createTag()));
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
