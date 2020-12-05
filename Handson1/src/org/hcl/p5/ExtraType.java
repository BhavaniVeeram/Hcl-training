package org.hcl.p5;

public class ExtraType {
	String name;
	long runs;
	public ExtraType() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getRuns() {
		return runs;
	}
	public void setRuns(Long runs) {
		this.runs = runs;
	}
	public void display() {
		System.out.println("ExtraType Details\nExtra Type:"+name+"\nRuns:"+runs);
	}

}
