/**
 */
package conml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conml.Tag#getName <em>Name</em>}</li>
 *   <li>{@link conml.Tag#getBelongsTo <em>Belongs To</em>}</li>
 *   <li>{@link conml.Tag#getAppliesTo <em>Applies To</em>}</li>
 * </ul>
 *
 * @see conml.conmlPackage#getTag()
 * @model
 * @generated
 */
public interface Tag extends ModelPart {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see conml.conmlPackage#getTag_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link conml.Tag#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Belongs To</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link conml.Model#getHasTags <em>Has Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Belongs To</em>' container reference.
	 * @see #setBelongsTo(Model)
	 * @see conml.conmlPackage#getTag_BelongsTo()
	 * @see conml.Model#getHasTags
	 * @model opposite="HasTags" required="true" transient="false"
	 * @generated
	 */
	Model getBelongsTo();

	/**
	 * Sets the value of the '{@link conml.Tag#getBelongsTo <em>Belongs To</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Belongs To</em>' container reference.
	 * @see #getBelongsTo()
	 * @generated
	 */
	void setBelongsTo(Model value);

	/**
	 * Returns the value of the '<em><b>Applies To</b></em>' reference list.
	 * The list contents are of type {@link conml.ModelElement}.
	 * It is bidirectional and its opposite is '{@link conml.ModelElement#getIsTaggedWith <em>Is Tagged With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applies To</em>' reference list.
	 * @see conml.conmlPackage#getTag_AppliesTo()
	 * @see conml.ModelElement#getIsTaggedWith
	 * @model opposite="IsTaggedWith"
	 * @generated
	 */
	EList<ModelElement> getAppliesTo();

} // Tag
