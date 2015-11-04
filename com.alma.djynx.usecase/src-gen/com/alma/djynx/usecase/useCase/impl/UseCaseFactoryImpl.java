/**
 */
package com.alma.djynx.usecase.useCase.impl;

import com.alma.djynx.usecase.useCase.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UseCaseFactoryImpl extends EFactoryImpl implements UseCaseFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static UseCaseFactory init()
  {
    try
    {
      UseCaseFactory theUseCaseFactory = (UseCaseFactory)EPackage.Registry.INSTANCE.getEFactory(UseCasePackage.eNS_URI);
      if (theUseCaseFactory != null)
      {
        return theUseCaseFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new UseCaseFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UseCaseFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case UseCasePackage.USE_CASE: return createUseCase();
      case UseCasePackage.SUBSYSTEM: return createSubsystem();
      case UseCasePackage.CASE: return createCase();
      case UseCasePackage.EXTENSION_POINT: return createExtensionPoint();
      case UseCasePackage.INCLUDES: return createIncludes();
      case UseCasePackage.EXTENDS: return createExtends();
      case UseCasePackage.ACTOR: return createActor();
      case UseCasePackage.INHERITANCE: return createInheritance();
      case UseCasePackage.USES: return createUses();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UseCase createUseCase()
  {
    UseCaseImpl useCase = new UseCaseImpl();
    return useCase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Subsystem createSubsystem()
  {
    SubsystemImpl subsystem = new SubsystemImpl();
    return subsystem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Case createCase()
  {
    CaseImpl case_ = new CaseImpl();
    return case_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExtensionPoint createExtensionPoint()
  {
    ExtensionPointImpl extensionPoint = new ExtensionPointImpl();
    return extensionPoint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Includes createIncludes()
  {
    IncludesImpl includes = new IncludesImpl();
    return includes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Extends createExtends()
  {
    ExtendsImpl extends_ = new ExtendsImpl();
    return extends_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Actor createActor()
  {
    ActorImpl actor = new ActorImpl();
    return actor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Inheritance createInheritance()
  {
    InheritanceImpl inheritance = new InheritanceImpl();
    return inheritance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Uses createUses()
  {
    UsesImpl uses = new UsesImpl();
    return uses;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UseCasePackage getUseCasePackage()
  {
    return (UseCasePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static UseCasePackage getPackage()
  {
    return UseCasePackage.eINSTANCE;
  }

} //UseCaseFactoryImpl
