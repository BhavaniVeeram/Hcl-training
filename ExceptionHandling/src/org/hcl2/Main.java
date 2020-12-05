package org.hcl2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String name;
		double deposit, costPerDay;
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("Enter the Item type details:\nEnter the name:");
		name = sc.nextLine();
		System.out.println("Enter the deposit");
		deposit = sc.nextDouble();
		System.out.println("Enter the cost per day:");
		costPerDay = sc.nextDouble();
		ItemType it = new ItemType(name, costPerDay, costPerDay);
		it.setCostPerDay(costPerDay);
		it.setDeposit(deposit);
		it.setName(name);
		it.toString();
		}catch(NumberFormatException n) {
		
		}
		

	}

}
