package org.hcl.dao;

import java.util.List;

import org.hcl.model.Emp;

public interface Empdao {
	List<Emp> getAll();
	// for inserting
	Integer insert(Emp e);
}
