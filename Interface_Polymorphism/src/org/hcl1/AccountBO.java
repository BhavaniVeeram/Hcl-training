package org.hcl1;

public class AccountBO {
	String detail;
	
	public AccountBO(String detail) {
		super();
		this.detail = detail;
	}

	public FixedAccount getAccountDetail(String detail) {
		FixedAccount fixedAccount = new FixedAccount();
		System.out.format("%-20s %-10s %-20s %-20s %s\n","Account Number","Balance","Account holder name","Minimum balance","Locking period");
		return fixedAccount;
	}
	public void show() {
		String[] array = new String[10];
		array = detail.split(",");
		String accountNumber = array[0];
		double balance = Double.parseDouble(array[1]);
		String accountHolderName = array[2];
		double minimunBalance = Double.parseDouble(array[3]);
		int lockingPeriod = Integer.parseInt(array[4]);
		System.out.format("%-20s %-10s %-20s %-20s %s\n",accountNumber,balance,accountHolderName,minimunBalance,lockingPeriod);


	}
}
