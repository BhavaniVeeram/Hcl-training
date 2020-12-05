package org.hcl;

public class Venue {
	String name;
	String city;
	public Venue(String name, String city) {
		this.name = name;
		this.city = city;
	}  

	public void display() {
		System.out.println("Venue Details");
		System.out.println("Venue Name :" +name);
		System.out.println("City Name :" +city);
	}
	

}
