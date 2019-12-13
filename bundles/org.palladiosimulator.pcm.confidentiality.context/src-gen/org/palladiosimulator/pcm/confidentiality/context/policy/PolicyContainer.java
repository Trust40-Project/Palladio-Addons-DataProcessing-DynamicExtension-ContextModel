/**
 */
package org.palladiosimulator.pcm.confidentiality.context.policy;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.policy.PolicyContainer#getPolicies <em>Policies</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.context.policy.PolicyPackage#getPolicyContainer()
 * @model
 * @generated
 */
public interface PolicyContainer extends Entity {
    /**
     * Returns the value of the '<em><b>Policies</b></em>' containment reference list.
     * The list contents are of type {@link org.palladiosimulator.pcm.confidentiality.context.policy.Policy}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Policies</em>' containment reference list.
     * @see org.palladiosimulator.pcm.confidentiality.context.policy.PolicyPackage#getPolicyContainer_Policies()
     * @model containment="true"
     * @generated
     */
    EList<Policy> getPolicies();

} // PolicyContainer
