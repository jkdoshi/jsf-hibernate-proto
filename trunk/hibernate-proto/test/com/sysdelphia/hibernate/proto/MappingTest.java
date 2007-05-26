package com.sysdelphia.hibernate.proto;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import junit.framework.TestCase;

public class MappingTest extends TestCase {

	private SessionFactory sessionFactory;

	protected void setUp() throws Exception {
		super.setUp();
		sessionFactory = new Configuration().configure().buildSessionFactory();
	}

	protected void tearDown() throws Exception {
		sessionFactory.close();
		super.tearDown();
	}

	public void testMain() {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		User user = new User();
		user.setName(new Name("Jitesh", "K", "Doshi"));
		user.setUserName("jdoshi");
		user.setPassword("psssst");
		user.setEmail("foo@bar.com");
		WorkItem workItem = new WorkItem();
		workItem.setDescription("You gotta work hard!");
		workItem.setPriority(3);
		workItem.getNotes().add(new Note("A note to myself!"));
		workItem.setAssignedTo(user);
		user.getWorkItems().add(workItem);
		session.save(user);
		session.getTransaction().commit();
		assertFalse(session.isOpen());
	}
}
