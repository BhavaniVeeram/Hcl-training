package org.hcl1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n, cost, result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the cost of the item for n days");
		cost = sc.nextInt();
		System.out.println("Enter the value of n");
		n = sc.nextInt();
		try {
		result = cost/n;
		System.out.println("Cost per day of the item is "+result);
		}catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}
	}

}
