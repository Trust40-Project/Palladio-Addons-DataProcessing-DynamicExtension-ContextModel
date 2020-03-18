package org.palladiosimulator.pcm.confidentiality.context.attackanalysis.workflow.query.impl;

import java.util.Map;

import org.palladiosimulator.pcm.confidentiality.context.attackanalysis.workflow.query.IQuery;
import org.palladiosimulator.pcm.confidentiality.context.attackanalysis.workflow.query.QueryInformation;

/**
 * Manages the {@link IQuery} with its corresponding {@link QueryInformation}
 * 
 * @author Mirko Sowa
 *
 */
public interface IQueryManager {
	Map<QueryInformation, IQuery> getQueries();
}
