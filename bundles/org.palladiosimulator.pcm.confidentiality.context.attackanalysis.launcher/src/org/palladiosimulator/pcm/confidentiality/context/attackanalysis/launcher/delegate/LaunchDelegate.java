package org.palladiosimulator.pcm.confidentiality.context.attackanalysis.launcher.delegate;

import java.io.File;
import java.net.MalformedURLException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;
import org.eclipse.emf.common.util.URI;
import org.modelversioning.emfprofile.registry.IProfileRegistry;
import org.palladiosimulator.pcm.confidentiality.context.attackanalysis.launcher.constants.Constants;

//TODO remove
//import org.prolog4j.IProverFactory;
//import org.prolog4j.ProverInformation;
//import org.prolog4j.manager.IProverManager;

/**
 * Launches a given launch configuration with an usage model,an allocation model
 * and a characteristics model.
 * 
 * @author Mirko Sowa
 * 
 */
public class LaunchDelegate implements ILaunchConfigurationDelegate {

	private URI usageModelPath = null;
	private URI allocModelPath = null;
	private URI chModelPath = null;

	@Override
	public void launch(ILaunchConfiguration configuration, String mode, ILaunch launch, IProgressMonitor monitor)
			throws CoreException {

		IProfileRegistry.eINSTANCE.getClass();

//		boolean returnValueIndexing = configuration.getAttribute(Constants.ADV_ARG_AND_RETURN.getConstant(), false);
//		boolean optimNegation = configuration.getAttribute(Constants.ADV_OPTIM_NEGATION.getConstant(), false);
//		boolean shortAssign = configuration.getAttribute(Constants.ADV_SHORT_ASSIGN.getConstant(), false);
//
//		resolvePaths(configuration);
//		IProverFactory proverFactory = getProverFactory(configuration);
//		IQuery analysisGoal = getAnalysisGoal(configuration);
//		
//		Map<String, String> parameters = new HashMap<>();
//		for (String paramName : analysisGoal.getParameters().keySet()) {
//			parameters.put(paramName, configuration.getAttribute(paramName, ""));
//		}
		
		//FIXME Call methods
//		AnalysisWorkflowConfig wfeConfig = new AnalysisWorkflowConfig(usageModelPath, allocModelPath, chModelPath,
//				analysisGoal, proverFactory, returnValueIndexing, optimNegation, shortAssign, parameters);
//		WorkflowExecuter wfeExec = new WorkflowExecuter(wfeConfig);
//		wfeExec.execute();

	}

	/**
	 * Gets the URI from text inputs.
	 * 
	 * @param configuration launch configuration with text inputs
	 * @throws CoreException if URI malformed
	 * 
	 */
	private void resolvePaths(ILaunchConfiguration configuration) throws CoreException {

		try {
			usageModelPath = getUriFromText(configuration.getAttribute(Constants.REPOSITORY_MODEL_LABEL.getConstant(), ""));
			allocModelPath = getUriFromText(
					configuration.getAttribute(Constants.ALLOCATION_MODEL_LABEL.getConstant(), ""));
			chModelPath = getUriFromText(
					configuration.getAttribute(Constants.CONTEXT_MODEL_LABEL.getConstant(), ""));

		} catch (MalformedURLException e) {
			throw new CoreException(
					new Status(IStatus.ERROR, "pcm.dataprocessing.analysis.launcher", "Could not resolve paths."));
		}

	}

	//TODO remove
//	/**
//	 * Gets a prover factory interface from a launch configuration
//	 * 
//	 * @param launchConfig Launch configuration
//	 * @return a {@link IProverFactory}
//	 * @throws CoreException if attribute cannot be found in launch configuration
//	 */
//	private IProverFactory getProverFactory(ILaunchConfiguration launchConfig) throws CoreException {
//		IProverManager proverManager = Activator.getInstance().getProverManagerInstance();
//		IProverFactory myProverFactory = null;
//
//		String prologConfig = launchConfig.getAttribute(Constants.PROLOG_INTERPRETER_LABEL.getConstant(), "default");
//
//		for (Map.Entry<ProverInformation, IProverFactory> entry : proverManager.getProvers().entrySet()) {
//			if (entry.getKey().getId().equals(prologConfig)) {
//				myProverFactory = entry.getValue();
//			}
//		}
//		return myProverFactory;
//
//	}

	//TODO Remove
//	/**
//	 * Gets a query interface from a launch configuration
//	 * 
//	 * @param launchConfig Launch configuration
//	 * @return {@link IQuery}
//	 * @throws CoreException if attribute cannot be found in launch configuration
//	 */
//	private IQuery getAnalysisGoal(ILaunchConfiguration launchConfig) throws CoreException {
//		IQueryManager queryManager = Activator.getInstance().getQueryManagerInstance();
//		IQuery queryInput = null;
//
//		String analysisConfig = launchConfig.getAttribute(Constants.ANALYSIS_GOAL_LABEL.getConstant(), "default");
//
//		if (!analysisConfig.equals("default")) {
//			for (Map.Entry<QueryInformation, IQuery> entry : queryManager.getQueries().entrySet()) {
//				if (entry.getKey().getId().equals(analysisConfig)) {
//					queryInput = entry.getValue();
//				}
//			}
//		}
//
//		return queryInput;
//
//	}

	/**
	 * Gets an {@link URI} from a String
	 * 
	 * @param text String of URI
	 * @return {@link URI}
	 * @throws MalformedURLException if URI not of right format
	 */
	private URI getUriFromText(String text) throws MalformedURLException {

		URI result;
		File usageFile = new File(text);
		if (usageFile != null && usageFile.exists()) {
			result = URI.createFileURI(usageFile.getAbsolutePath());
		} else {
			result = URI.createURI(text);
		}
		return result;

	}

}
