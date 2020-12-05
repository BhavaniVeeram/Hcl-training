package org.hcl;

public class SavingsAccount extends Account{
	private String orgName;
	public SavingsAccount() {
		// TODO Auto-generated constructor stub
	}
	public SavingsAccount(String accName, String accNO, String bankName, String orgName) {
		super();
		this.orgName = orgName;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public void display() {
		//call super class display()
		//display org name;
		// call this method with ref of base class;
		super.display();
		System.out.println("Organisation Name:"+getOrgName());
	}
	

}
