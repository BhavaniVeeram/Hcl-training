package org.hcl.p4;

public class Venue {
	
	private String name;
	private String city;
	public Venue() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public String getCity() {
		return city;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void display() {
		System.out.println("Venue Details\nVenue Name :"+name+"\nCity Name :"+city);
	}
	
	

}
