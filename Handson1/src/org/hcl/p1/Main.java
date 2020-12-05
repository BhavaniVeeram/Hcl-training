package org.hcl.p1;



import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String name;
		String country;
		String skill;
		System.out.println("Enter the player name");
		name = sc.nextLine();
		System.out.println("Enter the country name");
		country = sc.nextLine();
		System.out.println("Enter the skill");
		skill = sc.nextLine();
		Player p = new Player(name, country, skill);
		p.display();

	}

}


