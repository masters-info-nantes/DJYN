/*
 * generated by Xtext
 */
package com.alma.djynx.usecase.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class UseCaseAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.tokens");
	}
}
