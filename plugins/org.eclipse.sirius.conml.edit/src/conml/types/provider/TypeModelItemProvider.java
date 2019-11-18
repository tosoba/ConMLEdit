/**
 */
package conml.types.provider;


import conml.provider.ConmlEditPlugin;
import conml.provider.ModelItemProvider;

import conml.types.TypeModel;
import conml.types.TypesPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link conml.types.TypeModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TypeModelItemProvider extends ModelItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeModelItemProvider(AdapterFactory adapterFactory) {
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

			addConformingInstanceModelPropertyDescriptor(object);
			addBaseTypeModelPropertyDescriptor(object);
			addParticularTypeModelsPropertyDescriptor(object);
			addSubjectiveAspectPropertyDescriptor(object);
			addTemporalAspectPropertyDescriptor(object);
			addElementsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Conforming Instance Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConformingInstanceModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TypeModel_ConformingInstanceModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TypeModel_ConformingInstanceModel_feature", "_UI_TypeModel_type"),
				 TypesPackage.Literals.TYPE_MODEL__CONFORMING_INSTANCE_MODEL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Base Type Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBaseTypeModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TypeModel_BaseTypeModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TypeModel_BaseTypeModel_feature", "_UI_TypeModel_type"),
				 TypesPackage.Literals.TYPE_MODEL__BASE_TYPE_MODEL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Particular Type Models feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParticularTypeModelsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TypeModel_ParticularTypeModels_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TypeModel_ParticularTypeModels_feature", "_UI_TypeModel_type"),
				 TypesPackage.Literals.TYPE_MODEL__PARTICULAR_TYPE_MODELS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

    /**
	 * This adds a property descriptor for the Subjective Aspect feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubjectiveAspectPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TypeModel_SubjectiveAspect_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TypeModel_SubjectiveAspect_feature", "_UI_TypeModel_type"),
				 TypesPackage.Literals.TYPE_MODEL__SUBJECTIVE_ASPECT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Temporal Aspect feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTemporalAspectPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TypeModel_TemporalAspect_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TypeModel_TemporalAspect_feature", "_UI_TypeModel_type"),
				 TypesPackage.Literals.TYPE_MODEL__TEMPORAL_ASPECT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

    /**
	 * This adds a property descriptor for the Elements feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addElementsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TypeModel_Elements_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TypeModel_Elements_feature", "_UI_TypeModel_type"),
				 TypesPackage.Literals.TYPE_MODEL__ELEMENTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

        /**
	 * This returns TypeModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TypeModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TypeModel)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_TypeModel_type") :
			getString("_UI_TypeModel_type") + " " + label;
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
