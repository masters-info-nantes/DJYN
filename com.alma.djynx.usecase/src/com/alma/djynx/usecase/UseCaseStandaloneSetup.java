/*
 * generated by Xtext
 */
package com.alma.djynx.usecase;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class UseCaseStandaloneSetup extends UseCaseStandaloneSetupGenerated{

	public static void doSetup() {
		new UseCaseStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

