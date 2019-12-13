/**
 */
package org.palladiosimulator.pcm.confidentiality.context.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Related Context Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.model.RelatedContextSet#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.context.model.ModelPackage#getRelatedContextSet()
 * @model
 * @generated
 */
public interface RelatedContextSet extends Context {
    /**
     * Returns the value of the '<em><b>Context</b></em>' reference list.
     * The list contents are of type {@link org.palladiosimulator.pcm.confidentiality.context.model.Context}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Context</em>' reference list.
     * @see org.palladiosimulator.pcm.confidentiality.context.model.ModelPackage#getRelatedContextSet_Context()
     * @model required="true"
     * @generated
     */
    EList<Context> getContext();

} // RelatedContextSet
