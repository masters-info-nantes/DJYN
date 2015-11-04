/**
 */
package com.alma.djynx.usecase.useCase;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.alma.djynx.usecase.useCase.Case#getName <em>Name</em>}</li>
 *   <li>{@link com.alma.djynx.usecase.useCase.Case#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link com.alma.djynx.usecase.useCase.Case#getIncludes <em>Includes</em>}</li>
 *   <li>{@link com.alma.djynx.usecase.useCase.Case#getExtends <em>Extends</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.alma.djynx.usecase.useCase.UseCasePackage#getCase()
 * @model
 * @generated
 */
public interface Case extends EObject
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
   * @see com.alma.djynx.usecase.useCase.UseCasePackage#getCase_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.alma.djynx.usecase.useCase.Case#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Extensions</b></em>' containment reference list.
   * The list contents are of type {@link com.alma.djynx.usecase.useCase.ExtensionPoint}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extensions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extensions</em>' containment reference list.
   * @see com.alma.djynx.usecase.useCase.UseCasePackage#getCase_Extensions()
   * @model containment="true"
   * @generated
   */
  EList<ExtensionPoint> getExtensions();

  /**
   * Returns the value of the '<em><b>Includes</b></em>' containment reference list.
   * The list contents are of type {@link com.alma.djynx.usecase.useCase.Includes}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Includes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Includes</em>' containment reference list.
   * @see com.alma.djynx.usecase.useCase.UseCasePackage#getCase_Includes()
   * @model containment="true"
   * @generated
   */
  EList<Includes> getIncludes();

  /**
   * Returns the value of the '<em><b>Extends</b></em>' containment reference list.
   * The list contents are of type {@link com.alma.djynx.usecase.useCase.Extends}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extends</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extends</em>' containment reference list.
   * @see com.alma.djynx.usecase.useCase.UseCasePackage#getCase_Extends()
   * @model containment="true"
   * @generated
   */
  EList<Extends> getExtends();

} // Case
