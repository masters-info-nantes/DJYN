/**
 */
package com.alma.djynx.usecase.useCase;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uses</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.alma.djynx.usecase.useCase.Uses#getName <em>Name</em>}</li>
 *   <li>{@link com.alma.djynx.usecase.useCase.Uses#getMultiplicity <em>Multiplicity</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.alma.djynx.usecase.useCase.UseCasePackage#getUses()
 * @model
 * @generated
 */
public interface Uses extends EObject
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
   * @see com.alma.djynx.usecase.useCase.UseCasePackage#getUses_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.alma.djynx.usecase.useCase.Uses#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Multiplicity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Multiplicity</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Multiplicity</em>' attribute.
   * @see #setMultiplicity(String)
   * @see com.alma.djynx.usecase.useCase.UseCasePackage#getUses_Multiplicity()
   * @model
   * @generated
   */
  String getMultiplicity();

  /**
   * Sets the value of the '{@link com.alma.djynx.usecase.useCase.Uses#getMultiplicity <em>Multiplicity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Multiplicity</em>' attribute.
   * @see #getMultiplicity()
   * @generated
   */
  void setMultiplicity(String value);

} // Uses
