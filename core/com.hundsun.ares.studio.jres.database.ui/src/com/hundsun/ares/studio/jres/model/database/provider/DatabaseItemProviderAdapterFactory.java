/**
 */
package com.hundsun.ares.studio.jres.model.database.provider;

import com.hundsun.ares.studio.jres.model.database.util.DatabaseAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DatabaseItemProviderAdapterFactory extends DatabaseAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.hundsun.ares.studio.jres.model.database.DBModuleCommonProperty} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DBModuleCommonPropertyItemProvider dbModuleCommonPropertyItemProvider;

	/**
	 * This creates an adapter for a {@link com.hundsun.ares.studio.jres.model.database.DBModuleCommonProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDBModuleCommonPropertyAdapter() {
		if (dbModuleCommonPropertyItemProvider == null) {
			dbModuleCommonPropertyItemProvider = new DBModuleCommonPropertyItemProvider(this);
		}

		return dbModuleCommonPropertyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.hundsun.ares.studio.jres.model.database.DatabaseResourceData} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabaseResourceDataItemProvider databaseResourceDataItemProvider;

	/**
	 * This creates an adapter for a {@link com.hundsun.ares.studio.jres.model.database.DatabaseResourceData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDatabaseResourceDataAdapter() {
		if (databaseResourceDataItemProvider == null) {
			databaseResourceDataItemProvider = new DatabaseResourceDataItemProvider(this);
		}

		return databaseResourceDataItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.hundsun.ares.studio.jres.model.database.TableResourceData} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableResourceDataItemProvider tableResourceDataItemProvider;

	/**
	 * This creates an adapter for a {@link com.hundsun.ares.studio.jres.model.database.TableResourceData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTableResourceDataAdapter() {
		if (tableResourceDataItemProvider == null) {
			tableResourceDataItemProvider = new TableResourceDataItemProvider(this);
		}

		return tableResourceDataItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.hundsun.ares.studio.jres.model.database.TableColumn} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableColumnItemProvider tableColumnItemProvider;

	/**
	 * This creates an adapter for a {@link com.hundsun.ares.studio.jres.model.database.TableColumn}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTableColumnAdapter() {
		if (tableColumnItemProvider == null) {
			tableColumnItemProvider = new TableColumnItemProvider(this);
		}

		return tableColumnItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.hundsun.ares.studio.jres.model.database.TableIndexColumn} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableIndexColumnItemProvider tableIndexColumnItemProvider;

	/**
	 * This creates an adapter for a {@link com.hundsun.ares.studio.jres.model.database.TableIndexColumn}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTableIndexColumnAdapter() {
		if (tableIndexColumnItemProvider == null) {
			tableIndexColumnItemProvider = new TableIndexColumnItemProvider(this);
		}

		return tableIndexColumnItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.hundsun.ares.studio.jres.model.database.TableIndex} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableIndexItemProvider tableIndexItemProvider;

	/**
	 * This creates an adapter for a {@link com.hundsun.ares.studio.jres.model.database.TableIndex}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTableIndexAdapter() {
		if (tableIndexItemProvider == null) {
			tableIndexItemProvider = new TableIndexItemProvider(this);
		}

		return tableIndexItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.hundsun.ares.studio.jres.model.database.ViewResourceData} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewResourceDataItemProvider viewResourceDataItemProvider;

	/**
	 * This creates an adapter for a {@link com.hundsun.ares.studio.jres.model.database.ViewResourceData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createViewResourceDataAdapter() {
		if (viewResourceDataItemProvider == null) {
			viewResourceDataItemProvider = new ViewResourceDataItemProvider(this);
		}

		return viewResourceDataItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.hundsun.ares.studio.jres.model.database.DBGenContext} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DBGenContextItemProvider dbGenContextItemProvider;

	/**
	 * This creates an adapter for a {@link com.hundsun.ares.studio.jres.model.database.DBGenContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDBGenContextAdapter() {
		if (dbGenContextItemProvider == null) {
			dbGenContextItemProvider = new DBGenContextItemProvider(this);
		}

		return dbGenContextItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.hundsun.ares.studio.jres.model.database.ForeignKey} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForeignKeyItemProvider foreignKeyItemProvider;

	/**
	 * This creates an adapter for a {@link com.hundsun.ares.studio.jres.model.database.ForeignKey}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createForeignKeyAdapter() {
		if (foreignKeyItemProvider == null) {
			foreignKeyItemProvider = new ForeignKeyItemProvider(this);
		}

		return foreignKeyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.hundsun.ares.studio.jres.model.database.TableKey} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableKeyItemProvider tableKeyItemProvider;

	/**
	 * This creates an adapter for a {@link com.hundsun.ares.studio.jres.model.database.TableKey}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTableKeyAdapter() {
		if (tableKeyItemProvider == null) {
			tableKeyItemProvider = new TableKeyItemProvider(this);
		}

		return tableKeyItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (dbModuleCommonPropertyItemProvider != null) dbModuleCommonPropertyItemProvider.dispose();
		if (databaseResourceDataItemProvider != null) databaseResourceDataItemProvider.dispose();
		if (tableResourceDataItemProvider != null) tableResourceDataItemProvider.dispose();
		if (tableColumnItemProvider != null) tableColumnItemProvider.dispose();
		if (tableIndexColumnItemProvider != null) tableIndexColumnItemProvider.dispose();
		if (tableIndexItemProvider != null) tableIndexItemProvider.dispose();
		if (viewResourceDataItemProvider != null) viewResourceDataItemProvider.dispose();
		if (dbGenContextItemProvider != null) dbGenContextItemProvider.dispose();
		if (foreignKeyItemProvider != null) foreignKeyItemProvider.dispose();
		if (tableKeyItemProvider != null) tableKeyItemProvider.dispose();
	}

}