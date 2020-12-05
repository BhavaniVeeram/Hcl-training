package org.hcl3;

public class ExecutiveStall implements Stall {
	private String stallName, ownerName;
	private int cost,screen;
	public ExecutiveStall() {
		// TODO Auto-generated constructor stub
	}
	protected ExecutiveStall(String stallName, int cost, String ownerName, int screen) {
		super();
		this.stallName = stallName;
		this.ownerName = ownerName;
		this.cost = cost;
		this.screen = screen;
	}
	public String getStallName() {
		return stallName;
	}
	public void setStallName(String stallName) {
		this.stallName = stallName;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getScreen() {
		return screen;
	}
	public void setScreen(int screen) {
		this.screen = screen;
	}
	public void display() {
		// displays stall name, cost of the stall, owner name and number of screens.
		System.out.println("Stall Name:"+stallName+"\nCost:"+cost+".Rs\nOwner Name:"+ownerName+"\nNumber of Screens:"+screen);
	}
	
	

}
