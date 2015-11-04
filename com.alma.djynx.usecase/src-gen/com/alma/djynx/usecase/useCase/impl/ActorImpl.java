/**
 */
package com.alma.djynx.usecase.useCase.impl;

import com.alma.djynx.usecase.useCase.Actor;
import com.alma.djynx.usecase.useCase.Inheritance;
import com.alma.djynx.usecase.useCase.UseCasePackage;
import com.alma.djynx.usecase.useCase.Uses;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.alma.djynx.usecase.useCase.impl.ActorImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.alma.djynx.usecase.useCase.impl.ActorImpl#getInheritances <em>Inheritances</em>}</li>
 *   <li>{@link com.alma.djynx.usecase.useCase.impl.ActorImpl#getUses <em>Uses</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActorImpl extends MinimalEObjectImpl.Container implements Actor
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
   * The cached value of the '{@link #getInheritances() <em>Inheritances</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInheritances()
   * @generated
   * @ordered
   */
  protected EList<Inheritance> inheritances;

  /**
   * The cached value of the '{@link #getUses() <em>Uses</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUses()
   * @generated
   * @ordered
   */
  protected EList<Uses> uses;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActorImpl()
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
    return UseCasePackage.Literals.ACTOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UseCasePackage.ACTOR__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Inheritance> getInheritances()
  {
    if (inheritances == null)
    {
      inheritances = new EObjectContainmentEList<Inheritance>(Inheritance.class, this, UseCasePackage.ACTOR__INHERITANCES);
    }
    return inheritances;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Uses> getUses()
  {
    if (uses == null)
    {
      uses = new EObjectContainmentEList<Uses>(Uses.class, this, UseCasePackage.ACTOR__USES);
    }
    return uses;
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
      case UseCasePackage.ACTOR__INHERITANCES:
        return ((InternalEList<?>)getInheritances()).basicRemove(otherEnd, msgs);
      case UseCasePackage.ACTOR__USES:
        return ((InternalEList<?>)getUses()).basicRemove(otherEnd, msgs);
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
      case UseCasePackage.ACTOR__NAME:
        return getName();
      case UseCasePackage.ACTOR__INHERITANCES:
        return getInheritances();
      case UseCasePackage.ACTOR__USES:
        return getUses();
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
      case UseCasePackage.ACTOR__NAME:
        setName((String)newValue);
        return;
      case UseCasePackage.ACTOR__INHERITANCES:
        getInheritances().clear();
        getInheritances().addAll((Collection<? extends Inheritance>)newValue);
        return;
      case UseCasePackage.ACTOR__USES:
        getUses().clear();
        getUses().addAll((Collection<? extends Uses>)newValue);
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
      case UseCasePackage.ACTOR__NAME:
        setName(NAME_EDEFAULT);
        return;
      case UseCasePackage.ACTOR__INHERITANCES:
        getInheritances().clear();
        return;
      case UseCasePackage.ACTOR__USES:
        getUses().clear();
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
      case UseCasePackage.ACTOR__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case UseCasePackage.ACTOR__INHERITANCES:
        return inheritances != null && !inheritances.isEmpty();
      case UseCasePackage.ACTOR__USES:
        return uses != null && !uses.isEmpty();
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

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ActorImpl
