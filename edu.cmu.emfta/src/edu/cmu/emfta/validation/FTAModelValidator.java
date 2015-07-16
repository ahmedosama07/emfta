/**
 *
 * $Id$
 */
package edu.cmu.emfta.validation;

import edu.cmu.emfta.Event;
import edu.cmu.emfta.Tree;

/**
 * A sample validator interface for {@link edu.cmu.emfta.FTAModel}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface FTAModelValidator {
	boolean validate();

	boolean validateRoot(Event value);

	boolean validateRoot(Tree value);
	boolean validateName(String value);
	boolean validateDescription(String value);
	boolean validateComments(String value);
}
