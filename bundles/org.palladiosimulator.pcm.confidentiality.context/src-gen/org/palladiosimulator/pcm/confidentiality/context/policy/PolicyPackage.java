/**
 */
package org.palladiosimulator.pcm.confidentiality.context.policy;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.palladiosimulator.pcm.core.entity.EntityPackage;

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
 * @see org.palladiosimulator.pcm.confidentiality.context.policy.PolicyFactory
 * @model kind="package"
 * @generated
 */
public interface PolicyPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "policy";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.palladiosimulator.org/pcm/confidentiality/context/policy/0.1/";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "policy";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    PolicyPackage eINSTANCE = org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyPackageImpl.init();

    /**
     * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyContainerImpl <em>Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyContainerImpl
     * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyPackageImpl#getPolicyContainer()
     * @generated
     */
    int POLICY_CONTAINER = 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLICY_CONTAINER__ID = EntityPackage.ENTITY__ID;

    /**
     * The feature id for the '<em><b>Entity Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLICY_CONTAINER__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

    /**
     * The feature id for the '<em><b>Policies</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLICY_CONTAINER__POLICIES = EntityPackage.ENTITY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Container</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLICY_CONTAINER_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyImpl <em>Policy</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyImpl
     * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyPackageImpl#getPolicy()
     * @generated
     */
    int POLICY = 1;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLICY__ID = EntityPackage.ENTITY__ID;

    /**
     * The feature id for the '<em><b>Entity Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLICY__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

    /**
     * The feature id for the '<em><b>Contexts</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLICY__CONTEXTS = EntityPackage.ENTITY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Policy</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POLICY_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.context.policy.PolicyContainer <em>Container</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Container</em>'.
     * @see org.palladiosimulator.pcm.confidentiality.context.policy.PolicyContainer
     * @generated
     */
    EClass getPolicyContainer();

    /**
     * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.confidentiality.context.policy.PolicyContainer#getPolicies <em>Policies</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Policies</em>'.
     * @see org.palladiosimulator.pcm.confidentiality.context.policy.PolicyContainer#getPolicies()
     * @see #getPolicyContainer()
     * @generated
     */
    EReference getPolicyContainer_Policies();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.pcm.confidentiality.context.policy.Policy <em>Policy</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Policy</em>'.
     * @see org.palladiosimulator.pcm.confidentiality.context.policy.Policy
     * @generated
     */
    EClass getPolicy();

    /**
     * Returns the meta object for the reference list '{@link org.palladiosimulator.pcm.confidentiality.context.policy.Policy#getContexts <em>Contexts</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Contexts</em>'.
     * @see org.palladiosimulator.pcm.confidentiality.context.policy.Policy#getContexts()
     * @see #getPolicy()
     * @generated
     */
    EReference getPolicy_Contexts();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    PolicyFactory getPolicyFactory();

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
         * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyContainerImpl <em>Container</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyContainerImpl
         * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyPackageImpl#getPolicyContainer()
         * @generated
         */
        EClass POLICY_CONTAINER = eINSTANCE.getPolicyContainer();

        /**
         * The meta object literal for the '<em><b>Policies</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference POLICY_CONTAINER__POLICIES = eINSTANCE.getPolicyContainer_Policies();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyImpl <em>Policy</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyImpl
         * @see org.palladiosimulator.pcm.confidentiality.context.policy.impl.PolicyPackageImpl#getPolicy()
         * @generated
         */
        EClass POLICY = eINSTANCE.getPolicy();

        /**
         * The meta object literal for the '<em><b>Contexts</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference POLICY__CONTEXTS = eINSTANCE.getPolicy_Contexts();

    }

} //PolicyPackage
