package org.hcl4;

public class Rectangle {
	private double length, breadth;
	double area;
	public void computeArea(double length, double breadth) {
		area = (length * breadth);
		System.out.printf("Area of the Rectangle is %.2f",area);
	}

}
