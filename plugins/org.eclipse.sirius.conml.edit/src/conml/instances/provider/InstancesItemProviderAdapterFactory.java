/**
 */
package conml.instances.provider;

import conml.instances.util.InstancesAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InstancesItemProviderAdapterFactory extends InstancesAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstancesItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link conml.instances.Reference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceItemProvider referenceItemProvider;

	/**
	 * This creates an adapter for a {@link conml.instances.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReferenceAdapter() {
		if (referenceItemProvider == null) {
			referenceItemProvider = new ReferenceItemProvider(this);
		}

		return referenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link conml.instances.InstanceModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceModelItemProvider instanceModelItemProvider;

	/**
	 * This creates an adapter for a {@link conml.instances.InstanceModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInstanceModelAdapter() {
		if (instanceModelItemProvider == null) {
			instanceModelItemProvider = new InstanceModelItemProvider(this);
		}

		return instanceModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link conml.instances.ValueSet} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueSetItemProvider valueSetItemProvider;

	/**
	 * This creates an adapter for a {@link conml.instances.ValueSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createValueSetAdapter() {
		if (valueSetItemProvider == null) {
			valueSetItemProvider = new ValueSetItemProvider(this);
		}

		return valueSetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link conml.instances.ReferenceSet} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceSetItemProvider referenceSetItemProvider;

	/**
	 * This creates an adapter for a {@link conml.instances.ReferenceSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReferenceSetAdapter() {
		if (referenceSetItemProvider == null) {
			referenceSetItemProvider = new ReferenceSetItemProvider(this);
		}

		return referenceSetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link conml.instances.Object} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectItemProvider objectItemProvider;

	/**
	 * This creates an adapter for a {@link conml.instances.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createObjectAdapter() {
		if (objectItemProvider == null) {
			objectItemProvider = new ObjectItemProvider(this);
		}

		return objectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link conml.instances.Link} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkItemProvider linkItemProvider;

	/**
	 * This creates an adapter for a {@link conml.instances.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLinkAdapter() {
		if (linkItemProvider == null) {
			linkItemProvider = new LinkItemProvider(this);
		}

		return linkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link conml.instances.TextValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextValueItemProvider textValueItemProvider;

  /**
	 * This creates an adapter for a {@link conml.instances.TextValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTextValueAdapter() {
		if (textValueItemProvider == null) {
			textValueItemProvider = new TextValueItemProvider(this);
		}

		return textValueItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link conml.instances.BooleanValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanValueItemProvider booleanValueItemProvider;

  /**
	 * This creates an adapter for a {@link conml.instances.BooleanValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBooleanValueAdapter() {
		if (booleanValueItemProvider == null) {
			booleanValueItemProvider = new BooleanValueItemProvider(this);
		}

		return booleanValueItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link conml.instances.TimeValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeValueItemProvider timeValueItemProvider;

  /**
	 * This creates an adapter for a {@link conml.instances.TimeValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTimeValueAdapter() {
		if (timeValueItemProvider == null) {
			timeValueItemProvider = new TimeValueItemProvider(this);
		}

		return timeValueItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link conml.instances.NumberValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumberValueItemProvider numberValueItemProvider;

  /**
	 * This creates an adapter for a {@link conml.instances.NumberValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNumberValueAdapter() {
		if (numberValueItemProvider == null) {
			numberValueItemProvider = new NumberValueItemProvider(this);
		}

		return numberValueItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link conml.instances.DataValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataValueItemProvider dataValueItemProvider;

  /**
	 * This creates an adapter for a {@link conml.instances.DataValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataValueAdapter() {
		if (dataValueItemProvider == null) {
			dataValueItemProvider = new DataValueItemProvider(this);
		}

		return dataValueItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link conml.instances.EnumValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumValueItemProvider enumValueItemProvider;

  /**
	 * This creates an adapter for a {@link conml.instances.EnumValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnumValueAdapter() {
		if (enumValueItemProvider == null) {
			enumValueItemProvider = new EnumValueItemProvider(this);
		}

		return enumValueItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link conml.instances.QualifierObject} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualifierObjectItemProvider qualifierObjectItemProvider;

    /**
	 * This creates an adapter for a {@link conml.instances.QualifierObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createQualifierObjectAdapter() {
		if (qualifierObjectItemProvider == null) {
			qualifierObjectItemProvider = new QualifierObjectItemProvider(this);
		}

		return qualifierObjectItemProvider;
	}

    /**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (referenceItemProvider != null) referenceItemProvider.dispose();
		if (instanceModelItemProvider != null) instanceModelItemProvider.dispose();
		if (valueSetItemProvider != null) valueSetItemProvider.dispose();
		if (referenceSetItemProvider != null) referenceSetItemProvider.dispose();
		if (objectItemProvider != null) objectItemProvider.dispose();
		if (linkItemProvider != null) linkItemProvider.dispose();
		if (textValueItemProvider != null) textValueItemProvider.dispose();
		if (booleanValueItemProvider != null) booleanValueItemProvider.dispose();
		if (timeValueItemProvider != null) timeValueItemProvider.dispose();
		if (numberValueItemProvider != null) numberValueItemProvider.dispose();
		if (dataValueItemProvider != null) dataValueItemProvider.dispose();
		if (enumValueItemProvider != null) enumValueItemProvider.dispose();
		if (qualifierObjectItemProvider != null) qualifierObjectItemProvider.dispose();
	}

}
