package org.hcl1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String detail;
		System.out.println("Enter account Detail (accountNumber,balance,accountHolderName,minimunBalance,lockingPeriod):");
		detail = sc.nextLine();
		AccountBO a = new AccountBO(detail);
		FixedAccount b;
		b = a.getAccountDetail(detail);
		a.show();

		

	}

}
