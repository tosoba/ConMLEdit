/**
 */
package conml.instances.provider;


import conml.instances.InstancesPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link conml.instances.Object} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ObjectItemProvider extends InstanceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectItemProvider(AdapterFactory adapterFactory) {
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

			addIdentifierPropertyDescriptor(object);
			addCertaintyPropertyDescriptor(object);
			addDocumentsPropertyDescriptor(object);
			addIsInstanceOfPropertyDescriptor(object);
			addOwnsValueSetsPropertyDescriptor(object);
			addOwnsReferenceSetsPropertyDescriptor(object);
			addIsOppositeInPropertyDescriptor(object);
			addIsPhaseQualifierOfPropertyDescriptor(object);
			addIsPersepectiveQualifierOfPropertyDescriptor(object);
			addTemporalExistentialQualifierPropertyDescriptor(object);
			addIsTemporalExistenceQualiferOfPropertyDescriptor(object);
			addSubjectveExistentalQualiferPropertyDescriptor(object);
			addIsSubjectveExistenceQualiferOfPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Identifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdentifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Object_identifier_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Object_identifier_feature", "_UI_Object_type"),
				 InstancesPackage.Literals.OBJECT__IDENTIFIER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Certainty feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCertaintyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Object_certainty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Object_certainty_feature", "_UI_Object_type"),
				 InstancesPackage.Literals.OBJECT__CERTAINTY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Documents feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDocumentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Object_Documents_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Object_Documents_feature", "_UI_Object_type"),
				 InstancesPackage.Literals.OBJECT__DOCUMENTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Instance Of feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsInstanceOfPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Object_IsInstanceOf_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Object_IsInstanceOf_feature", "_UI_Object_type"),
				 InstancesPackage.Literals.OBJECT__IS_INSTANCE_OF,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Owns Value Sets feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnsValueSetsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Object_OwnsValueSets_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Object_OwnsValueSets_feature", "_UI_Object_type"),
				 InstancesPackage.Literals.OBJECT__OWNS_VALUE_SETS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Owns Reference Sets feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnsReferenceSetsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Object_OwnsReferenceSets_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Object_OwnsReferenceSets_feature", "_UI_Object_type"),
				 InstancesPackage.Literals.OBJECT__OWNS_REFERENCE_SETS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Opposite In feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsOppositeInPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Object_IsOppositeIn_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Object_IsOppositeIn_feature", "_UI_Object_type"),
				 InstancesPackage.Literals.OBJECT__IS_OPPOSITE_IN,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Phase Qualifier Of feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsPhaseQualifierOfPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Object_IsPhaseQualifierOf_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Object_IsPhaseQualifierOf_feature", "_UI_Object_type"),
				 InstancesPackage.Literals.OBJECT__IS_PHASE_QUALIFIER_OF,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Persepective Qualifier Of feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsPersepectiveQualifierOfPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Object_IsPersepectiveQualifierOf_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Object_IsPersepectiveQualifierOf_feature", "_UI_Object_type"),
				 InstancesPackage.Literals.OBJECT__IS_PERSEPECTIVE_QUALIFIER_OF,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Temporal Existential Qualifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTemporalExistentialQualifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Object_TemporalExistentialQualifier_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Object_TemporalExistentialQualifier_feature", "_UI_Object_type"),
				 InstancesPackage.Literals.OBJECT__TEMPORAL_EXISTENTIAL_QUALIFIER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Temporal Existence Qualifer Of feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsTemporalExistenceQualiferOfPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Object_IsTemporalExistenceQualiferOf_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Object_IsTemporalExistenceQualiferOf_feature", "_UI_Object_type"),
				 InstancesPackage.Literals.OBJECT__IS_TEMPORAL_EXISTENCE_QUALIFER_OF,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Subjectve Existental Qualifer feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubjectveExistentalQualiferPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Object_SubjectveExistentalQualifer_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Object_SubjectveExistentalQualifer_feature", "_UI_Object_type"),
				 InstancesPackage.Literals.OBJECT__SUBJECTVE_EXISTENTAL_QUALIFER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Subjectve Existence Qualifer Of feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsSubjectveExistenceQualiferOfPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Object_IsSubjectveExistenceQualiferOf_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Object_IsSubjectveExistenceQualiferOf_feature", "_UI_Object_type"),
				 InstancesPackage.Literals.OBJECT__IS_SUBJECTVE_EXISTENCE_QUALIFER_OF,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns Object.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Object"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((conml.instances.Object)object).getIdentifier();
		return label == null || label.length() == 0 ?
			getString("_UI_Object_type") :
			getString("_UI_Object_type") + " " + label;
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

		switch (notification.getFeatureID(conml.instances.Object.class)) {
			case InstancesPackage.OBJECT__IDENTIFIER:
			case InstancesPackage.OBJECT__CERTAINTY:
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
