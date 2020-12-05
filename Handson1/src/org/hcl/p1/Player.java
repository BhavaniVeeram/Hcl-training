package org.hcl.p1;

public class Player {
	String name;
	String country;
	String skill;
	
	public Player(String name, String country, String skill) {
		this.name = name;
		this.country = country;
		this.skill = skill;
	}
	public void display() {
		System.out.println("Player Details :\nPlayer Name :"+ name +"\nCountry Name :"+country+"\nSkill :" +skill);
	}
}