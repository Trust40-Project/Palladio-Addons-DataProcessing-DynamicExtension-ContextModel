package org.palladiosimulator.pcm.confidentiality.context.attackanalysis.execution.workflow.job;

import static org.palladiosimulator.pcm.confidentiality.context.attackanalysis.execution.partition.PartitionConstants.PARTITION_ID_CONTEXT;
import static org.palladiosimulator.pcm.confidentiality.context.attackanalysis.execution.partition.PartitionConstants.PARTITION_ID_PCM;
import static org.palladiosimulator.pcm.confidentiality.context.attackanalysis.execution.partition.PartitionConstants.PARTITION_ID_KASTEL;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.palladiosimulator.analyzer.workflow.blackboard.PCMResourceSetPartition;
import org.palladiosimulator.analyzer.workflow.configurations.AbstractPCMWorkflowRunConfiguration;
import org.palladiosimulator.pcm.confidentiality.context.ContextPackage;
import org.palladiosimulator.pcm.confidentiality.context.attackanalysis.execution.partition.ContextPartition;
import org.palladiosimulator.pcm.confidentiality.context.attackanalysis.execution.partition.DataAttackPartition;
import org.palladiosimulator.pcm.confidentiality.context.attackanalysis.execution.workflow.AttackerAnalysisWorkflowConfig;

import de.uka.ipd.sdq.workflow.jobs.CleanupFailedException;
import de.uka.ipd.sdq.workflow.jobs.IBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.ResourceSetPartition;
import edu.kit.kastel.scbs.confidentiality.ConfidentialityPackage;

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
        var urisPCM = new URI[] { this.configuration.getRepositoryModel(), this.configuration.getAllocationModel() };
        loadModel2Partition(pcmPartition, urisPCM, AbstractPCMWorkflowRunConfiguration.PCM_EPACKAGES, PARTITION_ID_PCM);

        var contextPartition = new ContextPartition();
        loadModel2Partition(contextPartition, new URI[] { this.configuration.getContextModel() },
                new EPackage[] { ContextPackage.eINSTANCE }, PARTITION_ID_CONTEXT);

        var dataPartition = new DataAttackPartition();
        var urisData = new URI[] { this.configuration.getAdversaryModel(), this.configuration.getDataModel() };
        loadModel2Partition(dataPartition, urisData, new EPackage[] { ConfidentialityPackage.eINSTANCE },
                PARTITION_ID_KASTEL);
    }

    private void loadModel2Partition(ResourceSetPartition partition, URI[] uris, EPackage[] packages,
            String partitionID) {
        partition.initialiseResourceSetEPackages(packages);
        this.blackboard.addPartition(partitionID, partition);
        for (URI uri : uris)
            partition.loadModel(uri);
        partition.resolveAllProxies();
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
