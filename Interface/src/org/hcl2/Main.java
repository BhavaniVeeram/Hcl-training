package org.hcl2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int amt, years;
		
		System.out.println("Enter the amount you want to invest");
		amt = sc.nextInt();
		System.out.println("Enter the tenure of the SIP");
		years = sc.nextInt();
		
		AxisBank a = new AxisBank(amt, years);
		Icici i = new Icici(amt, years);
		Hdfc h = new Hdfc(amt, years);
		a.amount();
		i.amount();
		h.amount();
	

	}

}
