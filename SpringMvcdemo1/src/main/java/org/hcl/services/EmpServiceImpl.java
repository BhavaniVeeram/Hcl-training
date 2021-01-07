package org.hcl.services;

import java.util.List;

import org.hcl.dao.Empdao;
import org.hcl.model.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EmpServiceImpl implements EmpService {
	Empdao empDao;
	public EmpServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	public Empdao getEmpDao() {
		return empDao;
	}
	@Autowired
	public void setEmpDao(Empdao empDao) {
		this.empDao = empDao;
	}
	public EmpServiceImpl(Empdao empDao) {
		super();
		this.empDao = empDao;
	}
	@Override
	public List<Emp> getEmployees() {
		// TODO Auto-generated method stub
		return empDao.getAll();
	}
	

}
