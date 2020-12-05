package org.hcl4;

public class Triangle {
	private double base, height;
	double area;
	public void computeArea(double base, double height) {
		area = (1*base * height/2) ; 
		System.out.printf("Area of the Triangle is %.2f",area);
	}

}
