/**
 */
package com.alma.djynx.usecase.useCase;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.alma.djynx.usecase.useCase.Actor#getName <em>Name</em>}</li>
 *   <li>{@link com.alma.djynx.usecase.useCase.Actor#getInheritances <em>Inheritances</em>}</li>
 *   <li>{@link com.alma.djynx.usecase.useCase.Actor#getUses <em>Uses</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.alma.djynx.usecase.useCase.UseCasePackage#getActor()
 * @model
 * @generated
 */
public interface Actor extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.alma.djynx.usecase.useCase.UseCasePackage#getActor_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.alma.djynx.usecase.useCase.Actor#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Inheritances</b></em>' containment reference list.
   * The list contents are of type {@link com.alma.djynx.usecase.useCase.Inheritance}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inheritances</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inheritances</em>' containment reference list.
   * @see com.alma.djynx.usecase.useCase.UseCasePackage#getActor_Inheritances()
   * @model containment="true"
   * @generated
   */
  EList<Inheritance> getInheritances();

  /**
   * Returns the value of the '<em><b>Uses</b></em>' containment reference list.
   * The list contents are of type {@link com.alma.djynx.usecase.useCase.Uses}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Uses</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Uses</em>' containment reference list.
   * @see com.alma.djynx.usecase.useCase.UseCasePackage#getActor_Uses()
   * @model containment="true"
   * @generated
   */
  EList<Uses> getUses();

} // Actor
