package org.palladiosimulator.pcm.confidentiality.context.attackanalysis.execution.partition;

import org.palladiosimulator.pcm.confidentiality.context.model.ContextContainer;
import org.palladiosimulator.pcm.confidentiality.context.model.ModelPackage;

import de.uka.ipd.sdq.workflow.mdsd.blackboard.ResourceSetPartition;

public class ContextPartition extends ResourceSetPartition{
    public ContextContainer getContextSpecification() {
        return (ContextContainer) getElement(ModelPackage.eINSTANCE.getContextContainer());
    }
}
