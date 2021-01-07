package org.hcl.services;

import java.util.List;

import org.hcl.model.Emp;

public interface EmpService {
	List<Emp> getEmployees();
	Integer insertEmployee(Emp e);
	
}
