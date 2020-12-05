package org.hcl1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String fort;
		Scanner sc = new Scanner(System.in);
		System.out.println("What you want to visit\nRajmachi\nShivgadh\nMurud");
		fort = sc.nextLine();
		
		Rajmachi r = new Rajmachi();
		Shivgadh s = new Shivgadh();
		Murud m = new Murud();
		if (fort.equals("Rajmachi")) 
			r.distance();
		else if (fort.equals("Shivgadh")) 
			s.distance();
		else if (fort.equals("Murud")) 
			m.distance();
		else
			System.out.println("Invalid input");

	}

}
