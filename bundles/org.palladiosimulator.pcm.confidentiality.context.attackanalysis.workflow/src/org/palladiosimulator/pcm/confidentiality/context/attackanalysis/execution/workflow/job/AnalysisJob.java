package org.palladiosimulator.pcm.confidentiality.context.attackanalysis.execution.workflow.job;

import static org.palladiosimulator.pcm.confidentiality.context.attackanalysis.execution.partition.PartitionConstants.PARTITION_ID_CONTEXT;
import static org.palladiosimulator.pcm.confidentiality.context.attackanalysis.execution.partition.PartitionConstants.PARTITION_ID_PCM;

import org.eclipse.core.runtime.IProgressMonitor;
import org.palladiosimulator.analyzer.workflow.blackboard.PCMResourceSetPartition;
import org.palladiosimulator.pcm.confidentiality.context.attackanalysis.execution.Activator;
import org.palladiosimulator.pcm.confidentiality.context.attackanalysis.execution.partition.ContextPartition;
import org.palladiosimulator.pcm.confidentiality.context.attackanalysis.execution.workflow.AttackerAnalysisWorkflowConfig;

import de.uka.ipd.sdq.workflow.jobs.CleanupFailedException;
import de.uka.ipd.sdq.workflow.jobs.IBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;

public class AnalysisJob implements IBlackboardInteractingJob<MDSDBlackboard> {

    private MDSDBlackboard blackbord;

    public AnalysisJob(AttackerAnalysisWorkflowConfig config) {

    }

    @Override
    public void execute(IProgressMonitor monitor) throws JobFailedException, UserCanceledException {
        // TODO Auto-generated method stub
        var analysis = Activator.getInstance().getAnalysis();
        var contextPartition = (ContextPartition) this.blackbord.getPartition(PARTITION_ID_CONTEXT);
        var pcmPartition = (PCMResourceSetPartition) this.blackbord.getPartition(PARTITION_ID_PCM);
        analysis.testArchitecture(pcmPartition.getMiddlewareRepository(), contextPartition.getContextSpecification());
    }

    @Override
    public void cleanup(IProgressMonitor monitor) throws CleanupFailedException {
        // TODO Auto-generated method stub

    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return "Analysis Job";
    }

    @Override
    public void setBlackboard(MDSDBlackboard blackboard) {
        // TODO Auto-generated method stub
        this.blackbord = blackboard;
    }
}
