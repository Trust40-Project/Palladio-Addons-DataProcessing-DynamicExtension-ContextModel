package org.palladiosimulator.pcm.confidentiality.context.attackanalysis.execution.workflow.job;

import static org.palladiosimulator.pcm.confidentiality.context.attackanalysis.execution.partition.PartitionConstants.PARTITION_ID_CONTEXT;
import static org.palladiosimulator.pcm.confidentiality.context.attackanalysis.execution.partition.PartitionConstants.PARTITION_ID_PCM;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EPackage;
import org.palladiosimulator.analyzer.workflow.blackboard.PCMResourceSetPartition;
import org.palladiosimulator.analyzer.workflow.configurations.AbstractPCMWorkflowRunConfiguration;
import org.palladiosimulator.pcm.confidentiality.context.ContextPackage;
import org.palladiosimulator.pcm.confidentiality.context.attackanalysis.execution.partition.ContextPartition;
import org.palladiosimulator.pcm.confidentiality.context.attackanalysis.execution.workflow.AttackerAnalysisWorkflowConfig;

import de.uka.ipd.sdq.workflow.jobs.CleanupFailedException;
import de.uka.ipd.sdq.workflow.jobs.IBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;

public class LoadModelJob implements IBlackboardInteractingJob<MDSDBlackboard> {
    private static final Logger LOGGER = Logger.getLogger(LoadModelJob.class);
    private MDSDBlackboard blackboard;
    private AttackerAnalysisWorkflowConfig configuration;

    public LoadModelJob(AttackerAnalysisWorkflowConfig configuration) {
        this.configuration = configuration;
    }

    @Override
    public void execute(IProgressMonitor monitor) throws JobFailedException, UserCanceledException {
        var pcmPartition = new PCMResourceSetPartition();
        this.blackboard.addPartition(PARTITION_ID_PCM, pcmPartition);
        pcmPartition.initialiseResourceSetEPackages(AbstractPCMWorkflowRunConfiguration.PCM_EPACKAGES);
        pcmPartition.loadModel(this.configuration.getRepositoryModel());
        pcmPartition.loadModel(this.configuration.getAllocationModel());
        pcmPartition.resolveAllProxies();

        var contextPartition = new ContextPartition();
        contextPartition.initialiseResourceSetEPackages(new EPackage[] { ContextPackage.eINSTANCE });
        this.blackboard.addPartition(PARTITION_ID_CONTEXT, contextPartition);
        contextPartition.loadModel(this.configuration.getContextModel());
        contextPartition.resolveAllProxies();
    }

    @Override
    public void cleanup(IProgressMonitor monitor) throws CleanupFailedException {
        // TODO Auto-generated method stub

    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return "Load Model";
    }

    @Override
    public void setBlackboard(MDSDBlackboard blackboard) {
        this.blackboard = blackboard;
    }

}
