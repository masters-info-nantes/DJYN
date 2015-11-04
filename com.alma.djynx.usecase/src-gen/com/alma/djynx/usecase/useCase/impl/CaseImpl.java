/**
 */
package com.alma.djynx.usecase.useCase.impl;

import com.alma.djynx.usecase.useCase.Case;
import com.alma.djynx.usecase.useCase.Extends;
import com.alma.djynx.usecase.useCase.ExtensionPoint;
import com.alma.djynx.usecase.useCase.Includes;
import com.alma.djynx.usecase.useCase.UseCasePackage;

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
 * An implementation of the model object '<em><b>Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.alma.djynx.usecase.useCase.impl.CaseImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.alma.djynx.usecase.useCase.impl.CaseImpl#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link com.alma.djynx.usecase.useCase.impl.CaseImpl#getIncludes <em>Includes</em>}</li>
 *   <li>{@link com.alma.djynx.usecase.useCase.impl.CaseImpl#getExtends <em>Extends</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CaseImpl extends MinimalEObjectImpl.Container implements Case
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
   * The cached value of the '{@link #getExtensions() <em>Extensions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtensions()
   * @generated
   * @ordered
   */
  protected EList<ExtensionPoint> extensions;

  /**
   * The cached value of the '{@link #getIncludes() <em>Includes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncludes()
   * @generated
   * @ordered
   */
  protected EList<Includes> includes;

  /**
   * The cached value of the '{@link #getExtends() <em>Extends</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtends()
   * @generated
   * @ordered
   */
  protected EList<Extends> extends_;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CaseImpl()
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
    return UseCasePackage.Literals.CASE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, UseCasePackage.CASE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ExtensionPoint> getExtensions()
  {
    if (extensions == null)
    {
      extensions = new EObjectContainmentEList<ExtensionPoint>(ExtensionPoint.class, this, UseCasePackage.CASE__EXTENSIONS);
    }
    return extensions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Includes> getIncludes()
  {
    if (includes == null)
    {
      includes = new EObjectContainmentEList<Includes>(Includes.class, this, UseCasePackage.CASE__INCLUDES);
    }
    return includes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Extends> getExtends()
  {
    if (extends_ == null)
    {
      extends_ = new EObjectContainmentEList<Extends>(Extends.class, this, UseCasePackage.CASE__EXTENDS);
    }
    return extends_;
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
      case UseCasePackage.CASE__EXTENSIONS:
        return ((InternalEList<?>)getExtensions()).basicRemove(otherEnd, msgs);
      case UseCasePackage.CASE__INCLUDES:
        return ((InternalEList<?>)getIncludes()).basicRemove(otherEnd, msgs);
      case UseCasePackage.CASE__EXTENDS:
        return ((InternalEList<?>)getExtends()).basicRemove(otherEnd, msgs);
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
      case UseCasePackage.CASE__NAME:
        return getName();
      case UseCasePackage.CASE__EXTENSIONS:
        return getExtensions();
      case UseCasePackage.CASE__INCLUDES:
        return getIncludes();
      case UseCasePackage.CASE__EXTENDS:
        return getExtends();
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
      case UseCasePackage.CASE__NAME:
        setName((String)newValue);
        return;
      case UseCasePackage.CASE__EXTENSIONS:
        getExtensions().clear();
        getExtensions().addAll((Collection<? extends ExtensionPoint>)newValue);
        return;
      case UseCasePackage.CASE__INCLUDES:
        getIncludes().clear();
        getIncludes().addAll((Collection<? extends Includes>)newValue);
        return;
      case UseCasePackage.CASE__EXTENDS:
        getExtends().clear();
        getExtends().addAll((Collection<? extends Extends>)newValue);
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
      case UseCasePackage.CASE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case UseCasePackage.CASE__EXTENSIONS:
        getExtensions().clear();
        return;
      case UseCasePackage.CASE__INCLUDES:
        getIncludes().clear();
        return;
      case UseCasePackage.CASE__EXTENDS:
        getExtends().clear();
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
      case UseCasePackage.CASE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case UseCasePackage.CASE__EXTENSIONS:
        return extensions != null && !extensions.isEmpty();
      case UseCasePackage.CASE__INCLUDES:
        return includes != null && !includes.isEmpty();
      case UseCasePackage.CASE__EXTENDS:
        return extends_ != null && !extends_.isEmpty();
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

} //CaseImpl
