package com.sysdelphia.proto.backing;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.doshiland.fx4web.hibernate.HibernateUtil;
import com.sysdelphia.hibernate.proto.WorkItem;

public class WorkItemAction {
	private List<WorkItem> rows = new ArrayList();

	private String userName;

	public void fetchByUser() {
		if (getUserName() != null) {
			Session session = HibernateUtil.getCurrentSession();
			Query query = session
					.createQuery("from WorkItem where assignedTo.userName=:userName");
			query.setString("userName", getUserName());
			rows = query.list();
		}
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<WorkItem> getRows() {
		return rows;
	}

	public void setRows(List<WorkItem> rows) {
		this.rows = rows;
	}
}
