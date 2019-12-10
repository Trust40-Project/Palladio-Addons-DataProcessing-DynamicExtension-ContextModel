/**
 */
package org.palladiosimulator.pcm.confidentiality.context.model.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.confidentiality.context.model.HierachicalContext;
import org.palladiosimulator.pcm.confidentiality.context.model.ModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hierachical Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.model.impl.HierachicalContextImpl#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HierachicalContextImpl extends ContextImpl implements HierachicalContext {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected HierachicalContextImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ModelPackage.Literals.HIERACHICAL_CONTEXT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HierachicalContext getParent() {
        return (HierachicalContext) eGet(ModelPackage.Literals.HIERACHICAL_CONTEXT__PARENT, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setParent(HierachicalContext newParent) {
        eSet(ModelPackage.Literals.HIERACHICAL_CONTEXT__PARENT, newParent);
    }

} //HierachicalContextImpl
