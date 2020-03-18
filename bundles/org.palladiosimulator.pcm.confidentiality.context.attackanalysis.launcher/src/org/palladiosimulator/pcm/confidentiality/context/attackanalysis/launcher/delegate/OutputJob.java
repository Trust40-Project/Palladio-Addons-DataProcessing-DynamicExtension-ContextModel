package org.palladiosimulator.pcm.confidentiality.context.attackanalysis.launcher.delegate;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;

import de.uka.ipd.sdq.workflow.jobs.CleanupFailedException;
import de.uka.ipd.sdq.workflow.jobs.IJob;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;

/**
 * Job to output the results of the analysisWorkflow on the running Eclipse
 * console instance
 * 
 * @author mirko
 *
 */
public class OutputJob implements IJob {

//	private AnalysisBlackboard blackboard;

	public OutputJob() {

	}
	
	//FIXME adapt to attackeranalysis
	@Override
	public void execute(IProgressMonitor monitor) throws JobFailedException, UserCanceledException {
//		if (blackboard.getSolution() != null) {
//
//			MessageConsole myConsole = findConsole(Constants.CONSOLE_ID.getConstant());
//			MessageConsoleStream out = myConsole.newMessageStream();
//			if (blackboard.getSolution().isSuccess()) {
//				for (Entry<String, String> t : blackboard.getQuery().getResultVars().entrySet()) {
//
//					out.print(t.getKey().toString() + " ; ");
//					out.println(Objects.toString(blackboard.getSolution().get(t.getValue())));
//
//				}
//			} else {
//				out.println("Solution has not succeeded");
//			}
//		}
	}

	@Override
	public void cleanup(IProgressMonitor monitor) throws CleanupFailedException {
		// ignored
	}

	@Override
	public String getName() {
		return "Job that outputs result on Eclipse console";
	}

	private MessageConsole findConsole(String name) {
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager conMan = plugin.getConsoleManager();
		for (org.eclipse.ui.console.IConsole console1 : conMan.getConsoles())
			if (name.equals(console1.getName()))
				return (MessageConsole) console1;
		/* no console found, so create a new one */
		MessageConsole myConsole = new MessageConsole(name, null);
		conMan.addConsoles(new org.eclipse.ui.console.IConsole[] { myConsole });
		return myConsole;
	}

//	public void setBlackboard(AnalysisBlackboard blackboard) {
//		this.blackboard = blackboard;
//	}

}
