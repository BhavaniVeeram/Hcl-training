package org.hcl.p5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line, name;
		long runs;
		System.out.println("Enter the extratype details");
		line = sc.nextLine();
		String[] values = line.split("#");
		ExtraType e = new ExtraType();
		name = values[0];
		runs = Long.parseLong(values[1]);
		e.setName(name);
		e.setRuns(runs);
		e.display();

	}

}
