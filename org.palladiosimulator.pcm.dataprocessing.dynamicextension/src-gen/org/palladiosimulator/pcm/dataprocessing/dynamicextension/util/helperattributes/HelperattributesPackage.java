/**
 */
package org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.HelperattributesFactory
 * @model kind="package"
 * @generated
 */
public interface HelperattributesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "helperattributes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.palladiosimulator.org/pcm/dataprocessing/dynamic/util/helperattributes/0.1/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "helperattributes";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HelperattributesPackage eINSTANCE = org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.impl.HelperattributesPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.impl.HelperContainerImpl <em>Helper Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.impl.HelperContainerImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.impl.HelperattributesPackageImpl#getHelperContainer()
	 * @generated
	 */
	int HELPER_CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Shiftcontainer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_CONTAINER__SHIFTCONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Rolecontainer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_CONTAINER__ROLECONTAINER = 1;

	/**
	 * The feature id for the '<em><b>Locationcontainer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_CONTAINER__LOCATIONCONTAINER = 2;

	/**
	 * The number of structural features of the '<em>Helper Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_CONTAINER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.impl.LocationContainerImpl <em>Location Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.impl.LocationContainerImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.impl.HelperattributesPackageImpl#getLocationContainer()
	 * @generated
	 */
	int LOCATION_CONTAINER = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_CONTAINER__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_CONTAINER__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Organisation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_CONTAINER__ORGANISATION = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_CONTAINER__LOCATION = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Location Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_CONTAINER_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.impl.ShiftContainerImpl <em>Shift Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.impl.ShiftContainerImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.impl.HelperattributesPackageImpl#getShiftContainer()
	 * @generated
	 */
	int SHIFT_CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_CONTAINER__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_CONTAINER__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Organisation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_CONTAINER__ORGANISATION = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Shift</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_CONTAINER__SHIFT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Shift Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_CONTAINER_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.impl.RoleContainerImpl <em>Role Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.impl.RoleContainerImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.impl.HelperattributesPackageImpl#getRoleContainer()
	 * @generated
	 */
	int ROLE_CONTAINER = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CONTAINER__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CONTAINER__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Organisation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CONTAINER__ORGANISATION = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CONTAINER__ROLE = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Role Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CONTAINER_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.impl.LocationImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.impl.HelperattributesPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__INCLUDES = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.impl.ShiftImpl <em>Shift</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.impl.ShiftImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.impl.HelperattributesPackageImpl#getShift()
	 * @generated
	 */
	int SHIFT = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT__START_TIME = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT__END_TIME = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Shift</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.impl.RoleImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.impl.HelperattributesPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Subordinateroles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__SUBORDINATEROLES = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.HelperContainer <em>Helper Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Helper Container</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.HelperContainer
	 * @generated
	 */
	EClass getHelperContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.HelperContainer#getShiftcontainer <em>Shiftcontainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Shiftcontainer</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.HelperContainer#getShiftcontainer()
	 * @see #getHelperContainer()
	 * @generated
	 */
	EReference getHelperContainer_Shiftcontainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.HelperContainer#getRolecontainer <em>Rolecontainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rolecontainer</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.HelperContainer#getRolecontainer()
	 * @see #getHelperContainer()
	 * @generated
	 */
	EReference getHelperContainer_Rolecontainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.HelperContainer#getLocationcontainer <em>Locationcontainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Locationcontainer</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.HelperContainer#getLocationcontainer()
	 * @see #getHelperContainer()
	 * @generated
	 */
	EReference getHelperContainer_Locationcontainer();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.LocationContainer <em>Location Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location Container</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.LocationContainer
	 * @generated
	 */
	EClass getLocationContainer();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.LocationContainer#getOrganisation <em>Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Organisation</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.LocationContainer#getOrganisation()
	 * @see #getLocationContainer()
	 * @generated
	 */
	EReference getLocationContainer_Organisation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.LocationContainer#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Location</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.LocationContainer#getLocation()
	 * @see #getLocationContainer()
	 * @generated
	 */
	EReference getLocationContainer_Location();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.ShiftContainer <em>Shift Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shift Container</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.ShiftContainer
	 * @generated
	 */
	EClass getShiftContainer();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.ShiftContainer#getOrganisation <em>Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Organisation</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.ShiftContainer#getOrganisation()
	 * @see #getShiftContainer()
	 * @generated
	 */
	EReference getShiftContainer_Organisation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.ShiftContainer#getShift <em>Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Shift</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.ShiftContainer#getShift()
	 * @see #getShiftContainer()
	 * @generated
	 */
	EReference getShiftContainer_Shift();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.RoleContainer <em>Role Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Container</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.RoleContainer
	 * @generated
	 */
	EClass getRoleContainer();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.RoleContainer#getOrganisation <em>Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Organisation</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.RoleContainer#getOrganisation()
	 * @see #getRoleContainer()
	 * @generated
	 */
	EReference getRoleContainer_Organisation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.RoleContainer#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.RoleContainer#getRole()
	 * @see #getRoleContainer()
	 * @generated
	 */
	EReference getRoleContainer_Role();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the reference list '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.Location#getIncludes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Includes</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.Location#getIncludes()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_Includes();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.Shift <em>Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shift</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.Shift
	 * @generated
	 */
	EClass getShift();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.Shift#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.Shift#getStartTime()
	 * @see #getShift()
	 * @generated
	 */
	EAttribute getShift_StartTime();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.Shift#getEndTime <em>End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Time</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.Shift#getEndTime()
	 * @see #getShift()
	 * @generated
	 */
	EAttribute getShift_EndTime();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the reference list '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.Role#getSubordinateroles <em>Subordinateroles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subordinateroles</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.Role#getSubordinateroles()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Subordinateroles();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HelperattributesFactory getHelperattributesFactory();

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
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.impl.HelperContainerImpl <em>Helper Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.impl.HelperContainerImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.impl.HelperattributesPackageImpl#getHelperContainer()
		 * @generated
		 */
		EClass HELPER_CONTAINER = eINSTANCE.getHelperContainer();

		/**
		 * The meta object literal for the '<em><b>Shiftcontainer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HELPER_CONTAINER__SHIFTCONTAINER = eINSTANCE.getHelperContainer_Shiftcontainer();

		/**
		 * The meta object literal for the '<em><b>Rolecontainer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HELPER_CONTAINER__ROLECONTAINER = eINSTANCE.getHelperContainer_Rolecontainer();

		/**
		 * The meta object literal for the '<em><b>Locationcontainer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HELPER_CONTAINER__LOCATIONCONTAINER = eINSTANCE.getHelperContainer_Locationcontainer();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.impl.LocationContainerImpl <em>Location Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.impl.LocationContainerImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.impl.HelperattributesPackageImpl#getLocationContainer()
		 * @generated
		 */
		EClass LOCATION_CONTAINER = eINSTANCE.getLocationContainer();

		/**
		 * The meta object literal for the '<em><b>Organisation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION_CONTAINER__ORGANISATION = eINSTANCE.getLocationContainer_Organisation();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION_CONTAINER__LOCATION = eINSTANCE.getLocationContainer_Location();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.impl.ShiftContainerImpl <em>Shift Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.impl.ShiftContainerImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.impl.HelperattributesPackageImpl#getShiftContainer()
		 * @generated
		 */
		EClass SHIFT_CONTAINER = eINSTANCE.getShiftContainer();

		/**
		 * The meta object literal for the '<em><b>Organisation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIFT_CONTAINER__ORGANISATION = eINSTANCE.getShiftContainer_Organisation();

		/**
		 * The meta object literal for the '<em><b>Shift</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIFT_CONTAINER__SHIFT = eINSTANCE.getShiftContainer_Shift();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.impl.RoleContainerImpl <em>Role Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.impl.RoleContainerImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.impl.HelperattributesPackageImpl#getRoleContainer()
		 * @generated
		 */
		EClass ROLE_CONTAINER = eINSTANCE.getRoleContainer();

		/**
		 * The meta object literal for the '<em><b>Organisation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_CONTAINER__ORGANISATION = eINSTANCE.getRoleContainer_Organisation();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_CONTAINER__ROLE = eINSTANCE.getRoleContainer_Role();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.impl.LocationImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.impl.HelperattributesPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Includes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__INCLUDES = eINSTANCE.getLocation_Includes();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.impl.ShiftImpl <em>Shift</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.impl.ShiftImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.impl.HelperattributesPackageImpl#getShift()
		 * @generated
		 */
		EClass SHIFT = eINSTANCE.getShift();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIFT__START_TIME = eINSTANCE.getShift_StartTime();

		/**
		 * The meta object literal for the '<em><b>End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIFT__END_TIME = eINSTANCE.getShift_EndTime();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.impl.RoleImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.util.helperattributes.impl.HelperattributesPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Subordinateroles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__SUBORDINATEROLES = eINSTANCE.getRole_Subordinateroles();

	}

} //HelperattributesPackage
