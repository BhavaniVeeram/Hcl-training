package org.hcl.p4;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String name;
		String city;
		int i;
		Venue v = new Venue();
		System.out.println("Enter the venue name");
		name = sc.nextLine();
		v.setName(name);
		System.out.println("Enter the city name");
		city = sc.nextLine();
		v.setCity(city);
		v.display();
		
		System.out.println("Verify and Update Venue Details\nMenu\n1.Upadate Venue Name\n2.Update City Name\n3.All information Correct/Exit\nType 1 or 2 or 3");
		i = sc.nextInt();
		while(i<3) {
		if (i==1) {
			System.out.println("Enter the venue name");
			sc.nextLine();
			name = sc.nextLine();
			v.setName(name);
			v.display();
			System.out.println("Verify and Update Venue Details\nMenu\n1.Upadate Venue Name\n2.Update City Name\n3.All information Correct/Exit\nType 1 or 2 or 3");
			i = sc.nextInt();
		}
		else if (i==2) {
			System.out.println("Enter the city name");
			sc.nextLine();
			city = sc.nextLine();
			v.setCity(city);
			v.display();
			System.out.println("Verify and Update Venue Details\nMenu\n1.Upadate Venue Name\n2.Update City Name\n3.All information Correct/Exit\nType 1 or 2 or 3");
			i = sc.nextInt();
		}
		}
			v.display();
		
		
		

	}

}
