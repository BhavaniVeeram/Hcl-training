package org.hcl2;

public class AxisBank {
	int amt, years;
	
	public AxisBank(int amt, int years) {
		super();
		this.amt = amt;
		this.years = years;
	}
	public void duration() {
		
	}
	public void amount() {
		int axis_interest = (amt*years*56)/100;
		System.out.println("AxisBank-\nYou will have returns as- "+axis_interest+" in "+years+ "years");

		
	}


}
