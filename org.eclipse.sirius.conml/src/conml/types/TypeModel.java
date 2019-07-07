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
 *   <li>{@link conml.types.TypeModel#getHasElements <em>Has Elements</em>}</li>
 *   <li>{@link conml.types.TypeModel#getConformedBy <em>Conformed By</em>}</li>
 *   <li>{@link conml.types.TypeModel#getHasTemporalAspectOf <em>Has Temporal Aspect Of</em>}</li>
 *   <li>{@link conml.types.TypeModel#getHasSubjectiveAspectOf <em>Has Subjective Aspect Of</em>}</li>
 *   <li>{@link conml.types.TypeModel#getExtends <em>Extends</em>}</li>
 *   <li>{@link conml.types.TypeModel#getIsBaseOf <em>Is Base Of</em>}</li>
 *   <li>{@link conml.types.TypeModel#getIsParticularIn <em>Is Particular In</em>}</li>
 *   <li>{@link conml.types.TypeModel#getHasParticular <em>Has Particular</em>}</li>
 * </ul>
 *
 * @see conml.types.TypesPackage#getTypeModel()
 * @model
 * @generated
 */
public interface TypeModel extends Model {
	/**
	 * Returns the value of the '<em><b>Has Elements</b></em>' reference list.
	 * The list contents are of type {@link conml.types.TypeModelElement}.
	 * It is bidirectional and its opposite is '{@link conml.types.TypeModelElement#getIsAssignedTo <em>Is Assigned To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Elements</em>' reference list.
	 * @see conml.types.TypesPackage#getTypeModel_HasElements()
	 * @see conml.types.TypeModelElement#getIsAssignedTo
	 * @model opposite="IsAssignedTo"
	 * @generated
	 */
	EList<TypeModelElement> getHasElements();

	/**
	 * Returns the value of the '<em><b>Conformed By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.instances.InstanceModel#getConformsTo <em>Conforms To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conformed By</em>' reference.
	 * @see #setConformedBy(InstanceModel)
	 * @see conml.types.TypesPackage#getTypeModel_ConformedBy()
	 * @see conml.instances.InstanceModel#getConformsTo
	 * @model opposite="ConformsTo"
	 * @generated
	 */
	InstanceModel getConformedBy();

	/**
	 * Sets the value of the '{@link conml.types.TypeModel#getConformedBy <em>Conformed By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conformed By</em>' reference.
	 * @see #getConformedBy()
	 * @generated
	 */
	void setConformedBy(InstanceModel value);

	/**
	 * Returns the value of the '<em><b>Has Temporal Aspect Of</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.types.Class#getIsTemporalAspectOf <em>Is Temporal Aspect Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Temporal Aspect Of</em>' reference.
	 * @see #setHasTemporalAspectOf(conml.types.Class)
	 * @see conml.types.TypesPackage#getTypeModel_HasTemporalAspectOf()
	 * @see conml.types.Class#getIsTemporalAspectOf
	 * @model opposite="IsTemporalAspectOf"
	 * @generated
	 */
	conml.types.Class getHasTemporalAspectOf();

	/**
	 * Sets the value of the '{@link conml.types.TypeModel#getHasTemporalAspectOf <em>Has Temporal Aspect Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Temporal Aspect Of</em>' reference.
	 * @see #getHasTemporalAspectOf()
	 * @generated
	 */
	void setHasTemporalAspectOf(conml.types.Class value);

	/**
	 * Returns the value of the '<em><b>Has Subjective Aspect Of</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.types.Class#getIsSubjectiveAspectOf <em>Is Subjective Aspect Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Subjective Aspect Of</em>' reference.
	 * @see #setHasSubjectiveAspectOf(conml.types.Class)
	 * @see conml.types.TypesPackage#getTypeModel_HasSubjectiveAspectOf()
	 * @see conml.types.Class#getIsSubjectiveAspectOf
	 * @model opposite="IsSubjectiveAspectOf"
	 * @generated
	 */
	conml.types.Class getHasSubjectiveAspectOf();

	/**
	 * Sets the value of the '{@link conml.types.TypeModel#getHasSubjectiveAspectOf <em>Has Subjective Aspect Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Subjective Aspect Of</em>' reference.
	 * @see #getHasSubjectiveAspectOf()
	 * @generated
	 */
	void setHasSubjectiveAspectOf(conml.types.Class value);

	/**
	 * Returns the value of the '<em><b>Extends</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.types.TypeModel#getIsBaseOf <em>Is Base Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' reference.
	 * @see #setExtends(TypeModel)
	 * @see conml.types.TypesPackage#getTypeModel_Extends()
	 * @see conml.types.TypeModel#getIsBaseOf
	 * @model opposite="IsBaseOf"
	 * @generated
	 */
	TypeModel getExtends();

	/**
	 * Sets the value of the '{@link conml.types.TypeModel#getExtends <em>Extends</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extends</em>' reference.
	 * @see #getExtends()
	 * @generated
	 */
	void setExtends(TypeModel value);

	/**
	 * Returns the value of the '<em><b>Is Base Of</b></em>' reference list.
	 * The list contents are of type {@link conml.types.TypeModel}.
	 * It is bidirectional and its opposite is '{@link conml.types.TypeModel#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Base Of</em>' reference list.
	 * @see conml.types.TypesPackage#getTypeModel_IsBaseOf()
	 * @see conml.types.TypeModel#getExtends
	 * @model opposite="Extends"
	 * @generated
	 */
	EList<TypeModel> getIsBaseOf();

	/**
	 * Returns the value of the '<em><b>Is Particular In</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.types.TypeModel#getHasParticular <em>Has Particular</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Particular In</em>' reference.
	 * @see #setIsParticularIn(TypeModel)
	 * @see conml.types.TypesPackage#getTypeModel_IsParticularIn()
	 * @see conml.types.TypeModel#getHasParticular
	 * @model opposite="HasParticular"
	 * @generated
	 */
	TypeModel getIsParticularIn();

	/**
	 * Sets the value of the '{@link conml.types.TypeModel#getIsParticularIn <em>Is Particular In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Particular In</em>' reference.
	 * @see #getIsParticularIn()
	 * @generated
	 */
	void setIsParticularIn(TypeModel value);

	/**
	 * Returns the value of the '<em><b>Has Particular</b></em>' reference list.
	 * The list contents are of type {@link conml.types.TypeModel}.
	 * It is bidirectional and its opposite is '{@link conml.types.TypeModel#getIsParticularIn <em>Is Particular In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Particular</em>' reference list.
	 * @see conml.types.TypesPackage#getTypeModel_HasParticular()
	 * @see conml.types.TypeModel#getIsParticularIn
	 * @model opposite="IsParticularIn"
	 * @generated
	 */
	EList<TypeModel> getHasParticular();

} // TypeModel
