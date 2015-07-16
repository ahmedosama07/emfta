/**
 *
 * $Id$
 */
package edu.cmu.emfta.validation;

import edu.cmu.emfta.EventType;
import edu.cmu.emfta.Gate;

/**
 * A sample validator interface for {@link edu.cmu.emfta.Event}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface EventValidator {
	boolean validate();

	boolean validateType(EventType value);
	boolean validateName(String value);
	boolean validateProbability(double value);
	boolean validateDescription(String value);

	boolean validateGate(Gate value);
}
