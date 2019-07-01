/**
 */
package org.palladiosimulator.pcm.dataprocessing.dynamicextension.context;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.palladiosimulator.pcm.core.entity.EntityPackage;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicsPackage;

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
 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ContextFactory
 * @model kind="package"
 * @generated
 */
public interface ContextPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "context";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.palladiosimulator.org/pcm/dataprocessing/dynamic/context/0.1/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "context";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContextPackage eINSTANCE = org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.ContextPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.ContextImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.ContextPackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.EnvironmentalContextImpl <em>Environmental Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.EnvironmentalContextImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.ContextPackageImpl#getEnvironmentalContext()
	 * @generated
	 */
	int ENVIRONMENTAL_CONTEXT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENTAL_CONTEXT__ID = CONTEXT__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENTAL_CONTEXT__ENTITY_NAME = CONTEXT__ENTITY_NAME;

	/**
	 * The number of structural features of the '<em>Environmental Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENTAL_CONTEXT_FEATURE_COUNT = CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.UserDeclaredContextImpl <em>User Declared Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.UserDeclaredContextImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.ContextPackageImpl#getUserDeclaredContext()
	 * @generated
	 */
	int USER_DECLARED_CONTEXT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DECLARED_CONTEXT__ID = CONTEXT__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DECLARED_CONTEXT__ENTITY_NAME = CONTEXT__ENTITY_NAME;

	/**
	 * The number of structural features of the '<em>User Declared Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DECLARED_CONTEXT_FEATURE_COUNT = CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.LocationContextImpl <em>Location Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.LocationContextImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.ContextPackageImpl#getLocationContext()
	 * @generated
	 */
	int LOCATION_CONTEXT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_CONTEXT__ID = ENVIRONMENTAL_CONTEXT__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_CONTEXT__ENTITY_NAME = ENVIRONMENTAL_CONTEXT__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Current Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_CONTEXT__CURRENT_LOCATION = ENVIRONMENTAL_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Location Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_CONTEXT_FEATURE_COUNT = ENVIRONMENTAL_CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.OrganisationContextImpl <em>Organisation Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.OrganisationContextImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.ContextPackageImpl#getOrganisationContext()
	 * @generated
	 */
	int ORGANISATION_CONTEXT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_CONTEXT__ID = ENVIRONMENTAL_CONTEXT__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_CONTEXT__ENTITY_NAME = ENVIRONMENTAL_CONTEXT__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Organisation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_CONTEXT__ORGANISATION = ENVIRONMENTAL_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Organisation Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_CONTEXT_FEATURE_COUNT = ENVIRONMENTAL_CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.ShiftContextImpl <em>Shift Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.ShiftContextImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.ContextPackageImpl#getShiftContext()
	 * @generated
	 */
	int SHIFT_CONTEXT = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_CONTEXT__ID = USER_DECLARED_CONTEXT__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_CONTEXT__ENTITY_NAME = USER_DECLARED_CONTEXT__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Shift</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_CONTEXT__SHIFT = USER_DECLARED_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Shift Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_CONTEXT_FEATURE_COUNT = USER_DECLARED_CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.RoleContextImpl <em>Role Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.RoleContextImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.ContextPackageImpl#getRoleContext()
	 * @generated
	 */
	int ROLE_CONTEXT = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CONTEXT__ID = USER_DECLARED_CONTEXT__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CONTEXT__ENTITY_NAME = USER_DECLARED_CONTEXT__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CONTEXT__ROLE = USER_DECLARED_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Role Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CONTEXT_FEATURE_COUNT = USER_DECLARED_CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.InternalStateContextImpl <em>Internal State Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.InternalStateContextImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.ContextPackageImpl#getInternalStateContext()
	 * @generated
	 */
	int INTERNAL_STATE_CONTEXT = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STATE_CONTEXT__ID = USER_DECLARED_CONTEXT__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STATE_CONTEXT__ENTITY_NAME = USER_DECLARED_CONTEXT__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STATE_CONTEXT__STATE = USER_DECLARED_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STATE_CONTEXT__SUBJECT = USER_DECLARED_CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Internal State Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_STATE_CONTEXT_FEATURE_COUNT = USER_DECLARED_CONTEXT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.ContextCharacteristicImpl <em>Characteristic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.ContextCharacteristicImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.ContextPackageImpl#getContextCharacteristic()
	 * @generated
	 */
	int CONTEXT_CHARACTERISTIC = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_CHARACTERISTIC__ID = CharacteristicsPackage.CHARACTERISTIC__ID;

	/**
	 * The feature id for the '<em><b>Characteristic Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_CHARACTERISTIC__CHARACTERISTIC_TYPE = CharacteristicsPackage.CHARACTERISTIC__CHARACTERISTIC_TYPE;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_CHARACTERISTIC__CONTEXT = CharacteristicsPackage.CHARACTERISTIC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_CHARACTERISTIC_FEATURE_COUNT = CharacteristicsPackage.CHARACTERISTIC_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.ContextCharacteristicTypeImpl <em>Characteristic Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.ContextCharacteristicTypeImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.ContextPackageImpl#getContextCharacteristicType()
	 * @generated
	 */
	int CONTEXT_CHARACTERISTIC_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_CHARACTERISTIC_TYPE__ID = CharacteristicsPackage.CHARACTERISTIC_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_CHARACTERISTIC_TYPE__ENTITY_NAME = CharacteristicsPackage.CHARACTERISTIC_TYPE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_CHARACTERISTIC_TYPE__CONTEXT = CharacteristicsPackage.CHARACTERISTIC_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Characteristic Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_CHARACTERISTIC_TYPE_FEATURE_COUNT = CharacteristicsPackage.CHARACTERISTIC_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.PrivacyLevelContextImpl <em>Privacy Level Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.PrivacyLevelContextImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.ContextPackageImpl#getPrivacyLevelContext()
	 * @generated
	 */
	int PRIVACY_LEVEL_CONTEXT = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY_LEVEL_CONTEXT__ID = USER_DECLARED_CONTEXT__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY_LEVEL_CONTEXT__ENTITY_NAME = USER_DECLARED_CONTEXT__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY_LEVEL_CONTEXT__LEVEL = USER_DECLARED_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Privacy Level Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY_LEVEL_CONTEXT_FEATURE_COUNT = USER_DECLARED_CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.ComparisonContextImpl <em>Comparison Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.ComparisonContextImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.ContextPackageImpl#getComparisonContext()
	 * @generated
	 */
	int COMPARISON_CONTEXT = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_CONTEXT__ID = ENVIRONMENTAL_CONTEXT__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_CONTEXT__ENTITY_NAME = ENVIRONMENTAL_CONTEXT__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Comparison</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_CONTEXT__COMPARISON = ENVIRONMENTAL_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_CONTEXT__THRESHOLD = ENVIRONMENTAL_CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Floating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_CONTEXT__IS_FLOATING = ENVIRONMENTAL_CONTEXT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Comparison Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_CONTEXT_FEATURE_COUNT = ENVIRONMENTAL_CONTEXT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.PrerequisiteContextImpl <em>Prerequisite Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.PrerequisiteContextImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.ContextPackageImpl#getPrerequisiteContext()
	 * @generated
	 */
	int PREREQUISITE_CONTEXT = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE_CONTEXT__ID = USER_DECLARED_CONTEXT__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE_CONTEXT__ENTITY_NAME = USER_DECLARED_CONTEXT__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Prerequisite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE_CONTEXT__PREREQUISITE = USER_DECLARED_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Prerequisite Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE_CONTEXT_FEATURE_COUNT = USER_DECLARED_CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.ExtensionContextImpl <em>Extension Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.ExtensionContextImpl
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.ContextPackageImpl#getExtensionContext()
	 * @generated
	 */
	int EXTENSION_CONTEXT = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_CONTEXT__ID = USER_DECLARED_CONTEXT__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_CONTEXT__ENTITY_NAME = USER_DECLARED_CONTEXT__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Extension Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_CONTEXT__EXTENSION_CODE = USER_DECLARED_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Extension Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_CONTEXT_FEATURE_COUNT = USER_DECLARED_CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.Comparison <em>Comparison</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.Comparison
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.ContextPackageImpl#getComparison()
	 * @generated
	 */
	int COMPARISON = 14;

	/**
	 * The meta object id for the '<em>Number</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Number
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.ContextPackageImpl#getNumber()
	 * @generated
	 */
	int NUMBER = 15;

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.EnvironmentalContext <em>Environmental Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environmental Context</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.EnvironmentalContext
	 * @generated
	 */
	EClass getEnvironmentalContext();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.UserDeclaredContext <em>User Declared Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Declared Context</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.UserDeclaredContext
	 * @generated
	 */
	EClass getUserDeclaredContext();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.LocationContext <em>Location Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location Context</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.LocationContext
	 * @generated
	 */
	EClass getLocationContext();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.LocationContext#getCurrentLocation <em>Current Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Location</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.LocationContext#getCurrentLocation()
	 * @see #getLocationContext()
	 * @generated
	 */
	EReference getLocationContext_CurrentLocation();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.OrganisationContext <em>Organisation Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organisation Context</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.OrganisationContext
	 * @generated
	 */
	EClass getOrganisationContext();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.OrganisationContext#getOrganisation <em>Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Organisation</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.OrganisationContext#getOrganisation()
	 * @see #getOrganisationContext()
	 * @generated
	 */
	EReference getOrganisationContext_Organisation();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ShiftContext <em>Shift Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shift Context</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ShiftContext
	 * @generated
	 */
	EClass getShiftContext();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ShiftContext#getShift <em>Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shift</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ShiftContext#getShift()
	 * @see #getShiftContext()
	 * @generated
	 */
	EReference getShiftContext_Shift();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.RoleContext <em>Role Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Context</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.RoleContext
	 * @generated
	 */
	EClass getRoleContext();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.RoleContext#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.RoleContext#getRole()
	 * @see #getRoleContext()
	 * @generated
	 */
	EReference getRoleContext_Role();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.InternalStateContext <em>Internal State Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal State Context</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.InternalStateContext
	 * @generated
	 */
	EClass getInternalStateContext();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.InternalStateContext#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.InternalStateContext#getState()
	 * @see #getInternalStateContext()
	 * @generated
	 */
	EReference getInternalStateContext_State();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.InternalStateContext#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subject</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.InternalStateContext#getSubject()
	 * @see #getInternalStateContext()
	 * @generated
	 */
	EReference getInternalStateContext_Subject();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ContextCharacteristic <em>Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Characteristic</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ContextCharacteristic
	 * @generated
	 */
	EClass getContextCharacteristic();

	/**
	 * Returns the meta object for the reference list '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ContextCharacteristic#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Context</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ContextCharacteristic#getContext()
	 * @see #getContextCharacteristic()
	 * @generated
	 */
	EReference getContextCharacteristic_Context();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ContextCharacteristicType <em>Characteristic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Characteristic Type</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ContextCharacteristicType
	 * @generated
	 */
	EClass getContextCharacteristicType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ContextCharacteristicType#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Context</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ContextCharacteristicType#getContext()
	 * @see #getContextCharacteristicType()
	 * @generated
	 */
	EReference getContextCharacteristicType_Context();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.PrivacyLevelContext <em>Privacy Level Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Privacy Level Context</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.PrivacyLevelContext
	 * @generated
	 */
	EClass getPrivacyLevelContext();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.PrivacyLevelContext#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.PrivacyLevelContext#getLevel()
	 * @see #getPrivacyLevelContext()
	 * @generated
	 */
	EReference getPrivacyLevelContext_Level();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ComparisonContext <em>Comparison Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparison Context</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ComparisonContext
	 * @generated
	 */
	EClass getComparisonContext();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ComparisonContext#getComparison <em>Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comparison</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ComparisonContext#getComparison()
	 * @see #getComparisonContext()
	 * @generated
	 */
	EAttribute getComparisonContext_Comparison();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ComparisonContext#getThreshold <em>Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Threshold</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ComparisonContext#getThreshold()
	 * @see #getComparisonContext()
	 * @generated
	 */
	EAttribute getComparisonContext_Threshold();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ComparisonContext#isIsFloating <em>Is Floating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Floating</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ComparisonContext#isIsFloating()
	 * @see #getComparisonContext()
	 * @generated
	 */
	EAttribute getComparisonContext_IsFloating();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.PrerequisiteContext <em>Prerequisite Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prerequisite Context</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.PrerequisiteContext
	 * @generated
	 */
	EClass getPrerequisiteContext();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.PrerequisiteContext#getPrerequisite <em>Prerequisite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prerequisite</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.PrerequisiteContext#getPrerequisite()
	 * @see #getPrerequisiteContext()
	 * @generated
	 */
	EReference getPrerequisiteContext_Prerequisite();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ExtensionContext <em>Extension Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension Context</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ExtensionContext
	 * @generated
	 */
	EClass getExtensionContext();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ExtensionContext#getExtensionCode <em>Extension Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension Code</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.ExtensionContext#getExtensionCode()
	 * @see #getExtensionContext()
	 * @generated
	 */
	EAttribute getExtensionContext_ExtensionCode();

	/**
	 * Returns the meta object for enum '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.Comparison <em>Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Comparison</em>'.
	 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.Comparison
	 * @generated
	 */
	EEnum getComparison();

	/**
	 * Returns the meta object for data type '{@link java.lang.Number <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Number</em>'.
	 * @see java.lang.Number
	 * @model instanceClass="java.lang.Number"
	 * @generated
	 */
	EDataType getNumber();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ContextFactory getContextFactory();

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
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.ContextImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.ContextPackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.EnvironmentalContextImpl <em>Environmental Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.EnvironmentalContextImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.ContextPackageImpl#getEnvironmentalContext()
		 * @generated
		 */
		EClass ENVIRONMENTAL_CONTEXT = eINSTANCE.getEnvironmentalContext();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.UserDeclaredContextImpl <em>User Declared Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.UserDeclaredContextImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.ContextPackageImpl#getUserDeclaredContext()
		 * @generated
		 */
		EClass USER_DECLARED_CONTEXT = eINSTANCE.getUserDeclaredContext();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.LocationContextImpl <em>Location Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.LocationContextImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.ContextPackageImpl#getLocationContext()
		 * @generated
		 */
		EClass LOCATION_CONTEXT = eINSTANCE.getLocationContext();

		/**
		 * The meta object literal for the '<em><b>Current Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION_CONTEXT__CURRENT_LOCATION = eINSTANCE.getLocationContext_CurrentLocation();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.OrganisationContextImpl <em>Organisation Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.OrganisationContextImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.ContextPackageImpl#getOrganisationContext()
		 * @generated
		 */
		EClass ORGANISATION_CONTEXT = eINSTANCE.getOrganisationContext();

		/**
		 * The meta object literal for the '<em><b>Organisation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANISATION_CONTEXT__ORGANISATION = eINSTANCE.getOrganisationContext_Organisation();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.ShiftContextImpl <em>Shift Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.ShiftContextImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.ContextPackageImpl#getShiftContext()
		 * @generated
		 */
		EClass SHIFT_CONTEXT = eINSTANCE.getShiftContext();

		/**
		 * The meta object literal for the '<em><b>Shift</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIFT_CONTEXT__SHIFT = eINSTANCE.getShiftContext_Shift();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.RoleContextImpl <em>Role Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.RoleContextImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.ContextPackageImpl#getRoleContext()
		 * @generated
		 */
		EClass ROLE_CONTEXT = eINSTANCE.getRoleContext();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_CONTEXT__ROLE = eINSTANCE.getRoleContext_Role();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.InternalStateContextImpl <em>Internal State Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.InternalStateContextImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.ContextPackageImpl#getInternalStateContext()
		 * @generated
		 */
		EClass INTERNAL_STATE_CONTEXT = eINSTANCE.getInternalStateContext();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_STATE_CONTEXT__STATE = eINSTANCE.getInternalStateContext_State();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_STATE_CONTEXT__SUBJECT = eINSTANCE.getInternalStateContext_Subject();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.ContextCharacteristicImpl <em>Characteristic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.ContextCharacteristicImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.ContextPackageImpl#getContextCharacteristic()
		 * @generated
		 */
		EClass CONTEXT_CHARACTERISTIC = eINSTANCE.getContextCharacteristic();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_CHARACTERISTIC__CONTEXT = eINSTANCE.getContextCharacteristic_Context();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.ContextCharacteristicTypeImpl <em>Characteristic Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.ContextCharacteristicTypeImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.ContextPackageImpl#getContextCharacteristicType()
		 * @generated
		 */
		EClass CONTEXT_CHARACTERISTIC_TYPE = eINSTANCE.getContextCharacteristicType();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_CHARACTERISTIC_TYPE__CONTEXT = eINSTANCE.getContextCharacteristicType_Context();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.PrivacyLevelContextImpl <em>Privacy Level Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.PrivacyLevelContextImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.ContextPackageImpl#getPrivacyLevelContext()
		 * @generated
		 */
		EClass PRIVACY_LEVEL_CONTEXT = eINSTANCE.getPrivacyLevelContext();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIVACY_LEVEL_CONTEXT__LEVEL = eINSTANCE.getPrivacyLevelContext_Level();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.ComparisonContextImpl <em>Comparison Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.ComparisonContextImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.ContextPackageImpl#getComparisonContext()
		 * @generated
		 */
		EClass COMPARISON_CONTEXT = eINSTANCE.getComparisonContext();

		/**
		 * The meta object literal for the '<em><b>Comparison</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARISON_CONTEXT__COMPARISON = eINSTANCE.getComparisonContext_Comparison();

		/**
		 * The meta object literal for the '<em><b>Threshold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARISON_CONTEXT__THRESHOLD = eINSTANCE.getComparisonContext_Threshold();

		/**
		 * The meta object literal for the '<em><b>Is Floating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARISON_CONTEXT__IS_FLOATING = eINSTANCE.getComparisonContext_IsFloating();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.PrerequisiteContextImpl <em>Prerequisite Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.PrerequisiteContextImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.ContextPackageImpl#getPrerequisiteContext()
		 * @generated
		 */
		EClass PREREQUISITE_CONTEXT = eINSTANCE.getPrerequisiteContext();

		/**
		 * The meta object literal for the '<em><b>Prerequisite</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREREQUISITE_CONTEXT__PREREQUISITE = eINSTANCE.getPrerequisiteContext_Prerequisite();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.ExtensionContextImpl <em>Extension Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.ExtensionContextImpl
		 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.ContextPackageImpl#getExtensionContext()
		 * @generated
		 */
		EClass EXTENSION_CONTEXT = eINSTANCE.getExtensionContext();

		/**
		 * The meta object literal for the '<em><b>Extension Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION_CONTEXT__EXTENSION_CODE = eINSTANCE.getExtensionContext_ExtensionCode();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.Comparison <em>Comparison</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.Comparison
		 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.ContextPackageImpl#getComparison()
		 * @generated
		 */
		EEnum COMPARISON = eINSTANCE.getComparison();

		/**
		 * The meta object literal for the '<em>Number</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Number
		 * @see org.palladiosimulator.pcm.dataprocessing.dynamicextension.context.impl.ContextPackageImpl#getNumber()
		 * @generated
		 */
		EDataType NUMBER = eINSTANCE.getNumber();

	}

} //ContextPackage
