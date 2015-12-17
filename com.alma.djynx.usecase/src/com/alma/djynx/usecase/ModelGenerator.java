package com.alma.djynx.usecase;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.xtext.resource.XtextResourceSet;

public class ModelGenerator {

    /**
     * @param args
     */
    public static void main(String[] args) {
        UseCaseStandaloneSetup.doSetup();
        XtextResourceSet resourceSet = new XtextResourceSet();
        URI uri = URI.createURI("src/sample.uc");
        Resource xtextResource = resourceSet.getResource(uri , true);
        Resource xmiResource = new
EcoreResourceFactoryImpl().createResource(URI.createURI("src/sample.ecore"));
        xmiResource.getContents().add(xtextResource.getContents().get(0));
        try {
            xmiResource.save(null);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}


