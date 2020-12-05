package org.hcl3;

public class PremiumStall implements Stall {
	private String stallName, ownerName;
	private int cost, projector;
	public PremiumStall() {
		// TODO Auto-generated constructor stub
	}
	
	protected PremiumStall(String stallName, int cost, String ownerName, int projector) {
		super();
		this.stallName = stallName;
		this.ownerName = ownerName;
		this.cost = cost;
		this.projector = projector;
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

	public int getProjector() {
		return projector;
	}

	public void setProjector(int projector) {
		this.projector = projector;
	}

	public void display() {
		//displays stall name, cost of the stall, owner name and number of projectors.
		System.out.println("Stall Name:"+stallName+"\nCost:"+cost+".Rs\nOwner Name:"+ownerName+"\nNumber of Projectors:"+projector);
	}

}
