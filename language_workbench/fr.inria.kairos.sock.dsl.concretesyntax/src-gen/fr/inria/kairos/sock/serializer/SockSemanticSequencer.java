/*
 * generated by Xtext 2.14.0
 */
package fr.inria.kairos.sock.serializer;

import com.google.inject.Inject;
import fr.inria.kairos.sock.dsl.model.sock.Actor;
import fr.inria.kairos.sock.dsl.model.sock.IotSystem;
import fr.inria.kairos.sock.dsl.model.sock.MaliciousActor;
import fr.inria.kairos.sock.dsl.model.sock.Resource;
import fr.inria.kairos.sock.dsl.model.sock.SockPackage;
import fr.inria.kairos.sock.services.SockGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;

@SuppressWarnings("all")
public class SockSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SockGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == SockPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SockPackage.ACTOR:
				sequence_Actor_Impl(context, (Actor) semanticObject); 
				return; 
			case SockPackage.IOT_SYSTEM:
				sequence_IotSystem(context, (IotSystem) semanticObject); 
				return; 
			case SockPackage.MALICIOUS_ACTOR:
				sequence_MaliciousActor(context, (MaliciousActor) semanticObject); 
				return; 
			case SockPackage.RESOURCE:
				sequence_Resource(context, (Resource) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Actor returns Actor
	 *     Actor_Impl returns Actor
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         isSensible=EInt? 
	 *         processTime=EInt? 
	 *         periodTime=EInt? 
	 *         currentProcessTime=EInt? 
	 *         resource=[Resource|EString]? 
	 *         code=EString?
	 *     )
	 */
	protected void sequence_Actor_Impl(ISerializationContext context, Actor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     IotSystem returns IotSystem
	 *
	 * Constraint:
	 *     (name=EString currentTime=EInt? (ownedActor+=Actor ownedActor+=Actor*)? (ownedResource+=Resource ownedResource+=Resource*)?)
	 */
	protected void sequence_IotSystem(ISerializationContext context, IotSystem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Actor returns MaliciousActor
	 *     MaliciousActor returns MaliciousActor
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         isSensible=EInt? 
	 *         processTime=EInt? 
	 *         periodTime=EInt? 
	 *         currentProcessTime=EInt? 
	 *         resource=[Resource|EString]?
	 *     )
	 */
	protected void sequence_MaliciousActor(ISerializationContext context, MaliciousActor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Resource returns Resource
	 *
	 * Constraint:
	 *     (name=EString (actor+=[Actor|EString] actor+=[Actor|EString]*)?)
	 */
	protected void sequence_Resource(ISerializationContext context, Resource semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}