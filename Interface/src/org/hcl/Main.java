package org.hcl;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int car_num, years,sum=0, n;
		String brand;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your car number");
		car_num = sc.nextInt();
		System.out.println("How many years old car do you have-");
		years = sc.nextInt();
		sc.nextLine();
		System.out.println("Car Brand-");
		brand = sc.nextLine();
		
		while(car_num>0) {
			n = car_num%10;
			sum = sum + n;
			car_num = car_num/10;
		}
		Service s = new Service(sum, years, brand);
		s.sum();
		s.brand();
		s.years();
		

	}

}
