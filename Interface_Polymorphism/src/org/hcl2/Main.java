package org.hcl2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the stall:");
		String stallName = sc.nextLine();
		System.out.println("Enter the detail of the stall:");
		String stallDetail = sc.nextLine();
		System.out.println("Enter the owner name of the stall:");
		String stallOwner = sc.nextLine();
		System.out.println("Enter the type of the stall:");
		String stallType = sc.nextLine();
		System.out.println("Enter the size of the stall in square feet:");
		double stallSizeSqFeet = sc.nextDouble();
		System.out.println("Does the hall have TV?(y/n)");
		char temp = sc.next().charAt(0);
		System.out.println("Enter the number of TV:");
		int tvNum = sc.nextInt();
		if (temp=='Y') {
		Stall s = new Stall(stallName, stallOwner, stallDetail);
		double stallCost = s.computeCost(stallType, stallSizeSqFeet);
		double cost = s.computeCost(stallType, stallSizeSqFeet, tvNum);
		System.out.println("The cost of the stall is "+cost);
		}
		else System.out.println("no TV");
	}

}
