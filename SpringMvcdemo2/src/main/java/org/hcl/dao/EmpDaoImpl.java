package org.hcl.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.hcl.model.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmpDaoImpl implements EmpDao {
	
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
	@Autowired
	public EmpDaoImpl(DataSource src) {
		super();
		this.src = src;
	}

	@Override
	public boolean insert(Emp e) {
		boolean b = false;
		Connection con = null;
		PreparedStatement pst = null;
		try {
			con = src.getConnection();
			if(con!=null) {
				pst = con.prepareStatement("insert into emp values(?,?,?)");
				pst.setInt(1, e.getEno());
				pst.setString(2, e.getName());
				pst.setString(3, e.getAddress());
				int i = 0;
				i = pst.executeUpdate();
				if(i>0) {
					b = true;
				}
			}
			con.close();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		return b;
	}

}
