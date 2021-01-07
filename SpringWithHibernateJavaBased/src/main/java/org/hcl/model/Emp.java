package org.hcl.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class Emp {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eno;
	@NotEmpty(message = "name is required")
	private String ename;
	@Size(min =5,max=10,message = "range exceeded")
	private String address;
	public Emp() {
		// TODO Auto-generated constructor stub
	}
	public Emp(int eno, String ename, String address) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.address = address;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
