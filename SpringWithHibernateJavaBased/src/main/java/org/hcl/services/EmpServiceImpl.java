package org.hcl.services;

import java.util.ArrayList;
import java.util.List;

import org.hcl.dao.Empdao;
import org.hcl.model.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EmpServiceImpl implements EmpService {
	Empdao dao;
	public EmpServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public List<Emp> getEmployees() {	
		return dao.getAll();
	}

	@Autowired
	public EmpServiceImpl(Empdao dao) {
		super();
		this.dao = dao;
	}
	@Override
	public Integer insertEmployee(Emp e) {
		
		return dao.insert(e);
	}

}
