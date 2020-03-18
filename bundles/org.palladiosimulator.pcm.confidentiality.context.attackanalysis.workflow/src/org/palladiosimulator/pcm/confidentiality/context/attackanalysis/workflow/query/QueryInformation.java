package org.palladiosimulator.pcm.confidentiality.context.attackanalysis.workflow.query;

/**
 * Stores the important query informations such as its name and ID
 * 
 * @author Mirko Sowa
 *
 */
public class QueryInformation {
	private final String name;
	private final String id;

	public QueryInformation(String id, String name) {
		this.name = name;
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
