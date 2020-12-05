package org.hcl;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double length, breadth, side;
	System.out.println("Enter the Breadth & length of Rectangle");
	breadth = sc.nextDouble();
	length = sc.nextDouble();
	System.out.println("Enter the Side Value");
	side = sc.nextDouble();
	
	Square s = new Square(side);
	Rectangle r = new Rectangle(length, breadth);
	System.out.println("Perimeter of the Rectangle : "+r.calcPeri());
	System.out.println("Area of the Rectangle : "+r.calcArea());
	System.out.println("Perimeter of the Square : "+s.calcPeri());
	System.out.println("Area of the Square : "+s.calcArea());
	

	}

}
