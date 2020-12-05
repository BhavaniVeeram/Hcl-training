package org.hcl3;

public class GoldStall implements Stall {
	private String stallName, ownerName ;
	private int cost, tvSet;
	
	public GoldStall() {
		// TODO Auto-generated constructor stub
	}
	public GoldStall(String stallName, int cost, String ownerName, int tvSet) {
		super();
		this.stallName = stallName;
		this.ownerName = ownerName;
		this.cost = cost;
		this.tvSet = tvSet;
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
	public int getTvSet() {
		return tvSet;
	}
	public void setTvSet(int tvSet) {
		this.tvSet = tvSet;
	}
	public void display() {
		//displays stall name, cost of the stall, owner name and the number of tv set
		System.out.println("Stall Name:"+stallName+"\nCost:"+cost+".Rs\nOwner Name:"+ownerName+"\nNumber of TV sets:"+tvSet);
	}
	

}
