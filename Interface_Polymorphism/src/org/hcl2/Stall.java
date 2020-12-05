package org.hcl2;

public class Stall {
	protected String name, ownerName, detail;
	double stallCost;
	public Stall() {
		// TODO Auto-generated constructor stub
	}
	public Stall(String name, String ownerName, String detail) {
		super();
		this.name = name;
		this.ownerName = ownerName;
		this.detail = detail;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public Double computeCost(String stallType, double squareFeet) {
		 //calculate the cost of the stall based on square feet
		if (stallType.equals("Platinum")) {
			stallCost = 200*squareFeet;
		}
		else if (stallType.equals("Diamond")) {
			stallCost = 150*squareFeet;
		}
		else if (stallType.equals("Gold")) {
			stallCost = 100*squareFeet;
		}
		return stallCost;
	}
	double cost;
	public Double computeCost(String stallType, double squareFeet, int numberOfTV) {
		//the cost based on size and number of TV
		if (stallType.equals("Platinum")) {
			cost = 200*squareFeet+numberOfTV*10000;
		}
		else if (stallType.equals("Diamond")) {
			cost = 150*squareFeet+numberOfTV*10000;
		}
		else if (stallType.equals("Gold")) {
			cost = 100*squareFeet+numberOfTV*10000;
		}
		return cost;
	}

}
