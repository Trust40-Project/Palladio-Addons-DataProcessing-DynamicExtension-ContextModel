package org.palladiosimulator.pcm.confidentiality.context.attackanalysis.workflow.query;

import java.util.Map;

/**
 * 
 * @author Mirko Sowa
 *
 */
public interface IQuery {

	/**
	 * Gets all parameters required for executing the analysis as a map from the
	 * parameter name to the parameter type.
	 * 
	 * @return Required parameters to parameterize the query.
	 */
	public Map<String, QueryParameterType> getParameters();

	/**
	 * Gets an additional part of theory that is required by the query.
	 * 
	 * @param Parameters to customize the query. see {@link #getParameters()}
	 * @return String of the additional Prolog Theory
	 */
	public default String getAdditionalTheory(Map<String, String> parameters) {
		return "";
	}

	/**
	 * Gets the attached query
	 * 
	 * @param Parameters to customize the query. see {@link #getParameters()}
	 * @return String of the Prolog Query
	 */
	public String getQueryString(Map<String, String> parameters);

	/**
	 * Gets the relevant result variables
	 * 
	 * @return Map of result variables: <VariableID, Variable>
	 */
	public Map<String, String> getResultVars();

}
