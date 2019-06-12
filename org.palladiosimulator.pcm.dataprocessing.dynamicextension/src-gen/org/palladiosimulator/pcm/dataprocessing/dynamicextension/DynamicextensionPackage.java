/**
 */
package org.palladiosimulator.pcm.dataprocessing.dynamicextension;

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
 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.DynamicextensionFactory
 * @model kind="package"
 * @generated
 */
public interface DynamicextensionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dynamicextension";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.palladiosimulator.org/pcm/dataprocessing/dynamic/0.1/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dynamicextension";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DynamicextensionPackage eINSTANCE = org.palladiosimulator.pcm.dataprocessing.dynamicextension.impl.DynamicextensionPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.impl.DynamicSpecificationImpl <em>Dynamic Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.impl.DynamicSpecificationImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.impl.DynamicextensionPackageImpl#getDynamicSpecification()
	 * @generated
	 */
	int DYNAMIC_SPECIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Subject Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_SPECIFICATION__SUBJECT_CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Helper Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_SPECIFICATION__HELPER_CONTAINER = 1;

	/**
	 * The number of structural features of the '<em>Dynamic Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_SPECIFICATION_FEATURE_COUNT = 2;

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.DynamicSpecification <em>Dynamic Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Specification</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.DynamicSpecification
	 * @generated
	 */
	EClass getDynamicSpecification();

	/**
	 * Returns the meta object for the containment reference '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.DynamicSpecification#getSubjectContainer <em>Subject Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subject Container</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.DynamicSpecification#getSubjectContainer()
	 * @see #getDynamicSpecification()
	 * @generated
	 */
	EReference getDynamicSpecification_SubjectContainer();

	/**
	 * Returns the meta object for the containment reference '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.DynamicSpecification#getHelperContainer <em>Helper Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Helper Container</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.DynamicSpecification#getHelperContainer()
	 * @see #getDynamicSpecification()
	 * @generated
	 */
	EReference getDynamicSpecification_HelperContainer();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DynamicextensionFactory getDynamicextensionFactory();

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
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.impl.DynamicSpecificationImpl <em>Dynamic Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.impl.DynamicSpecificationImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.impl.DynamicextensionPackageImpl#getDynamicSpecification()
		 * @generated
		 */
		EClass DYNAMIC_SPECIFICATION = eINSTANCE.getDynamicSpecification();

		/**
		 * The meta object literal for the '<em><b>Subject Container</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_SPECIFICATION__SUBJECT_CONTAINER = eINSTANCE.getDynamicSpecification_SubjectContainer();

		/**
		 * The meta object literal for the '<em><b>Helper Container</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_SPECIFICATION__HELPER_CONTAINER = eINSTANCE.getDynamicSpecification_HelperContainer();

	}

} //DynamicextensionPackage
