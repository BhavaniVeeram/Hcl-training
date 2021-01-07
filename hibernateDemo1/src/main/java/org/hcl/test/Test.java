package org.hcl.test;

import org.hcl.model.Emp;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Emp e = new Emp(10, "suresh", "chennai");
		Transaction trans = session.beginTransaction();
		Integer i = (Integer)session.save(e);
		trans.commit();
		System.out.println("The Empoyees with number "+i+" inserted successfully");

	}

}
