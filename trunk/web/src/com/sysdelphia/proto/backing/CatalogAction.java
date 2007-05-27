package com.sysdelphia.proto.backing;

import org.hibernate.Session;

import com.doshiland.fx4web.collections.ListMap;
import com.doshiland.fx4web.collections.ListMapBase;
import com.doshiland.fx4web.hibernate.HibernateUtil;
import com.sysdelphia.hibernate.proto.Catalog;

/**
 * Backing bean to allow manipulation of catalogs and catalog entries.
 * 
 * @author jdoshi
 */
public class CatalogAction {
	private String name;

	private String description;

	private ListMap rows;
	
	private Catalog selected;

	public ListMap getRows() {
		return rows;
	}

	@SuppressWarnings( { "unchecked", "serial" })
	public void fetch() {
		Session session = HibernateUtil.getCurrentSession();
		rows = new ListMapBase(session.createQuery("from Catalog").list()) {
			@Override
			public Object getKey(Object obj) {
				return ((Catalog) obj).getName();
			}
		};
	}

	public void addNew() {
		Catalog catalog = new Catalog();
		catalog.setName(getName());
		catalog.setDescription(getDescription());
		Session session = HibernateUtil.getCurrentSession();
		session.save(catalog);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setRows(ListMap rows) {
		this.rows = rows;
	}

	public Catalog getSelected() {
		return selected;
	}

	public void setSelected(Catalog selected) {
		this.selected = selected;
	}
}
