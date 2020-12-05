package org.hcl2;

public class ItemType {
	String name;
	double deposit, costPerDay;
	
	public ItemType(String name, double deposit, double costPerDay) {
		super();
		this.name = name;
		this.deposit = deposit;
		this.costPerDay = costPerDay;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDeposit() {
		return deposit;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}

	public double getCostPerDay() {
		return costPerDay;
	}

	public void setCostPerDay(double costPerDay) {
		this.costPerDay = costPerDay;
	}

	@Override
	public String toString() {
		System.out.println("The details of the item type are:");
		System.out.println("Name:"+getName()+"\nDeposit:"+getDeposit()+"\nCost Per Day:"+getCostPerDay());
		return super.toString();
	}
	

}
