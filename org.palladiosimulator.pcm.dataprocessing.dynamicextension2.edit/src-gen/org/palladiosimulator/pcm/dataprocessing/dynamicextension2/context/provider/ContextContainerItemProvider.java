/**
 */
package org.palladiosimulator.pcm.dataprocessing.dynamicextension2.context.provider;


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
import org.palladiosimulator.pcm.dataprocessing.dynamicextension2.context.ContextContainer;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension2.context.ContextFactory;
import org.palladiosimulator.pcm.dataprocessing.dynamicextension2.context.ContextPackage;

import org.palladiosimulator.pcm.dataprocessing.dynamicextension2.provider.Dynamicextension2EditPlugin;

/**
 * This is the item provider adapter for a {@link org.palladiosimulator.pcm.dataprocessing.dynamicextension2.context.ContextContainer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ContextContainerItemProvider 
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
	public ContextContainerItemProvider(AdapterFactory adapterFactory) {
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

			addContextsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Contexts feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContextsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContextContainer_contexts_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContextContainer_contexts_feature", "_UI_ContextContainer_type"),
				 ContextPackage.Literals.CONTEXT_CONTAINER__CONTEXTS,
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
			childrenFeatures.add(ContextPackage.Literals.CONTEXT_CONTAINER__CONTEXTS);
			childrenFeatures.add(ContextPackage.Literals.CONTEXT_CONTAINER__PERMISSIONS);
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
	 * This returns ContextContainer.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ContextContainer"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ContextContainer_type");
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

		switch (notification.getFeatureID(ContextContainer.class)) {
			case ContextPackage.CONTEXT_CONTAINER__CONTEXTS:
			case ContextPackage.CONTEXT_CONTAINER__PERMISSIONS:
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
				(ContextPackage.Literals.CONTEXT_CONTAINER__CONTEXTS,
				 ContextFactory.eINSTANCE.createPrivacyLevelContext()));

		newChildDescriptors.add
			(createChildParameter
				(ContextPackage.Literals.CONTEXT_CONTAINER__CONTEXTS,
				 ContextFactory.eINSTANCE.createShiftContext()));

		newChildDescriptors.add
			(createChildParameter
				(ContextPackage.Literals.CONTEXT_CONTAINER__CONTEXTS,
				 ContextFactory.eINSTANCE.createInternalStateContext()));

		newChildDescriptors.add
			(createChildParameter
				(ContextPackage.Literals.CONTEXT_CONTAINER__CONTEXTS,
				 ContextFactory.eINSTANCE.createRoleContext()));

		newChildDescriptors.add
			(createChildParameter
				(ContextPackage.Literals.CONTEXT_CONTAINER__CONTEXTS,
				 ContextFactory.eINSTANCE.createLocationContext()));

		newChildDescriptors.add
			(createChildParameter
				(ContextPackage.Literals.CONTEXT_CONTAINER__CONTEXTS,
				 ContextFactory.eINSTANCE.createOrganizationContext()));

		newChildDescriptors.add
			(createChildParameter
				(ContextPackage.Literals.CONTEXT_CONTAINER__PERMISSIONS,
				 ContextFactory.eINSTANCE.createPermission()));
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
