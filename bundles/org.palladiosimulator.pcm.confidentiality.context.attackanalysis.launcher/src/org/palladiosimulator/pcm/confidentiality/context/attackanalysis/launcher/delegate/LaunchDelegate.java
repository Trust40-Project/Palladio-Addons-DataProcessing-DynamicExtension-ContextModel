package org.palladiosimulator.pcm.confidentiality.context.attackanalysis.launcher.delegate;

import java.io.File;
import java.net.MalformedURLException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.emf.common.util.URI;
import org.palladiosimulator.pcm.confidentiality.context.attackanalysis.execution.workflow.AttackerAnalysisWorkflowConfig;
import org.palladiosimulator.pcm.confidentiality.context.attackanalysis.launcher.constants.Constants;

import de.uka.ipd.sdq.workflow.jobs.IJob;
import de.uka.ipd.sdq.workflow.mdsd.AbstractWorkflowBasedMDSDLaunchConfigurationDelegate;



/**
 * Launches a given launch configuration with an usage model,an allocation model and a
 * characteristics model.
 * 
 * @author majuwa
 * @author Mirko Sowa
 * 
 */
public class LaunchDelegate
        extends AbstractWorkflowBasedMDSDLaunchConfigurationDelegate<AttackerAnalysisWorkflowConfig> {

    private URI usageModelPath = null;
    private URI allocModelPath = null;
    private URI chModelPath = null;

    @Override
    protected AttackerAnalysisWorkflowConfig deriveConfiguration(ILaunchConfiguration configuration, String mode)
            throws CoreException {
        var config = new AttackerAnalysisWorkflowConfig();
        var builder = new AttackerAnalysisConfigurationBuilder(configuration, mode);
        builder.fillConfiguration(config);
        return config;
    }


    @Override
    protected IJob createWorkflowJob(AttackerAnalysisWorkflowConfig config, ILaunch launch) throws CoreException {
        // TODO Auto-generated method stub
        return null;
    }

}
