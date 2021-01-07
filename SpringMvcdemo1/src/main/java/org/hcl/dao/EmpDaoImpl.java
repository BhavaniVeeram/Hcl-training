package org.hcl.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.hcl.model.Emp;

public class EmpDaoImpl implements Empdao {
	private DataSource src;
	public EmpDaoImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public DataSource getSrc() {
		return src;
	}

	public void setSrc(DataSource src) {
		this.src = src;
	}

	public EmpDaoImpl(DataSource src) {
		super();
		this.src = src;
	}

	@Override
	public List<Emp> getAll() {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		List<Emp> emp = new ArrayList<Emp>();
		try {
			con = src.getConnection();
			if(con!=null) {
				st = con.createStatement();
				rs = st.executeQuery("select * from emp");
				while(rs.next()) {
					emp.add(new Emp(rs.getInt(1), rs.getString(2), rs.getString(3)));
				}
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return emp;
	}

}
