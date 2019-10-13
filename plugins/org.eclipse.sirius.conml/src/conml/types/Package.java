/**
 */
package conml.types;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conml.types.Package#getName <em>Name</em>}</li>
 *   <li>{@link conml.types.Package#getDescription <em>Description</em>}</li>
 *   <li>{@link conml.types.Package#getContainedClasses <em>Contained Classes</em>}</li>
 *   <li>{@link conml.types.Package#getEnumeratedTypes <em>Enumerated Types</em>}</li>
 *   <li>{@link conml.types.Package#getSubPackages <em>Sub Packages</em>}</li>
 *   <li>{@link conml.types.Package#getContainerPackage <em>Container Package</em>}</li>
 *   <li>{@link conml.types.Package#isOverall <em>Overall</em>}</li>
 * </ul>
 *
 * @see conml.types.TypesPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends TypeModelElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see conml.types.TypesPackage#getPackage_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link conml.types.Package#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see conml.types.TypesPackage#getPackage_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link conml.types.Package#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Contained Classes</b></em>' reference list.
	 * The list contents are of type {@link conml.types.Class}.
	 * It is bidirectional and its opposite is '{@link conml.types.Class#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Classes</em>' reference list.
	 * @see conml.types.TypesPackage#getPackage_ContainedClasses()
	 * @see conml.types.Class#getPackage
	 * @model opposite="Package"
	 * @generated
	 */
	EList<conml.types.Class> getContainedClasses();

  /**
	 * Returns the value of the '<em><b>Enumerated Types</b></em>' reference list.
	 * The list contents are of type {@link conml.types.EnumeratedType}.
	 * It is bidirectional and its opposite is '{@link conml.types.EnumeratedType#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumerated Types</em>' reference list.
	 * @see conml.types.TypesPackage#getPackage_EnumeratedTypes()
	 * @see conml.types.EnumeratedType#getPackage
	 * @model opposite="Package"
	 * @generated
	 */
	EList<EnumeratedType> getEnumeratedTypes();

	/**
	 * Returns the value of the '<em><b>Sub Packages</b></em>' reference list.
	 * The list contents are of type {@link conml.types.Package}.
	 * It is bidirectional and its opposite is '{@link conml.types.Package#getContainerPackage <em>Container Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Packages</em>' reference list.
	 * @see conml.types.TypesPackage#getPackage_SubPackages()
	 * @see conml.types.Package#getContainerPackage
	 * @model opposite="ContainerPackage"
	 * @generated
	 */
	EList<Package> getSubPackages();

    /**
	 * Returns the value of the '<em><b>Container Package</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conml.types.Package#getSubPackages <em>Sub Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Package</em>' reference.
	 * @see #setContainerPackage(Package)
	 * @see conml.types.TypesPackage#getPackage_ContainerPackage()
	 * @see conml.types.Package#getSubPackages
	 * @model opposite="SubPackages"
	 * @generated
	 */
	Package getContainerPackage();

    /**
	 * Sets the value of the '{@link conml.types.Package#getContainerPackage <em>Container Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Package</em>' reference.
	 * @see #getContainerPackage()
	 * @generated
	 */
	void setContainerPackage(Package value);

  /**
	 * Returns the value of the '<em><b>Overall</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overall</em>' attribute.
	 * @see #setOverall(boolean)
	 * @see conml.types.TypesPackage#getPackage_Overall()
	 * @model default="false" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 * @generated
	 */
	boolean isOverall();

  /**
	 * Sets the value of the '{@link conml.types.Package#isOverall <em>Overall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overall</em>' attribute.
	 * @see #isOverall()
	 * @generated
	 */
	void setOverall(boolean value);

} // Package
