/**
 */
package com.alma.djynx.usecase.useCase;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.alma.djynx.usecase.useCase.UseCase#getSystems <em>Systems</em>}</li>
 *   <li>{@link com.alma.djynx.usecase.useCase.UseCase#getActors <em>Actors</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.alma.djynx.usecase.useCase.UseCasePackage#getUseCase()
 * @model
 * @generated
 */
public interface UseCase extends EObject
{
  /**
   * Returns the value of the '<em><b>Systems</b></em>' containment reference list.
   * The list contents are of type {@link com.alma.djynx.usecase.useCase.Subsystem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Systems</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Systems</em>' containment reference list.
   * @see com.alma.djynx.usecase.useCase.UseCasePackage#getUseCase_Systems()
   * @model containment="true"
   * @generated
   */
  EList<Subsystem> getSystems();

  /**
   * Returns the value of the '<em><b>Actors</b></em>' containment reference list.
   * The list contents are of type {@link com.alma.djynx.usecase.useCase.Actor}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actors</em>' containment reference list.
   * @see com.alma.djynx.usecase.useCase.UseCasePackage#getUseCase_Actors()
   * @model containment="true"
   * @generated
   */
  EList<Actor> getActors();

} // UseCase
