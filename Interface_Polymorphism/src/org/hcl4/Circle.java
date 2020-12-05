package org.hcl4;

public class Circle extends Shape {
	private double radius;
	double area;
	public void computeArea(double radius) {
		area = 22 * radius * radius/7;
		System.out.printf("Area of the Circle is %.2f",area);

	}
}
