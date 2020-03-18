package org.palladiosimulator.pcm.confidentiality.context.attackanalysis.workflow.query.impl;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.text.StrSubstitutor;
import org.palladiosimulator.pcm.confidentiality.context.attackanalysis.workflow.query.IQuery;
import org.palladiosimulator.pcm.confidentiality.context.attackanalysis.workflow.query.QueryParameterType;

public abstract class RBACQuery implements IQuery {

	protected static final String PARAM_ROLE = "Role characteristic type (ID)";
	protected static final String PARAM_ACCESS = "Access rights characteritic type (ID)";
	private final static Map<String, QueryParameterType> PARAMETERS = createQueryParameters();
	private final String goalTemplate;
	private final String additionalTheoryTemplate;

	public RBACQuery(String goalTemplate, String additionalTheoryTemplate) {
		this.goalTemplate = goalTemplate;
		this.additionalTheoryTemplate = additionalTheoryTemplate;
	}
	
	private static Map<String, QueryParameterType> createQueryParameters() {
		Map<String, QueryParameterType> parameters = new HashMap<String, QueryParameterType>();
		parameters.put(PARAM_ROLE, QueryParameterType.MODEL_ID);
		parameters.put(PARAM_ACCESS, QueryParameterType.MODEL_ID);
		return Collections.unmodifiableMap(parameters);
	}
	
	@Override
	public Map<String, QueryParameterType> getParameters() {
		return PARAMETERS;
	}

	@Override
	public String getQueryString(Map<String, String> parameters) {
		return StrSubstitutor.replace(goalTemplate, parameters);
	}

	@Override
	public String getAdditionalTheory(Map<String, String> parameters) {
		return StrSubstitutor.replace(additionalTheoryTemplate, parameters);
	}

}
