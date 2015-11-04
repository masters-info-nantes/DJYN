/**
 */
package com.alma.djynx.usecase.useCase;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.alma.djynx.usecase.useCase.UseCasePackage
 * @generated
 */
public interface UseCaseFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  UseCaseFactory eINSTANCE = com.alma.djynx.usecase.useCase.impl.UseCaseFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Use Case</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Use Case</em>'.
   * @generated
   */
  UseCase createUseCase();

  /**
   * Returns a new object of class '<em>Subsystem</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Subsystem</em>'.
   * @generated
   */
  Subsystem createSubsystem();

  /**
   * Returns a new object of class '<em>Case</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Case</em>'.
   * @generated
   */
  Case createCase();

  /**
   * Returns a new object of class '<em>Extension Point</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Extension Point</em>'.
   * @generated
   */
  ExtensionPoint createExtensionPoint();

  /**
   * Returns a new object of class '<em>Includes</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Includes</em>'.
   * @generated
   */
  Includes createIncludes();

  /**
   * Returns a new object of class '<em>Extends</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Extends</em>'.
   * @generated
   */
  Extends createExtends();

  /**
   * Returns a new object of class '<em>Actor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Actor</em>'.
   * @generated
   */
  Actor createActor();

  /**
   * Returns a new object of class '<em>Inheritance</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Inheritance</em>'.
   * @generated
   */
  Inheritance createInheritance();

  /**
   * Returns a new object of class '<em>Uses</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Uses</em>'.
   * @generated
   */
  Uses createUses();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  UseCasePackage getUseCasePackage();

} //UseCaseFactory
