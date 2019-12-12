/**
 */
package org.palladiosimulator.pcm.confidentiality.context.model;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.core.entity.Entity;

import org.palladiosimulator.pcm.repository.RepositoryComponent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.model.Context#getRepositorycomponent <em>Repositorycomponent</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.context.model.ModelPackage#getContext()
 * @model abstract="true"
 * @generated
 */
public interface Context extends Entity {
    /**
     * Returns the value of the '<em><b>Repositorycomponent</b></em>' reference list.
     * The list contents are of type {@link org.palladiosimulator.pcm.repository.RepositoryComponent}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Repositorycomponent</em>' reference list.
     * @see org.palladiosimulator.pcm.confidentiality.context.model.ModelPackage#getContext_Repositorycomponent()
     * @model
     * @generated
     */
    EList<RepositoryComponent> getRepositorycomponent();

} // Context
