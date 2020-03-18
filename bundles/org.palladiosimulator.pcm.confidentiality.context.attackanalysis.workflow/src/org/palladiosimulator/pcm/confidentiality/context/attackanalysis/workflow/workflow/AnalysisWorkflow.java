package org.palladiosimulator.pcm.confidentiality.context.attackanalysis.workflow.workflow;

import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.palladiosimulator.pcm.confidentiality.context.attackanalysis.workflow.query.IQuery;
import org.palladiosimulator.pcm.confidentiality.context.attackanalysis.workflow.workflow.job.EvaluateModelJob;
import org.palladiosimulator.pcm.confidentiality.context.attackanalysis.workflow.workflow.job.SystemModelJob;
import org.prolog4j.IProverFactory;
import de.uka.ipd.sdq.workflow.Workflow;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.SequentialBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.jobs.SequentialJob;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.ModelLocation;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.ResourceSetPartition;
import edu.kit.ipd.sdq.dataflow.systemmodel.SystemTranslator;

/**
 * This workflow enables to evaluate models as to a query goal.
 * 
 * @author Mirko Sowa
 *
 */
public class AnalysisWorkflow extends SequentialBlackboardInteractingJob<AnalysisBlackboard> {

	private static final String NAME = "AnalysisWorkflow";

	private final ModelLocation usageLocation;
	private final ModelLocation allocLocation;
	private final ModelLocation characLocation;
	
	private final SystemTranslator sysTrans;
	private final IQuery analysisGoal;
	private final IProverFactory proverFactory;

	private final Map<String, String> parameters;

	/**
	 * Constructor for an AnalysisWorkflow, takes an AnalysisWorkflowConfig and a
	 * IProgressMonitor as parameter. Also set the blackboard.
	 * 
	 * @param config  {@link AnalysisWorkflow} encapsulates most of the attributes
	 *                needed for a launch
	 * @param monitor {@link IProgressMonitor} to track progress and end of this
	 *                workflow
	 */
	public AnalysisWorkflow(AnalysisWorkflowConfig config) {
		super(NAME);
		this.usageLocation = config.getUsageLocation();
		this.allocLocation = config.getAllocLocation();
		this.characLocation = config.getCharacLocation();
		this.sysTrans = config.getSysTrans();
		this.analysisGoal = config.getQuery();
		this.proverFactory = config.getProverFactory();
		this.parameters = config.getParameters();
	}

	@Override
	public void execute(IProgressMonitor monitor) throws JobFailedException, UserCanceledException {
		if (usageLocation.getModelID() != null && allocLocation.getModelID() != null
				&& characLocation.getModelID() != null) {

			// initialise blackboard
			if (this.getBlackboard() == null) {
				this.setBlackboard(new AnalysisBlackboard());
			}
			initBlackboard();

			// creates a new sequence of jobs
			SequentialJob sequence = new SequentialJob();

			SystemModelJob sysJob = new SystemModelJob(usageLocation, allocLocation, characLocation);
			sysJob.setBlackboard(getBlackboard());
			sequence.add(sysJob);
			EvaluateModelJob evalJob = new EvaluateModelJob();
			evalJob.setBlackboard(getBlackboard());
			sequence.add(evalJob);

			Workflow myWorkflow = new Workflow(sequence);
			// executes sequence
			myWorkflow.run();

		}
	}

	/**
	 * Initialises the blackboard with the model locations
	 */
	private void initBlackboard() {
		addModelsToBlackboard();
		myBlackboard.setQuery(analysisGoal);
		myBlackboard.setProverFactory(proverFactory);
		myBlackboard.setSystemTranslator(sysTrans);
		myBlackboard.setParameters(parameters);
	}

	/**
	 * Adds models (contained in ResourceSetPartition) to the blackboard
	 * 
	 * @param loc ModelLocation to be added
	 */
	private void addModelsToBlackboard() {
		ResourceSetPartition rs = new ResourceSetPartition();

		rs.loadModel(allocLocation.getModelID());
		rs.loadModel(characLocation.getModelID());
		rs.loadModel(usageLocation.getModelID());
		rs.resolveAllProxies();

		myBlackboard.addPartition(allocLocation.getPartitionID(), rs);

	}
}
