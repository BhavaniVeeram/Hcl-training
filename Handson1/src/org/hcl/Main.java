package org.hcl;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String name;
		String city;
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the venue name");
		name = sc.nextLine();
		System.out.println("Enter the city name");
		city = sc.nextLine();
		Venue v = new Venue(name, city);
		v.display();
		
		

	}

}
