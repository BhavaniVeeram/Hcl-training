package org.hcl;

public class CurrentAccount extends Account {
	String tinNumber;
	public CurrentAccount() {
		// TODO Auto-generated constructor stub
	}
	public CurrentAccount(String accName, String accNo, String bankName, String tinNumber) {
		this.accName = accName;
		this.accNo = accNo;
		this.bankName = bankName;
		this.tinNumber = tinNumber;
	}
	public String getTinNumber() {
		return tinNumber;
	}
	public void setTinNumber(String tinNumber) {
		this.tinNumber = tinNumber;
	}
	public void display() {
		//calls the super class display()
		//display tin name;
		//call this with the ref of base class;
		super.display();
		System.out.println("Tin Number:"+getTinNumber());
		
	}
}
