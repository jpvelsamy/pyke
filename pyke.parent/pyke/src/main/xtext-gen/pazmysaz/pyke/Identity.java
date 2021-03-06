/**
 * generated by Xtext 2.25.0
 */
package pazmysaz.pyke;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pazmysaz.pyke.Identity#getName <em>Name</em>}</li>
 *   <li>{@link pazmysaz.pyke.Identity#getLhs <em>Lhs</em>}</li>
 *   <li>{@link pazmysaz.pyke.Identity#getMhs <em>Mhs</em>}</li>
 *   <li>{@link pazmysaz.pyke.Identity#getRhs <em>Rhs</em>}</li>
 *   <li>{@link pazmysaz.pyke.Identity#getEdge <em>Edge</em>}</li>
 * </ul>
 *
 * @see pazmysaz.pyke.PykePackage#getIdentity()
 * @model
 * @generated
 */
public interface Identity extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see pazmysaz.pyke.PykePackage#getIdentity_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link pazmysaz.pyke.Identity#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lhs</em>' containment reference.
   * @see #setLhs(Section)
   * @see pazmysaz.pyke.PykePackage#getIdentity_Lhs()
   * @model containment="true"
   * @generated
   */
  Section getLhs();

  /**
   * Sets the value of the '{@link pazmysaz.pyke.Identity#getLhs <em>Lhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lhs</em>' containment reference.
   * @see #getLhs()
   * @generated
   */
  void setLhs(Section value);

  /**
   * Returns the value of the '<em><b>Mhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mhs</em>' containment reference.
   * @see #setMhs(Section)
   * @see pazmysaz.pyke.PykePackage#getIdentity_Mhs()
   * @model containment="true"
   * @generated
   */
  Section getMhs();

  /**
   * Sets the value of the '{@link pazmysaz.pyke.Identity#getMhs <em>Mhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mhs</em>' containment reference.
   * @see #getMhs()
   * @generated
   */
  void setMhs(Section value);

  /**
   * Returns the value of the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rhs</em>' containment reference.
   * @see #setRhs(Section)
   * @see pazmysaz.pyke.PykePackage#getIdentity_Rhs()
   * @model containment="true"
   * @generated
   */
  Section getRhs();

  /**
   * Sets the value of the '{@link pazmysaz.pyke.Identity#getRhs <em>Rhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rhs</em>' containment reference.
   * @see #getRhs()
   * @generated
   */
  void setRhs(Section value);

  /**
   * Returns the value of the '<em><b>Edge</b></em>' containment reference list.
   * The list contents are of type {@link pazmysaz.pyke.Section}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Edge</em>' containment reference list.
   * @see pazmysaz.pyke.PykePackage#getIdentity_Edge()
   * @model containment="true"
   * @generated
   */
  EList<Section> getEdge();

} // Identity
