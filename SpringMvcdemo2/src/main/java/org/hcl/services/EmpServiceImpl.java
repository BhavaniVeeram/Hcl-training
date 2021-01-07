package org.hcl.services;

import org.hcl.dao.EmpDao;
import org.hcl.model.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpServiceImpl implements EmpService {
	private EmpDao empDao;

	public EmpServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	@Autowired
	public EmpServiceImpl(EmpDao empDao) {
		super();
		this.empDao = empDao;
	}
	
	public EmpDao getEmpDao() {
		return empDao;
	}

	public void setEmpDao(EmpDao empDao) {
		this.empDao = empDao;
	}

	@Override
	public boolean insertEmployees(Emp e) {

		return empDao.insert(e);
	}

}
