/**
 */
package conml.instances.provider;


import conml.instances.InstancesPackage;
import conml.instances.QualifierObject;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link conml.instances.QualifierObject} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class QualifierObjectItemProvider extends ObjectItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualifierObjectItemProvider(AdapterFactory adapterFactory) {
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

			addQualifierPropertyDescriptor(object);
			addSubjectiveQualifiedObjectsPropertyDescriptor(object);
			addTemporalQualifiedObjectsPropertyDescriptor(object);
			addPerspectiveQualifiedFacetSetsPropertyDescriptor(object);
			addPhaseQualifiedFacetSetsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Qualifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addQualifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_QualifierObject_qualifier_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_QualifierObject_qualifier_feature", "_UI_QualifierObject_type"),
				 InstancesPackage.Literals.QUALIFIER_OBJECT__QUALIFIER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Subjective Qualified Objects feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubjectiveQualifiedObjectsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_QualifierObject_SubjectiveQualifiedObjects_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_QualifierObject_SubjectiveQualifiedObjects_feature", "_UI_QualifierObject_type"),
				 InstancesPackage.Literals.QUALIFIER_OBJECT__SUBJECTIVE_QUALIFIED_OBJECTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Temporal Qualified Objects feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTemporalQualifiedObjectsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_QualifierObject_TemporalQualifiedObjects_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_QualifierObject_TemporalQualifiedObjects_feature", "_UI_QualifierObject_type"),
				 InstancesPackage.Literals.QUALIFIER_OBJECT__TEMPORAL_QUALIFIED_OBJECTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Perspective Qualified Facet Sets feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPerspectiveQualifiedFacetSetsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_QualifierObject_PerspectiveQualifiedFacetSets_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_QualifierObject_PerspectiveQualifiedFacetSets_feature", "_UI_QualifierObject_type"),
				 InstancesPackage.Literals.QUALIFIER_OBJECT__PERSPECTIVE_QUALIFIED_FACET_SETS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Phase Qualified Facet Sets feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhaseQualifiedFacetSetsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_QualifierObject_PhaseQualifiedFacetSets_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_QualifierObject_PhaseQualifiedFacetSets_feature", "_UI_QualifierObject_type"),
				 InstancesPackage.Literals.QUALIFIER_OBJECT__PHASE_QUALIFIED_FACET_SETS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns QualifierObject.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/QualifierObject"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((QualifierObject)object).getIdentifier();
		return label == null || label.length() == 0 ?
			getString("_UI_QualifierObject_type") :
			getString("_UI_QualifierObject_type") + " " + label;
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

		switch (notification.getFeatureID(QualifierObject.class)) {
			case InstancesPackage.QUALIFIER_OBJECT__QUALIFIER:
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
