package org.palladiosimulator.pcm.confidentiality.context.attackanalysis.execution.workflow;

import org.apache.log4j.Logger;
import org.palladiosimulator.pcm.confidentiality.context.attackanalysis.execution.workflow.job.AttackerAnalysisJob;
import org.palladiosimulator.pcm.confidentiality.context.attackanalysis.execution.workflow.job.LoadModelJob;

import de.uka.ipd.sdq.workflow.jobs.SequentialBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;

/**
 * Workflow for AttackerAnalysis
 * 
 * @author majuwa
 * 
 *
 */
public class AttackerAnalysisWorkflow extends SequentialBlackboardInteractingJob<MDSDBlackboard> {
    private static final Logger LOGGER = Logger.getLogger(AttackerAnalysisWorkflow.class);
    public AttackerAnalysisWorkflow(AttackerAnalysisWorkflowConfig config) {
        super(false);
        this.add(new LoadModelJob(config));
        this.add(new AttackerAnalysisJob(config));
    }
}
