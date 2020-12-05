package org.hcl.p3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String name, country, skill, line;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the player details");
		line = sc.nextLine();
		String[] values = line.split(",");
		name = values[0];
		country = values[1];
		skill = values[2];
		Player p = new Player(name, country, skill);
		p.display();
		

	}

}
