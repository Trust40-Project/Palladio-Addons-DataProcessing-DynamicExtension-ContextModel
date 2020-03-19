package org.palladiosimulator.pcm.confidentiality.context.attackanalysis.launcher.constants;
/**
 * PartitionConstants of the PCM Dataprocessing Launcher
 * @author Mirko Sowa
 *
 */
public enum Constants {

	NAME("Attacker Analysis Modelling Launcher"),
	BUTTON_BROWSE_TEXT("Browse..."),
	BUTTON_DIR_BROWSE_TEXT("Working Directory..."),
	ANALYSIS_GOAL_LABEL("Select Analysis Goal"),
	PROLOG_INTERPRETER_LABEL("Select PROLOG Interpreter"),
	REPOSITORY_MODEL_LABEL("Select Repository Model"),
	ALLOCATION_MODEL_LABEL("Select Allocation Model"),
	CONTEXT_MODEL_LABEL("Select Context Model"),
	DATA_MODEL_LABEL("Select Data Model"),
	ADVERSARY_MODEL_LABEL("Select Adversary Model"),
	ADV_TAB_NAME("Advanced Configuration"),
	ADV_ARG_AND_RETURN("Argument and Return Indexing"),
	ADV_OPTIM_NEGATION("Optimized Negations"),
	ADV_SHORT_ASSIGN("Short Asssignments"),
	CONSOLE_ID("pcm.dataprocessing.context.attackeranalysis.launcher.console"),
	DEFAULT_CONFIG_VALUE("default");
	

	private final String attr;

	Constants(String attr) {
		this.attr = attr;
	}

	public String getConstant() {
		return attr;
	}
}
