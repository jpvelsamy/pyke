/**
 * generated by Xtext 2.25.0
 */
package pazmysaz.pyke.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pazmysaz.pyke.Identity;
import pazmysaz.pyke.PykePackage;
import pazmysaz.pyke.Section;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Identity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pazmysaz.pyke.impl.IdentityImpl#getName <em>Name</em>}</li>
 *   <li>{@link pazmysaz.pyke.impl.IdentityImpl#getLhs <em>Lhs</em>}</li>
 *   <li>{@link pazmysaz.pyke.impl.IdentityImpl#getMhs <em>Mhs</em>}</li>
 *   <li>{@link pazmysaz.pyke.impl.IdentityImpl#getRhs <em>Rhs</em>}</li>
 *   <li>{@link pazmysaz.pyke.impl.IdentityImpl#getEdge <em>Edge</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IdentityImpl extends MinimalEObjectImpl.Container implements Identity
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getLhs() <em>Lhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLhs()
   * @generated
   * @ordered
   */
  protected Section lhs;

  /**
   * The cached value of the '{@link #getMhs() <em>Mhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMhs()
   * @generated
   * @ordered
   */
  protected Section mhs;

  /**
   * The cached value of the '{@link #getRhs() <em>Rhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRhs()
   * @generated
   * @ordered
   */
  protected Section rhs;

  /**
   * The cached value of the '{@link #getEdge() <em>Edge</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEdge()
   * @generated
   * @ordered
   */
  protected EList<Section> edge;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IdentityImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PykePackage.Literals.IDENTITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PykePackage.IDENTITY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Section getLhs()
  {
    return lhs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLhs(Section newLhs, NotificationChain msgs)
  {
    Section oldLhs = lhs;
    lhs = newLhs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PykePackage.IDENTITY__LHS, oldLhs, newLhs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLhs(Section newLhs)
  {
    if (newLhs != lhs)
    {
      NotificationChain msgs = null;
      if (lhs != null)
        msgs = ((InternalEObject)lhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PykePackage.IDENTITY__LHS, null, msgs);
      if (newLhs != null)
        msgs = ((InternalEObject)newLhs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PykePackage.IDENTITY__LHS, null, msgs);
      msgs = basicSetLhs(newLhs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PykePackage.IDENTITY__LHS, newLhs, newLhs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Section getMhs()
  {
    return mhs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMhs(Section newMhs, NotificationChain msgs)
  {
    Section oldMhs = mhs;
    mhs = newMhs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PykePackage.IDENTITY__MHS, oldMhs, newMhs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMhs(Section newMhs)
  {
    if (newMhs != mhs)
    {
      NotificationChain msgs = null;
      if (mhs != null)
        msgs = ((InternalEObject)mhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PykePackage.IDENTITY__MHS, null, msgs);
      if (newMhs != null)
        msgs = ((InternalEObject)newMhs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PykePackage.IDENTITY__MHS, null, msgs);
      msgs = basicSetMhs(newMhs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PykePackage.IDENTITY__MHS, newMhs, newMhs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Section getRhs()
  {
    return rhs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRhs(Section newRhs, NotificationChain msgs)
  {
    Section oldRhs = rhs;
    rhs = newRhs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PykePackage.IDENTITY__RHS, oldRhs, newRhs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRhs(Section newRhs)
  {
    if (newRhs != rhs)
    {
      NotificationChain msgs = null;
      if (rhs != null)
        msgs = ((InternalEObject)rhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PykePackage.IDENTITY__RHS, null, msgs);
      if (newRhs != null)
        msgs = ((InternalEObject)newRhs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PykePackage.IDENTITY__RHS, null, msgs);
      msgs = basicSetRhs(newRhs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PykePackage.IDENTITY__RHS, newRhs, newRhs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Section> getEdge()
  {
    if (edge == null)
    {
      edge = new EObjectContainmentEList<Section>(Section.class, this, PykePackage.IDENTITY__EDGE);
    }
    return edge;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PykePackage.IDENTITY__LHS:
        return basicSetLhs(null, msgs);
      case PykePackage.IDENTITY__MHS:
        return basicSetMhs(null, msgs);
      case PykePackage.IDENTITY__RHS:
        return basicSetRhs(null, msgs);
      case PykePackage.IDENTITY__EDGE:
        return ((InternalEList<?>)getEdge()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PykePackage.IDENTITY__NAME:
        return getName();
      case PykePackage.IDENTITY__LHS:
        return getLhs();
      case PykePackage.IDENTITY__MHS:
        return getMhs();
      case PykePackage.IDENTITY__RHS:
        return getRhs();
      case PykePackage.IDENTITY__EDGE:
        return getEdge();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PykePackage.IDENTITY__NAME:
        setName((String)newValue);
        return;
      case PykePackage.IDENTITY__LHS:
        setLhs((Section)newValue);
        return;
      case PykePackage.IDENTITY__MHS:
        setMhs((Section)newValue);
        return;
      case PykePackage.IDENTITY__RHS:
        setRhs((Section)newValue);
        return;
      case PykePackage.IDENTITY__EDGE:
        getEdge().clear();
        getEdge().addAll((Collection<? extends Section>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PykePackage.IDENTITY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PykePackage.IDENTITY__LHS:
        setLhs((Section)null);
        return;
      case PykePackage.IDENTITY__MHS:
        setMhs((Section)null);
        return;
      case PykePackage.IDENTITY__RHS:
        setRhs((Section)null);
        return;
      case PykePackage.IDENTITY__EDGE:
        getEdge().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PykePackage.IDENTITY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PykePackage.IDENTITY__LHS:
        return lhs != null;
      case PykePackage.IDENTITY__MHS:
        return mhs != null;
      case PykePackage.IDENTITY__RHS:
        return rhs != null;
      case PykePackage.IDENTITY__EDGE:
        return edge != null && !edge.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //IdentityImpl
