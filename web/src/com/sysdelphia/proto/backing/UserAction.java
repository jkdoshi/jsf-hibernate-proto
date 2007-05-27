package com.sysdelphia.proto.backing;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.doshiland.fx4web.hibernate.HibernateUtil;
import com.sysdelphia.hibernate.proto.User;

public class UserAction {
	private List<User> rows;

	@SuppressWarnings("unchecked")
	public void fetchRows() {
		Session session = HibernateUtil.getCurrentSession();
		Query query = session.createQuery("from User");
		rows = query.list();
	}

	public List<User> getRows() {
		return rows;
	}
}
