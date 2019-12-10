/**
 */
package org.palladiosimulator.pcm.confidentiality.context.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hierachical Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.model.HierachicalContext#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.context.model.ModelPackage#getHierachicalContext()
 * @model
 * @generated
 */
public interface HierachicalContext extends Context {
    /**
     * Returns the value of the '<em><b>Parent</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent</em>' reference.
     * @see #setParent(HierachicalContext)
     * @see org.palladiosimulator.pcm.confidentiality.context.model.ModelPackage#getHierachicalContext_Parent()
     * @model
     * @generated
     */
    HierachicalContext getParent();

    /**
     * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.context.model.HierachicalContext#getParent <em>Parent</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent</em>' reference.
     * @see #getParent()
     * @generated
     */
    void setParent(HierachicalContext value);

} // HierachicalContext
