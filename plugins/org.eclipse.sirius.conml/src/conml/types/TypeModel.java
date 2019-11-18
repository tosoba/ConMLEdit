/**
 */
package conml.types;

import conml.Model;

import conml.instances.InstanceModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conml.types.TypeModel#getConformingInstanceModel <em>Conforming Instance Model</em>}</li>
 *   <li>{@link conml.types.TypeModel#getBaseTypeModel <em>Base Type Model</em>}</li>
 *   <li>{@link conml.types.TypeModel#getParticularTypeModels <em>Particular Type Models</em>}</li>
 *   <li>{@link conml.types.TypeModel#getSubjectiveAspect <em>Subjective Aspect</em>}</li>
 *   <li>{@link conml.types.TypeModel#getTemporalAspect <em>Temporal Aspect</em>}</li>
 *   <li>{@link conml.types.TypeModel#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see conml.types.TypesPackage#getTypeModel()
 * @model
 * @generated
 */
public interface TypeModel extends Model {
	/**
	 * Returns the value of the '<em><b>Conforming Instance Model</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.instances.InstanceModel#getConformedTypeModels <em>Conformed Type Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conforming Instance Model</em>' reference.
	 * @see #setConformingInstanceModel(InstanceModel)
	 * @see conml.types.TypesPackage#getTypeModel_ConformingInstanceModel()
	 * @see conml.instances.InstanceModel#getConformedTypeModels
	 * @model opposite="ConformedTypeModels"
	 * @generated
	 */
	InstanceModel getConformingInstanceModel();

  /**
	 * Sets the value of the '{@link conml.types.TypeModel#getConformingInstanceModel <em>Conforming Instance Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conforming Instance Model</em>' reference.
	 * @see #getConformingInstanceModel()
	 * @generated
	 */
	void setConformingInstanceModel(InstanceModel value);

  /**
	 * Returns the value of the '<em><b>Base Type Model</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.types.TypeModel#getParticularTypeModels <em>Particular Type Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Type Model</em>' reference.
	 * @see #setBaseTypeModel(TypeModel)
	 * @see conml.types.TypesPackage#getTypeModel_BaseTypeModel()
	 * @see conml.types.TypeModel#getParticularTypeModels
	 * @model opposite="ParticularTypeModels"
	 * @generated
	 */
	TypeModel getBaseTypeModel();

    /**
	 * Sets the value of the '{@link conml.types.TypeModel#getBaseTypeModel <em>Base Type Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Type Model</em>' reference.
	 * @see #getBaseTypeModel()
	 * @generated
	 */
	void setBaseTypeModel(TypeModel value);

    /**
	 * Returns the value of the '<em><b>Particular Type Models</b></em>' reference list.
	 * The list contents are of type {@link conml.types.TypeModel}.
	 * It is bidirectional and its opposite is '{@link conml.types.TypeModel#getBaseTypeModel <em>Base Type Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Particular Type Models</em>' reference list.
	 * @see conml.types.TypesPackage#getTypeModel_ParticularTypeModels()
	 * @see conml.types.TypeModel#getBaseTypeModel
	 * @model opposite="BaseTypeModel"
	 * @generated
	 */
	EList<TypeModel> getParticularTypeModels();

    /**
	 * Returns the value of the '<em><b>Subjective Aspect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subjective Aspect</em>' reference.
	 * @see #setSubjectiveAspect(conml.types.Class)
	 * @see conml.types.TypesPackage#getTypeModel_SubjectiveAspect()
	 * @model
	 * @generated
	 */
	conml.types.Class getSubjectiveAspect();

  /**
	 * Sets the value of the '{@link conml.types.TypeModel#getSubjectiveAspect <em>Subjective Aspect</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subjective Aspect</em>' reference.
	 * @see #getSubjectiveAspect()
	 * @generated
	 */
	void setSubjectiveAspect(conml.types.Class value);

    /**
	 * Returns the value of the '<em><b>Temporal Aspect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temporal Aspect</em>' reference.
	 * @see #setTemporalAspect(conml.types.Class)
	 * @see conml.types.TypesPackage#getTypeModel_TemporalAspect()
	 * @model
	 * @generated
	 */
	conml.types.Class getTemporalAspect();

    /**
	 * Sets the value of the '{@link conml.types.TypeModel#getTemporalAspect <em>Temporal Aspect</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temporal Aspect</em>' reference.
	 * @see #getTemporalAspect()
	 * @generated
	 */
	void setTemporalAspect(conml.types.Class value);

        /**
	 * Returns the value of the '<em><b>Elements</b></em>' reference list.
	 * The list contents are of type {@link conml.types.TypeModelElement}.
	 * It is bidirectional and its opposite is '{@link conml.types.TypeModelElement#getTypeModel <em>Type Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' reference list.
	 * @see conml.types.TypesPackage#getTypeModel_Elements()
	 * @see conml.types.TypeModelElement#getTypeModel
	 * @model opposite="TypeModel"
	 * @generated
	 */
	EList<TypeModelElement> getElements();

} // TypeModel
