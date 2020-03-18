package org.palladiosimulator.pcm.confidentiality.context.attackanalysis.execution.workflow.job;

import org.eclipse.core.runtime.IProgressMonitor;
import org.palladiosimulator.pcm.confidentiality.context.attackanalysis.execution.workflow.AttackerAnalysisWorkflowConfig;

import de.uka.ipd.sdq.workflow.jobs.CleanupFailedException;
import de.uka.ipd.sdq.workflow.jobs.IBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;

public class AnalysisJob implements IBlackboardInteractingJob<MDSDBlackboard> {
    
    public AnalysisJob(AttackerAnalysisWorkflowConfig config) {
        
    }

    @Override
    public void execute(IProgressMonitor monitor) throws JobFailedException, UserCanceledException {
        // TODO Auto-generated method stub
        
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
        
    }
}
