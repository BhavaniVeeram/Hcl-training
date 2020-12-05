package org.hcl2;

public class Icici implements MutualFund{
	int amt, years;
	
	public Icici(int amt, int years) {
		super();
		this.amt = amt;
		this.years = years;
	}
	public void duration() {
	
	}
	public void amount() {
		int icici_interest = (amt*years*49)/100;
		System.out.println("AxisBank-\nYou will have returns as- "+icici_interest+" in "+years+ "years");

	}

}
