package org.hcl.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hcl.model.Emp;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class EmpDaoImpl implements Empdao {
	SessionFactory sessionFactory;
	public EmpDaoImpl() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	public EmpDaoImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	@Override
	public List<Emp> getAll() {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from org.hcl.model.Emp");
		List<Emp> emps = query.list();
		return emps;
}
	@Transactional
	@Override
	public Integer insert(Emp e) {
		Session session = sessionFactory.getCurrentSession();
		Integer i = (Integer)session.save(e);
		return i;
	}
}
