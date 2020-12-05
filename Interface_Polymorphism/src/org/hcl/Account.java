package org.hcl;

public class Account {
	protected String accName, accNo, bankName;
	public Account() {
	}
	public Account(String accName, String accNo, String bankName) {
		super();
		this.accName = accName;
		this.accNo = accNo;
		this.bankName = bankName;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	protected void display() {
		//display the ac details;
		System.out.println("Account Name:"+getAccName()+"\nAccount Number:"+getAccNo()+"\nBank Name:"+getBankName());
	}

}
