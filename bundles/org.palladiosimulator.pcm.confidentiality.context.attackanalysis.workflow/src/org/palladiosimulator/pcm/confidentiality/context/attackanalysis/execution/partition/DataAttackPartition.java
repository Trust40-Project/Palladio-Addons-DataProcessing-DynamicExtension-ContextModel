package org.palladiosimulator.pcm.confidentiality.context.attackanalysis.execution.partition;

import de.uka.ipd.sdq.workflow.mdsd.blackboard.ResourceSetPartition;
import edu.kit.kastel.scbs.confidentiality.ConfidentialityPackage;
import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;
import edu.kit.kastel.scbs.confidentiality.adversary.Adversaries;
import edu.kit.kastel.scbs.confidentiality.adversary.AdversaryPackage;

public class DataAttackPartition extends ResourceSetPartition{
    
    public Adversaries getContextSpecification() {
        return ((Adversaries) getElement(AdversaryPackage.eINSTANCE.getAdversaries()));
    }
    public ConfidentialitySpecification getDataspecification() {
        return (ConfidentialitySpecification) getElement(ConfidentialityPackage.eINSTANCE.getConfidentialitySpecification());
    }
}
