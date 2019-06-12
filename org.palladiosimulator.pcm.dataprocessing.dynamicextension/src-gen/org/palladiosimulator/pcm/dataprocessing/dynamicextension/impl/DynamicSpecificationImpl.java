/**
 */
package org.palladiosimulator.pcm.dataprocessing.dynamicextension.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.palladiosimulator.pcm.dataprocessing.dynamicextension.DynamicSpecification;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension.DynamicextensionPackage;

import org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.HelperContainer;

import org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.subject.Subjects;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dynamic Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.impl.DynamicSpecificationImpl#getSubjectContainer <em>Subject Container</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.impl.DynamicSpecificationImpl#getHelperContainer <em>Helper Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DynamicSpecificationImpl extends CDOObjectImpl implements DynamicSpecification {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DynamicextensionPackage.Literals.DYNAMIC_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Subjects getSubjectContainer() {
		return (Subjects) eGet(DynamicextensionPackage.Literals.DYNAMIC_SPECIFICATION__SUBJECT_CONTAINER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubjectContainer(Subjects newSubjectContainer) {
		eSet(DynamicextensionPackage.Literals.DYNAMIC_SPECIFICATION__SUBJECT_CONTAINER, newSubjectContainer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HelperContainer getHelperContainer() {
		return (HelperContainer) eGet(DynamicextensionPackage.Literals.DYNAMIC_SPECIFICATION__HELPER_CONTAINER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHelperContainer(HelperContainer newHelperContainer) {
		eSet(DynamicextensionPackage.Literals.DYNAMIC_SPECIFICATION__HELPER_CONTAINER, newHelperContainer);
	}

} //DynamicSpecificationImpl
