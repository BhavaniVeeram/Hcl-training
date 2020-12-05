package org.hcl;

public class Rectangle implements Polygon{
	double length, breadth, perimeter, area;
	
	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	public double calcPeri() {
		perimeter = 2*(length + breadth);
		return perimeter;
	}
	public double calcArea() {
		area = length*breadth;
		return area;
	}

}
