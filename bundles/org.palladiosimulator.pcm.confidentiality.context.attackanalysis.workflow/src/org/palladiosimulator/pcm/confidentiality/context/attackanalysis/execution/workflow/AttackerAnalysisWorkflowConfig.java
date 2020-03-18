/**
 * 
 */
package org.palladiosimulator.pcm.confidentiality.context.attackanalysis.execution.workflow;

import org.eclipse.emf.common.util.URI;

import de.uka.ipd.sdq.workflow.launchconfig.AbstractWorkflowBasedRunConfiguration;

/**
 * This class encapsulates most of the attributes needed for an {@link AttackerAnalysisWorkflow}.
 * 
 *
 *
 */
public class AttackerAnalysisWorkflowConfig extends AbstractWorkflowBasedRunConfiguration {

    private URI repositoryModel;
    private URI allocationModel;
    private URI contextModel;
    private URI dataModel;
    private URI adversaryModel;



    public URI getRepositoryModel() {
        return repositoryModel;
    }

    public void setRepositoryModel(URI repositoryModel) {
        this.repositoryModel = repositoryModel;
    }

    public URI getAllocationModel() {
        return allocationModel;
    }

    public void setAllocationModel(URI allocationModel) {
        this.allocationModel = allocationModel;
    }

    public URI getContextModel() {
        return contextModel;
    }

    public void setContextModel(URI contextModel) {
        this.contextModel = contextModel;
    }

    public URI getDataModel() {
        return dataModel;
    }

    public void setDataModel(URI dataModel) {
        this.dataModel = dataModel;
    }

    public URI getAdversaryModel() {
        return adversaryModel;
    }

    public void setAdversaryModel(URI adversaryModel) {
        this.adversaryModel = adversaryModel;
    }

    @Override
    public String getErrorMessage() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setDefaults() {
        // TODO Auto-generated method stub

    }

}
