package org.hcl.services;

import org.hcl.model.Emp;
import org.springframework.stereotype.Service;


public interface EmpService {
	boolean insertEmployees(Emp e);
}
