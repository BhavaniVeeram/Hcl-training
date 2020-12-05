package org.hcl2;

public class Hdfc implements MutualFund{
	int amt, years;
	
	public Hdfc(int amt, int years) {
		super();
		this.amt = amt;
		this.years = years;
	}
	public void duration() {
		
	}
	public void amount() {
		int hdfc_interest = (amt*years*60)/100;
		System.out.println("AxisBank-\nYou will have returns as- "+hdfc_interest+" in "+years+ "years");

		
	}

}
