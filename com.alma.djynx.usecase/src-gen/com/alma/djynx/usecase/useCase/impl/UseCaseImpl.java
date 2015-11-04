/**
 */
package com.alma.djynx.usecase.useCase.impl;

import com.alma.djynx.usecase.useCase.Actor;
import com.alma.djynx.usecase.useCase.Subsystem;
import com.alma.djynx.usecase.useCase.UseCase;
import com.alma.djynx.usecase.useCase.UseCasePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Use Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.alma.djynx.usecase.useCase.impl.UseCaseImpl#getSystems <em>Systems</em>}</li>
 *   <li>{@link com.alma.djynx.usecase.useCase.impl.UseCaseImpl#getActors <em>Actors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UseCaseImpl extends MinimalEObjectImpl.Container implements UseCase
{
  /**
   * The cached value of the '{@link #getSystems() <em>Systems</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSystems()
   * @generated
   * @ordered
   */
  protected EList<Subsystem> systems;

  /**
   * The cached value of the '{@link #getActors() <em>Actors</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActors()
   * @generated
   * @ordered
   */
  protected EList<Actor> actors;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UseCaseImpl()
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
    return UseCasePackage.Literals.USE_CASE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Subsystem> getSystems()
  {
    if (systems == null)
    {
      systems = new EObjectContainmentEList<Subsystem>(Subsystem.class, this, UseCasePackage.USE_CASE__SYSTEMS);
    }
    return systems;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Actor> getActors()
  {
    if (actors == null)
    {
      actors = new EObjectContainmentEList<Actor>(Actor.class, this, UseCasePackage.USE_CASE__ACTORS);
    }
    return actors;
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
      case UseCasePackage.USE_CASE__SYSTEMS:
        return ((InternalEList<?>)getSystems()).basicRemove(otherEnd, msgs);
      case UseCasePackage.USE_CASE__ACTORS:
        return ((InternalEList<?>)getActors()).basicRemove(otherEnd, msgs);
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
      case UseCasePackage.USE_CASE__SYSTEMS:
        return getSystems();
      case UseCasePackage.USE_CASE__ACTORS:
        return getActors();
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
      case UseCasePackage.USE_CASE__SYSTEMS:
        getSystems().clear();
        getSystems().addAll((Collection<? extends Subsystem>)newValue);
        return;
      case UseCasePackage.USE_CASE__ACTORS:
        getActors().clear();
        getActors().addAll((Collection<? extends Actor>)newValue);
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
      case UseCasePackage.USE_CASE__SYSTEMS:
        getSystems().clear();
        return;
      case UseCasePackage.USE_CASE__ACTORS:
        getActors().clear();
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
      case UseCasePackage.USE_CASE__SYSTEMS:
        return systems != null && !systems.isEmpty();
      case UseCasePackage.USE_CASE__ACTORS:
        return actors != null && !actors.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //UseCaseImpl
