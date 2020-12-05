package org.hcl4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double radius, length, breadth, base, height;
		System.out.println("Enter the shape\n1.Circle\n2.Rectangle\n3.Triangle");
		int shape = sc.nextInt();
		Circle c = new Circle();
		Triangle t = new Triangle();
		Rectangle r = new Rectangle();
		if (shape == 1) {
			System.out.println("Enter the radius:");
			radius = sc.nextDouble();
			c.computeArea(radius);
		}
		else if (shape == 2) {
			System.out.println("Enter the length and breadth:");
			length = sc.nextDouble();
			breadth = sc.nextDouble();
			r.computeArea(length, breadth);
		}
		else if (shape== 3) {
			System.out.println("Enter the base and height:");
			base = sc.nextDouble();
			height = sc.nextDouble();
			t.computeArea(base, height);
		}
		else System.out.println("Invalid Choice");

	}

}
