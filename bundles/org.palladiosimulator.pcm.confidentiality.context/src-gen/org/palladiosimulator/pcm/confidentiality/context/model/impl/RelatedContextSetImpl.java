/**
 */
package org.palladiosimulator.pcm.confidentiality.context.model.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.confidentiality.context.model.Context;
import org.palladiosimulator.pcm.confidentiality.context.model.ModelPackage;
import org.palladiosimulator.pcm.confidentiality.context.model.RelatedContextSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Related Context Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.model.impl.RelatedContextSetImpl#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelatedContextSetImpl extends ContextImpl implements RelatedContextSet {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RelatedContextSetImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ModelPackage.Literals.RELATED_CONTEXT_SET;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<Context> getContext() {
        return (EList<Context>) eGet(ModelPackage.Literals.RELATED_CONTEXT_SET__CONTEXT, true);
    }

} //RelatedContextSetImpl
