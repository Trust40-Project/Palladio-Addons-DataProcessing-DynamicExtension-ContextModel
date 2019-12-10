/**
 */
package org.palladiosimulator.pcm.confidentiality.context.model;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.pcm.confidentiality.context.model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "model";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.palladiosimulator.org/pcm/confidentiality/context/model/0.1/";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "model";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ModelPackage eINSTANCE = org.palladiosimulator.pcm.confidentiality.context.model.impl.ModelPackageImpl.init();

    /**
     * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.context.model.impl.ContextImpl <em>Context</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.pcm.confidentiality.context.model.impl.ContextImpl
     * @see org.palladiosimulator.pcm.confidentiality.context.model.impl.ModelPackageImpl#getContext()
     * @generated
     */
    int CONTEXT = 3;

    /**
     * The number of structural features of the '<em>Context</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.context.model.impl.HierachicalContextImpl <em>Hierachical Context</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.pcm.confidentiality.context.model.impl.HierachicalContextImpl
     * @see org.palladiosimulator.pcm.confidentiality.context.model.impl.ModelPackageImpl#getHierachicalContext()
     * @generated
     */
    int HIERACHICAL_CONTEXT = 0;

    /**
     * The feature id for the '<em><b>Parent</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HIERACHICAL_CONTEXT__PARENT = CONTEXT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Hierachical Context</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HIERACHICAL_CONTEXT_FEATURE_COUNT = CONTEXT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.context.model.impl.SingleAttributeContextImpl <em>Single Attribute Context</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.pcm.confidentiality.context.model.impl.SingleAttributeContextImpl
     * @see org.palladiosimulator.pcm.confidentiality.context.model.impl.ModelPackageImpl#getSingleAttributeContext()
     * @generated
     */
    int SINGLE_ATTRIBUTE_CONTEXT = 1;

    /**
     * The number of structural features of the '<em>Single Attribute Context</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SINGLE_ATTRIBUTE_CONTEXT_FEATURE_COUNT = CONTEXT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.context.model.impl.RelatedContextImpl <em>Related Context</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.pcm.confidentiality.context.model.impl.RelatedContextImpl
     * @see org.palladiosimulator.pcm.confidentiality.context.model.impl.ModelPackageImpl#getRelatedContext()
     * @generated
     */
    int RELATED_CONTEXT = 2;

    /**
     * The number of structural features of the '<em>Related Context</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATED_CONTEXT_FEATURE_COUNT = CONTEXT_FEATURE_COUNT + 0;

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.context.model.HierachicalContext <em>Hierachical Context</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Hierachical Context</em>'.
     * @see org.palladiosimulator.pcm.confidentiality.context.model.HierachicalContext
     * @generated
     */
    EClass getHierachicalContext();

    /**
     * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.confidentiality.context.model.HierachicalContext#getParent <em>Parent</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Parent</em>'.
     * @see org.palladiosimulator.pcm.confidentiality.context.model.HierachicalContext#getParent()
     * @see #getHierachicalContext()
     * @generated
     */
    EReference getHierachicalContext_Parent();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.context.model.SingleAttributeContext <em>Single Attribute Context</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Single Attribute Context</em>'.
     * @see org.palladiosimulator.pcm.confidentiality.context.model.SingleAttributeContext
     * @generated
     */
    EClass getSingleAttributeContext();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.context.model.RelatedContext <em>Related Context</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Related Context</em>'.
     * @see org.palladiosimulator.pcm.confidentiality.context.model.RelatedContext
     * @generated
     */
    EClass getRelatedContext();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.context.model.Context <em>Context</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Context</em>'.
     * @see org.palladiosimulator.pcm.confidentiality.context.model.Context
     * @generated
     */
    EClass getContext();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ModelFactory getModelFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.context.model.impl.HierachicalContextImpl <em>Hierachical Context</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.pcm.confidentiality.context.model.impl.HierachicalContextImpl
         * @see org.palladiosimulator.pcm.confidentiality.context.model.impl.ModelPackageImpl#getHierachicalContext()
         * @generated
         */
        EClass HIERACHICAL_CONTEXT = eINSTANCE.getHierachicalContext();

        /**
         * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference HIERACHICAL_CONTEXT__PARENT = eINSTANCE.getHierachicalContext_Parent();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.context.model.impl.SingleAttributeContextImpl <em>Single Attribute Context</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.pcm.confidentiality.context.model.impl.SingleAttributeContextImpl
         * @see org.palladiosimulator.pcm.confidentiality.context.model.impl.ModelPackageImpl#getSingleAttributeContext()
         * @generated
         */
        EClass SINGLE_ATTRIBUTE_CONTEXT = eINSTANCE.getSingleAttributeContext();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.context.model.impl.RelatedContextImpl <em>Related Context</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.pcm.confidentiality.context.model.impl.RelatedContextImpl
         * @see org.palladiosimulator.pcm.confidentiality.context.model.impl.ModelPackageImpl#getRelatedContext()
         * @generated
         */
        EClass RELATED_CONTEXT = eINSTANCE.getRelatedContext();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.context.model.impl.ContextImpl <em>Context</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.pcm.confidentiality.context.model.impl.ContextImpl
         * @see org.palladiosimulator.pcm.confidentiality.context.model.impl.ModelPackageImpl#getContext()
         * @generated
         */
        EClass CONTEXT = eINSTANCE.getContext();

    }

} //ModelPackage
