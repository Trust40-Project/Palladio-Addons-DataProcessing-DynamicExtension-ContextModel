package org.palladiosimulator.pcm.confidentiality.context.attackanalysis.workflow.query.impl;

import java.util.Map;

import org.osgi.service.component.annotations.Component;
import org.palladiosimulator.pcm.confidentiality.context.attackanalysis.workflow.query.IQuery;

/**
 * 
 * @author Mirko Sowa
 *
 */
@Component(immediate = true, property = { "id=pcm.dataprocessing.analysis.launcher.returnquery", "name=ReturnVariableQuery" })
public class ReturnVariableQuery extends RBACQuery implements IQuery {

	private final static String GOAL_TEMPLATE = "S=[CALLEE, CALL, OP|_], operationCall(OP, CALLEE, CALL),\r\n"
			+ "operationReturnValueType(CALLEE, RETVAL, RT), dataTypeAttribute(RT, '${" + PARAM_ACCESS + "}'),\r\n"
			+ "accessRights(OP, R),\r\n" + "isNoRoleAuthorizedReturnVal(R, S, RETVAL).";

	private static final String ADDITIONAL_THEORY_TEMPLATE = "accessRights(OP, R) :-\n" + 
			"	findall(X, operationProperty(OP, '${" + PARAM_ROLE + "}', X), R).\n" + 
			"	\n" + 
			"isNoRoleAuthorizedReturnVal([], _, _).	\n" + 
			"isNoRoleAuthorizedReturnVal([Role | R], S, RETVAL) :-\n" + 
			"	\\+ returnValue(S, RETVAL, '${" + PARAM_ACCESS + "}', Role),\n" + 
			"	isNoRoleAuthorizedReturnVal(R, S, RETVAL).\n";
	
	
	public ReturnVariableQuery() {
		super(GOAL_TEMPLATE, ADDITIONAL_THEORY_TEMPLATE);
	}	
	
	@Override
	public Map<String, String> getResultVars() {
		return Map.of("Callee", "CALLEE", "Call", "CALL", "Operation", "OP", "Return Value", "RETVAL", "Return Type", "RT", "Roles", "R");
	}
}
