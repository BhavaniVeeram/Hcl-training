package org.hcl;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String line, acName, bankName, orgName, acNum, tinNum;
		Scanner sc = new Scanner(System.in);
		Account a = new Account();
		CurrentAccount c = new CurrentAccount();
		SavingsAccount s= new SavingsAccount();
		System.out.println("Choose Account Type\n1.Savings Account\n2.Current Account");
		int acType = sc.nextInt();
		sc.nextLine();
		if (acType ==1) {
		System.out.println("Enter Account details in comma separated(Account Name,Account Number,Bank Name,Organisation Name");
		line = sc.nextLine();
		String[] array = new String[5];
		array = line.split(",");
		acName = array[0];
		acNum = array[1];
		bankName = array[2]; 
		orgName = array[3];
		s.setAccName(acName);
		s.setAccNo(acNum);
		s.setBankName(bankName);
		s.setOrgName(orgName);
		s.display();
		
	}else if (acType == 2) {
		System.out.println("Enter Account details in comma separated(Account Name,Account Number,Bank Name,TIN Number");
		line = sc.nextLine();
		String[] array = new String[5];
		array = line.split(",");
		acName = array[0];
		acNum = array[1];
		bankName = array[2]; 
		tinNum = array[3];
		c.setAccName(acName);
		c.setAccNo(acNum);
		c.setBankName(bankName);
		c.setTinNumber(tinNum);
		c.display();
	}
		
	}

}
