package org.hcl;

public class Square implements Polygon{
	double side, perimeter, area;
	
	public Square(double side) {
		super();
		this.side = side;
	}
	public double calcPeri() {
		perimeter = 4*side;
		return perimeter;
	}
	public double calcArea() {
		area = side*side;
		return area;
	}
	

}
