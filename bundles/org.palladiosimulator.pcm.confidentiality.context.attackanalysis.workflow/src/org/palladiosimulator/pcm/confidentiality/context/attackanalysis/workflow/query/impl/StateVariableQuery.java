package org.palladiosimulator.pcm.confidentiality.context.attackanalysis.workflow.query.impl;

import java.util.Map;

import org.osgi.service.component.annotations.Component;
import org.palladiosimulator.pcm.confidentiality.context.attackanalysis.workflow.query.IQuery;

/**
 * 
 * @author Mirko Sowa
 *
 */
@Component(immediate = true, property = { "id=pcm.dataprocessing.analysis.launcher.statequery",	"name=StateVariableQuery" })
public class StateVariableQuery extends RBACQuery implements IQuery {

	private static final String ADDITIONAL_THEORY_TEMPLATE = "accessRights(OP, R) :-\n" + 
			"	findall(X, operationProperty(OP, '${" + PARAM_ROLE + "}', X), R).\n" + 
			"	\n" + 
			"isNoRoleAuthorizedStateVal([], _, _, _).		\n" + 
			"isNoRoleAuthorizedStateVal([Role | R], S, OP, SVAL) :-\n" + 
			"	\\+ preCallState(S, OP, SVAL, '${" + PARAM_ACCESS + "}', Role),\n" + 
			"	isNoRoleAuthorizedStateVal(R, S, OP, SVAL).";

	private final static String GOAL_TEMPLATE = "S=[CALLEE, CALL, OP|_], operationCall(OP, CALLEE, CALL),\r\n"
			+ "operationStateType(CALLEE, SVAL, ST), dataTypeAttribute(ST, '${" + PARAM_ACCESS + "}'),\r\n"
			+ "accessRights(CALLEE, R),\r\n" + "isNoRoleAuthorizedStateVal(R, S, CALLEE, SVAL).";
	
	public StateVariableQuery() {
		super(GOAL_TEMPLATE, ADDITIONAL_THEORY_TEMPLATE);
	}

	@Override
	public Map<String, String> getResultVars() {
		return Map.of("Callee", "CALLEE", "Call", "CALL", "Operation", "OP", "State Value", "SVAL", "State Type", "ST", "Roles", "R");
	}

}
