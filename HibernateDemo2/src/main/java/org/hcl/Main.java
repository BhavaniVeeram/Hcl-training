package org.hcl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		 Configuration conf = new Configuration();
		 conf.configure("hibernate.cfg.xml");
		 SessionFactory factory = conf.buildSessionFactory();
		 Session session = factory.openSession();
		 Student student = new Student(1, "Bhavani", "chennai");
		 Transaction trans = session.beginTransaction();
		 Integer i = (Integer)session.save(student);
		 trans.commit();
		 System.out.println("The Student is "+i+" is inserted");
		 session.close();

	}

}
