/**
 */
package org.palladiosimulator.pcm.dataprocessing.dynamicextension2.util.helperattributes.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.cdo.edit.CDOItemProviderAdapter;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.palladiosimulator.pcm.dataprocessing.dynamicextension2.provider.Dynamicextension2EditPlugin;

import org.palladiosimulator.pcm.dataprocessing.dynamicextension2.util.helperattributes.HelperContainer;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension2.util.helperattributes.HelperattributesFactory;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension2.util.helperattributes.HelperattributesPackage;

/**
 * This is the item provider adapter for a {@link org.palladiosimulator.pcm.dataprocessing.dynamicextension2.util.helperattributes.HelperContainer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HelperContainerItemProvider 
	extends CDOItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HelperContainerItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addInternalstatecontainerPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Internalstatecontainer feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInternalstatecontainerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HelperContainer_internalstatecontainer_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HelperContainer_internalstatecontainer_feature", "_UI_HelperContainer_type"),
				 HelperattributesPackage.Literals.HELPER_CONTAINER__INTERNALSTATECONTAINER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(HelperattributesPackage.Literals.HELPER_CONTAINER__SHIFTCONTAINER);
			childrenFeatures.add(HelperattributesPackage.Literals.HELPER_CONTAINER__ROLECONTAINER);
			childrenFeatures.add(HelperattributesPackage.Literals.HELPER_CONTAINER__LOCATIONCONTAINER);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns HelperContainer.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/HelperContainer"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_HelperContainer_type");
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(HelperContainer.class)) {
			case HelperattributesPackage.HELPER_CONTAINER__SHIFTCONTAINER:
			case HelperattributesPackage.HELPER_CONTAINER__ROLECONTAINER:
			case HelperattributesPackage.HELPER_CONTAINER__LOCATIONCONTAINER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(HelperattributesPackage.Literals.HELPER_CONTAINER__SHIFTCONTAINER,
				 HelperattributesFactory.eINSTANCE.createShiftContainer()));

		newChildDescriptors.add
			(createChildParameter
				(HelperattributesPackage.Literals.HELPER_CONTAINER__ROLECONTAINER,
				 HelperattributesFactory.eINSTANCE.createRoleContainer()));

		newChildDescriptors.add
			(createChildParameter
				(HelperattributesPackage.Literals.HELPER_CONTAINER__LOCATIONCONTAINER,
				 HelperattributesFactory.eINSTANCE.createLocationContainer()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Dynamicextension2EditPlugin.INSTANCE;
	}

}
