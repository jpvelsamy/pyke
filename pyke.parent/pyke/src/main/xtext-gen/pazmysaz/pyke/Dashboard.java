/**
 * generated by Xtext 2.25.0
 */
package pazmysaz.pyke;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dashboard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pazmysaz.pyke.Dashboard#getName <em>Name</em>}</li>
 *   <li>{@link pazmysaz.pyke.Dashboard#getIdentity <em>Identity</em>}</li>
 *   <li>{@link pazmysaz.pyke.Dashboard#getLabelSummary <em>Label Summary</em>}</li>
 *   <li>{@link pazmysaz.pyke.Dashboard#isDistributionSummary <em>Distribution Summary</em>}</li>
 *   <li>{@link pazmysaz.pyke.Dashboard#isTrendSummary <em>Trend Summary</em>}</li>
 *   <li>{@link pazmysaz.pyke.Dashboard#getReport <em>Report</em>}</li>
 * </ul>
 *
 * @see pazmysaz.pyke.PykePackage#getDashboard()
 * @model
 * @generated
 */
public interface Dashboard extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see pazmysaz.pyke.PykePackage#getDashboard_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link pazmysaz.pyke.Dashboard#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Identity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identity</em>' containment reference.
   * @see #setIdentity(Identity)
   * @see pazmysaz.pyke.PykePackage#getDashboard_Identity()
   * @model containment="true"
   * @generated
   */
  Identity getIdentity();

  /**
   * Sets the value of the '{@link pazmysaz.pyke.Dashboard#getIdentity <em>Identity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identity</em>' containment reference.
   * @see #getIdentity()
   * @generated
   */
  void setIdentity(Identity value);

  /**
   * Returns the value of the '<em><b>Label Summary</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label Summary</em>' containment reference.
   * @see #setLabelSummary(LabelSummary)
   * @see pazmysaz.pyke.PykePackage#getDashboard_LabelSummary()
   * @model containment="true"
   * @generated
   */
  LabelSummary getLabelSummary();

  /**
   * Sets the value of the '{@link pazmysaz.pyke.Dashboard#getLabelSummary <em>Label Summary</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label Summary</em>' containment reference.
   * @see #getLabelSummary()
   * @generated
   */
  void setLabelSummary(LabelSummary value);

  /**
   * Returns the value of the '<em><b>Distribution Summary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Distribution Summary</em>' attribute.
   * @see #setDistributionSummary(boolean)
   * @see pazmysaz.pyke.PykePackage#getDashboard_DistributionSummary()
   * @model
   * @generated
   */
  boolean isDistributionSummary();

  /**
   * Sets the value of the '{@link pazmysaz.pyke.Dashboard#isDistributionSummary <em>Distribution Summary</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Distribution Summary</em>' attribute.
   * @see #isDistributionSummary()
   * @generated
   */
  void setDistributionSummary(boolean value);

  /**
   * Returns the value of the '<em><b>Trend Summary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trend Summary</em>' attribute.
   * @see #setTrendSummary(boolean)
   * @see pazmysaz.pyke.PykePackage#getDashboard_TrendSummary()
   * @model
   * @generated
   */
  boolean isTrendSummary();

  /**
   * Sets the value of the '{@link pazmysaz.pyke.Dashboard#isTrendSummary <em>Trend Summary</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Trend Summary</em>' attribute.
   * @see #isTrendSummary()
   * @generated
   */
  void setTrendSummary(boolean value);

  /**
   * Returns the value of the '<em><b>Report</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Report</em>' containment reference.
   * @see #setReport(Report)
   * @see pazmysaz.pyke.PykePackage#getDashboard_Report()
   * @model containment="true"
   * @generated
   */
  Report getReport();

  /**
   * Sets the value of the '{@link pazmysaz.pyke.Dashboard#getReport <em>Report</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Report</em>' containment reference.
   * @see #getReport()
   * @generated
   */
  void setReport(Report value);

} // Dashboard