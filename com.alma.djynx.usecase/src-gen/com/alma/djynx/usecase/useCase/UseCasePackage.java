/**
 */
package com.alma.djynx.usecase.useCase;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.alma.djynx.usecase.useCase.UseCaseFactory
 * @model kind="package"
 * @generated
 */
public interface UseCasePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "useCase";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.alma.com/djynx/usecase/UseCase";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "useCase";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  UseCasePackage eINSTANCE = com.alma.djynx.usecase.useCase.impl.UseCasePackageImpl.init();

  /**
   * The meta object id for the '{@link com.alma.djynx.usecase.useCase.impl.UseCaseImpl <em>Use Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.alma.djynx.usecase.useCase.impl.UseCaseImpl
   * @see com.alma.djynx.usecase.useCase.impl.UseCasePackageImpl#getUseCase()
   * @generated
   */
  int USE_CASE = 0;

  /**
   * The feature id for the '<em><b>Systems</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE__SYSTEMS = 0;

  /**
   * The feature id for the '<em><b>Actors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE__ACTORS = 1;

  /**
   * The number of structural features of the '<em>Use Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.alma.djynx.usecase.useCase.impl.SubsystemImpl <em>Subsystem</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.alma.djynx.usecase.useCase.impl.SubsystemImpl
   * @see com.alma.djynx.usecase.useCase.impl.UseCasePackageImpl#getSubsystem()
   * @generated
   */
  int SUBSYSTEM = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSYSTEM__NAME = 0;

  /**
   * The feature id for the '<em><b>Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSYSTEM__CASES = 1;

  /**
   * The number of structural features of the '<em>Subsystem</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSYSTEM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.alma.djynx.usecase.useCase.impl.CaseImpl <em>Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.alma.djynx.usecase.useCase.impl.CaseImpl
   * @see com.alma.djynx.usecase.useCase.impl.UseCasePackageImpl#getCase()
   * @generated
   */
  int CASE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE__NAME = 0;

  /**
   * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE__EXTENSIONS = 1;

  /**
   * The feature id for the '<em><b>Includes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE__INCLUDES = 2;

  /**
   * The feature id for the '<em><b>Extends</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE__EXTENDS = 3;

  /**
   * The number of structural features of the '<em>Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link com.alma.djynx.usecase.useCase.impl.ExtensionPointImpl <em>Extension Point</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.alma.djynx.usecase.useCase.impl.ExtensionPointImpl
   * @see com.alma.djynx.usecase.useCase.impl.UseCasePackageImpl#getExtensionPoint()
   * @generated
   */
  int EXTENSION_POINT = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENSION_POINT__NAME = 0;

  /**
   * The number of structural features of the '<em>Extension Point</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENSION_POINT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.alma.djynx.usecase.useCase.impl.IncludesImpl <em>Includes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.alma.djynx.usecase.useCase.impl.IncludesImpl
   * @see com.alma.djynx.usecase.useCase.impl.UseCasePackageImpl#getIncludes()
   * @generated
   */
  int INCLUDES = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDES__NAME = 0;

  /**
   * The feature id for the '<em><b>Rules</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDES__RULES = 1;

  /**
   * The number of structural features of the '<em>Includes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDES_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.alma.djynx.usecase.useCase.impl.ExtendsImpl <em>Extends</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.alma.djynx.usecase.useCase.impl.ExtendsImpl
   * @see com.alma.djynx.usecase.useCase.impl.UseCasePackageImpl#getExtends()
   * @generated
   */
  int EXTENDS = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDS__NAME = 0;

  /**
   * The feature id for the '<em><b>Rules</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDS__RULES = 1;

  /**
   * The number of structural features of the '<em>Extends</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.alma.djynx.usecase.useCase.impl.ActorImpl <em>Actor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.alma.djynx.usecase.useCase.impl.ActorImpl
   * @see com.alma.djynx.usecase.useCase.impl.UseCasePackageImpl#getActor()
   * @generated
   */
  int ACTOR = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR__NAME = 0;

  /**
   * The feature id for the '<em><b>Inheritances</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR__INHERITANCES = 1;

  /**
   * The feature id for the '<em><b>Uses</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR__USES = 2;

  /**
   * The number of structural features of the '<em>Actor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.alma.djynx.usecase.useCase.impl.InheritanceImpl <em>Inheritance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.alma.djynx.usecase.useCase.impl.InheritanceImpl
   * @see com.alma.djynx.usecase.useCase.impl.UseCasePackageImpl#getInheritance()
   * @generated
   */
  int INHERITANCE = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INHERITANCE__NAME = 0;

  /**
   * The number of structural features of the '<em>Inheritance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INHERITANCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.alma.djynx.usecase.useCase.impl.UsesImpl <em>Uses</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.alma.djynx.usecase.useCase.impl.UsesImpl
   * @see com.alma.djynx.usecase.useCase.impl.UseCasePackageImpl#getUses()
   * @generated
   */
  int USES = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USES__NAME = 0;

  /**
   * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USES__MULTIPLICITY = 1;

  /**
   * The number of structural features of the '<em>Uses</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USES_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link com.alma.djynx.usecase.useCase.UseCase <em>Use Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Use Case</em>'.
   * @see com.alma.djynx.usecase.useCase.UseCase
   * @generated
   */
  EClass getUseCase();

  /**
   * Returns the meta object for the containment reference list '{@link com.alma.djynx.usecase.useCase.UseCase#getSystems <em>Systems</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Systems</em>'.
   * @see com.alma.djynx.usecase.useCase.UseCase#getSystems()
   * @see #getUseCase()
   * @generated
   */
  EReference getUseCase_Systems();

  /**
   * Returns the meta object for the containment reference list '{@link com.alma.djynx.usecase.useCase.UseCase#getActors <em>Actors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actors</em>'.
   * @see com.alma.djynx.usecase.useCase.UseCase#getActors()
   * @see #getUseCase()
   * @generated
   */
  EReference getUseCase_Actors();

  /**
   * Returns the meta object for class '{@link com.alma.djynx.usecase.useCase.Subsystem <em>Subsystem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Subsystem</em>'.
   * @see com.alma.djynx.usecase.useCase.Subsystem
   * @generated
   */
  EClass getSubsystem();

  /**
   * Returns the meta object for the attribute '{@link com.alma.djynx.usecase.useCase.Subsystem#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.alma.djynx.usecase.useCase.Subsystem#getName()
   * @see #getSubsystem()
   * @generated
   */
  EAttribute getSubsystem_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.alma.djynx.usecase.useCase.Subsystem#getCases <em>Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cases</em>'.
   * @see com.alma.djynx.usecase.useCase.Subsystem#getCases()
   * @see #getSubsystem()
   * @generated
   */
  EReference getSubsystem_Cases();

  /**
   * Returns the meta object for class '{@link com.alma.djynx.usecase.useCase.Case <em>Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Case</em>'.
   * @see com.alma.djynx.usecase.useCase.Case
   * @generated
   */
  EClass getCase();

  /**
   * Returns the meta object for the attribute '{@link com.alma.djynx.usecase.useCase.Case#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.alma.djynx.usecase.useCase.Case#getName()
   * @see #getCase()
   * @generated
   */
  EAttribute getCase_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.alma.djynx.usecase.useCase.Case#getExtensions <em>Extensions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Extensions</em>'.
   * @see com.alma.djynx.usecase.useCase.Case#getExtensions()
   * @see #getCase()
   * @generated
   */
  EReference getCase_Extensions();

  /**
   * Returns the meta object for the containment reference list '{@link com.alma.djynx.usecase.useCase.Case#getIncludes <em>Includes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Includes</em>'.
   * @see com.alma.djynx.usecase.useCase.Case#getIncludes()
   * @see #getCase()
   * @generated
   */
  EReference getCase_Includes();

  /**
   * Returns the meta object for the containment reference list '{@link com.alma.djynx.usecase.useCase.Case#getExtends <em>Extends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Extends</em>'.
   * @see com.alma.djynx.usecase.useCase.Case#getExtends()
   * @see #getCase()
   * @generated
   */
  EReference getCase_Extends();

  /**
   * Returns the meta object for class '{@link com.alma.djynx.usecase.useCase.ExtensionPoint <em>Extension Point</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Extension Point</em>'.
   * @see com.alma.djynx.usecase.useCase.ExtensionPoint
   * @generated
   */
  EClass getExtensionPoint();

  /**
   * Returns the meta object for the attribute '{@link com.alma.djynx.usecase.useCase.ExtensionPoint#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.alma.djynx.usecase.useCase.ExtensionPoint#getName()
   * @see #getExtensionPoint()
   * @generated
   */
  EAttribute getExtensionPoint_Name();

  /**
   * Returns the meta object for class '{@link com.alma.djynx.usecase.useCase.Includes <em>Includes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Includes</em>'.
   * @see com.alma.djynx.usecase.useCase.Includes
   * @generated
   */
  EClass getIncludes();

  /**
   * Returns the meta object for the attribute '{@link com.alma.djynx.usecase.useCase.Includes#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.alma.djynx.usecase.useCase.Includes#getName()
   * @see #getIncludes()
   * @generated
   */
  EAttribute getIncludes_Name();

  /**
   * Returns the meta object for the attribute list '{@link com.alma.djynx.usecase.useCase.Includes#getRules <em>Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Rules</em>'.
   * @see com.alma.djynx.usecase.useCase.Includes#getRules()
   * @see #getIncludes()
   * @generated
   */
  EAttribute getIncludes_Rules();

  /**
   * Returns the meta object for class '{@link com.alma.djynx.usecase.useCase.Extends <em>Extends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Extends</em>'.
   * @see com.alma.djynx.usecase.useCase.Extends
   * @generated
   */
  EClass getExtends();

  /**
   * Returns the meta object for the attribute '{@link com.alma.djynx.usecase.useCase.Extends#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.alma.djynx.usecase.useCase.Extends#getName()
   * @see #getExtends()
   * @generated
   */
  EAttribute getExtends_Name();

  /**
   * Returns the meta object for the attribute list '{@link com.alma.djynx.usecase.useCase.Extends#getRules <em>Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Rules</em>'.
   * @see com.alma.djynx.usecase.useCase.Extends#getRules()
   * @see #getExtends()
   * @generated
   */
  EAttribute getExtends_Rules();

  /**
   * Returns the meta object for class '{@link com.alma.djynx.usecase.useCase.Actor <em>Actor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Actor</em>'.
   * @see com.alma.djynx.usecase.useCase.Actor
   * @generated
   */
  EClass getActor();

  /**
   * Returns the meta object for the attribute '{@link com.alma.djynx.usecase.useCase.Actor#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.alma.djynx.usecase.useCase.Actor#getName()
   * @see #getActor()
   * @generated
   */
  EAttribute getActor_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.alma.djynx.usecase.useCase.Actor#getInheritances <em>Inheritances</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Inheritances</em>'.
   * @see com.alma.djynx.usecase.useCase.Actor#getInheritances()
   * @see #getActor()
   * @generated
   */
  EReference getActor_Inheritances();

  /**
   * Returns the meta object for the containment reference list '{@link com.alma.djynx.usecase.useCase.Actor#getUses <em>Uses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Uses</em>'.
   * @see com.alma.djynx.usecase.useCase.Actor#getUses()
   * @see #getActor()
   * @generated
   */
  EReference getActor_Uses();

  /**
   * Returns the meta object for class '{@link com.alma.djynx.usecase.useCase.Inheritance <em>Inheritance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inheritance</em>'.
   * @see com.alma.djynx.usecase.useCase.Inheritance
   * @generated
   */
  EClass getInheritance();

  /**
   * Returns the meta object for the attribute '{@link com.alma.djynx.usecase.useCase.Inheritance#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.alma.djynx.usecase.useCase.Inheritance#getName()
   * @see #getInheritance()
   * @generated
   */
  EAttribute getInheritance_Name();

  /**
   * Returns the meta object for class '{@link com.alma.djynx.usecase.useCase.Uses <em>Uses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Uses</em>'.
   * @see com.alma.djynx.usecase.useCase.Uses
   * @generated
   */
  EClass getUses();

  /**
   * Returns the meta object for the attribute '{@link com.alma.djynx.usecase.useCase.Uses#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.alma.djynx.usecase.useCase.Uses#getName()
   * @see #getUses()
   * @generated
   */
  EAttribute getUses_Name();

  /**
   * Returns the meta object for the attribute '{@link com.alma.djynx.usecase.useCase.Uses#getMultiplicity <em>Multiplicity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Multiplicity</em>'.
   * @see com.alma.djynx.usecase.useCase.Uses#getMultiplicity()
   * @see #getUses()
   * @generated
   */
  EAttribute getUses_Multiplicity();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  UseCaseFactory getUseCaseFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.alma.djynx.usecase.useCase.impl.UseCaseImpl <em>Use Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.alma.djynx.usecase.useCase.impl.UseCaseImpl
     * @see com.alma.djynx.usecase.useCase.impl.UseCasePackageImpl#getUseCase()
     * @generated
     */
    EClass USE_CASE = eINSTANCE.getUseCase();

    /**
     * The meta object literal for the '<em><b>Systems</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USE_CASE__SYSTEMS = eINSTANCE.getUseCase_Systems();

    /**
     * The meta object literal for the '<em><b>Actors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USE_CASE__ACTORS = eINSTANCE.getUseCase_Actors();

    /**
     * The meta object literal for the '{@link com.alma.djynx.usecase.useCase.impl.SubsystemImpl <em>Subsystem</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.alma.djynx.usecase.useCase.impl.SubsystemImpl
     * @see com.alma.djynx.usecase.useCase.impl.UseCasePackageImpl#getSubsystem()
     * @generated
     */
    EClass SUBSYSTEM = eINSTANCE.getSubsystem();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUBSYSTEM__NAME = eINSTANCE.getSubsystem_Name();

    /**
     * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUBSYSTEM__CASES = eINSTANCE.getSubsystem_Cases();

    /**
     * The meta object literal for the '{@link com.alma.djynx.usecase.useCase.impl.CaseImpl <em>Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.alma.djynx.usecase.useCase.impl.CaseImpl
     * @see com.alma.djynx.usecase.useCase.impl.UseCasePackageImpl#getCase()
     * @generated
     */
    EClass CASE = eINSTANCE.getCase();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CASE__NAME = eINSTANCE.getCase_Name();

    /**
     * The meta object literal for the '<em><b>Extensions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE__EXTENSIONS = eINSTANCE.getCase_Extensions();

    /**
     * The meta object literal for the '<em><b>Includes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE__INCLUDES = eINSTANCE.getCase_Includes();

    /**
     * The meta object literal for the '<em><b>Extends</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE__EXTENDS = eINSTANCE.getCase_Extends();

    /**
     * The meta object literal for the '{@link com.alma.djynx.usecase.useCase.impl.ExtensionPointImpl <em>Extension Point</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.alma.djynx.usecase.useCase.impl.ExtensionPointImpl
     * @see com.alma.djynx.usecase.useCase.impl.UseCasePackageImpl#getExtensionPoint()
     * @generated
     */
    EClass EXTENSION_POINT = eINSTANCE.getExtensionPoint();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXTENSION_POINT__NAME = eINSTANCE.getExtensionPoint_Name();

    /**
     * The meta object literal for the '{@link com.alma.djynx.usecase.useCase.impl.IncludesImpl <em>Includes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.alma.djynx.usecase.useCase.impl.IncludesImpl
     * @see com.alma.djynx.usecase.useCase.impl.UseCasePackageImpl#getIncludes()
     * @generated
     */
    EClass INCLUDES = eINSTANCE.getIncludes();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INCLUDES__NAME = eINSTANCE.getIncludes_Name();

    /**
     * The meta object literal for the '<em><b>Rules</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INCLUDES__RULES = eINSTANCE.getIncludes_Rules();

    /**
     * The meta object literal for the '{@link com.alma.djynx.usecase.useCase.impl.ExtendsImpl <em>Extends</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.alma.djynx.usecase.useCase.impl.ExtendsImpl
     * @see com.alma.djynx.usecase.useCase.impl.UseCasePackageImpl#getExtends()
     * @generated
     */
    EClass EXTENDS = eINSTANCE.getExtends();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXTENDS__NAME = eINSTANCE.getExtends_Name();

    /**
     * The meta object literal for the '<em><b>Rules</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXTENDS__RULES = eINSTANCE.getExtends_Rules();

    /**
     * The meta object literal for the '{@link com.alma.djynx.usecase.useCase.impl.ActorImpl <em>Actor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.alma.djynx.usecase.useCase.impl.ActorImpl
     * @see com.alma.djynx.usecase.useCase.impl.UseCasePackageImpl#getActor()
     * @generated
     */
    EClass ACTOR = eINSTANCE.getActor();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTOR__NAME = eINSTANCE.getActor_Name();

    /**
     * The meta object literal for the '<em><b>Inheritances</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTOR__INHERITANCES = eINSTANCE.getActor_Inheritances();

    /**
     * The meta object literal for the '<em><b>Uses</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTOR__USES = eINSTANCE.getActor_Uses();

    /**
     * The meta object literal for the '{@link com.alma.djynx.usecase.useCase.impl.InheritanceImpl <em>Inheritance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.alma.djynx.usecase.useCase.impl.InheritanceImpl
     * @see com.alma.djynx.usecase.useCase.impl.UseCasePackageImpl#getInheritance()
     * @generated
     */
    EClass INHERITANCE = eINSTANCE.getInheritance();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INHERITANCE__NAME = eINSTANCE.getInheritance_Name();

    /**
     * The meta object literal for the '{@link com.alma.djynx.usecase.useCase.impl.UsesImpl <em>Uses</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.alma.djynx.usecase.useCase.impl.UsesImpl
     * @see com.alma.djynx.usecase.useCase.impl.UseCasePackageImpl#getUses()
     * @generated
     */
    EClass USES = eINSTANCE.getUses();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute USES__NAME = eINSTANCE.getUses_Name();

    /**
     * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute USES__MULTIPLICITY = eINSTANCE.getUses_Multiplicity();

  }

} //UseCasePackage
