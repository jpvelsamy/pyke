/**
 * generated by Xtext 2.25.0
 */
package pazmysaz.pyke;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Report</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pazmysaz.pyke.Report#getName <em>Name</em>}</li>
 *   <li>{@link pazmysaz.pyke.Report#getSection <em>Section</em>}</li>
 * </ul>
 *
 * @see pazmysaz.pyke.PykePackage#getReport()
 * @model
 * @generated
 */
public interface Report extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see pazmysaz.pyke.PykePackage#getReport_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link pazmysaz.pyke.Report#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Section</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Section</em>' containment reference.
   * @see #setSection(Section)
   * @see pazmysaz.pyke.PykePackage#getReport_Section()
   * @model containment="true"
   * @generated
   */
  Section getSection();

  /**
   * Sets the value of the '{@link pazmysaz.pyke.Report#getSection <em>Section</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Section</em>' containment reference.
   * @see #getSection()
   * @generated
   */
  void setSection(Section value);

} // Report
