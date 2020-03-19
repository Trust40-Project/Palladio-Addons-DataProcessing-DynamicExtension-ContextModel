package org.palladiosimulator.pcm.confidentiality.context.attackanalysis.execution.partition;

import org.palladiosimulator.pcm.confidentiality.context.ConfidentialAccessSpecification;
import org.palladiosimulator.pcm.confidentiality.context.ContextPackage;
import org.palladiosimulator.pcm.confidentiality.context.model.ContextContainer;
import org.palladiosimulator.pcm.confidentiality.context.model.ModelPackage;

import de.uka.ipd.sdq.workflow.mdsd.blackboard.ResourceSetPartition;

public class ContextPartition extends ResourceSetPartition{
    public ContextContainer getContextSpecification() {
        //FIXME solve Problem of not finding ContextContainer
        return ((ConfidentialAccessSpecification) getElement(ContextPackage.eINSTANCE.getConfidentialAccessSpecification()).get(0)).getContextcontainer();
        //return (ContextContainer) 
    }
}
