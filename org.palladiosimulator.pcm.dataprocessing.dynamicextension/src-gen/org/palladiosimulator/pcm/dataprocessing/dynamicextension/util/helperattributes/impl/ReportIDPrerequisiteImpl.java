/**
 */
package org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.HelperattributesPackage;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.ReportIDPrerequisite;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Report ID Prerequisite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.impl.ReportIDPrerequisiteImpl#getReportId <em>Report Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReportIDPrerequisiteImpl extends PrerequisiteImpl implements ReportIDPrerequisite {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReportIDPrerequisiteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HelperattributesPackage.Literals.REPORT_ID_PREREQUISITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReportId() {
		return (String) eGet(HelperattributesPackage.Literals.REPORT_ID_PREREQUISITE__REPORT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReportId(String newReportId) {
		eSet(HelperattributesPackage.Literals.REPORT_ID_PREREQUISITE__REPORT_ID, newReportId);
	}

} //ReportIDPrerequisiteImpl
