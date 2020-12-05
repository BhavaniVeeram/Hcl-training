package org.hcl1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> arrlist = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		char ch = 'y';
		for(int i=1; ch=='y';i++) {
		System.out.println("Enter the username "+i);
		arrlist.add(sc.nextLine());
		System.out.println("Do you want to continue?(y/n)");
		ch = sc.next().charAt(0);
		sc.nextLine();
		}
		System.out.println("The Names entered are:");
		for(String name:arrlist) {
			System.out.println(name);
		}
	}

}
