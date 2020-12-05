package org.hcl.p2;

public class Delivery {
	
	Long over, ball, runs;
	String batsman, bowler, nonStriker;
	
	public Delivery(Long over, Long ball, Long runs, String batsman, String bowler, String nonStriker) {
		this.over = over;
		this.ball = ball;
		this.runs = runs;
		this.batsman = batsman;
		this.bowler = bowler;
		this.nonStriker = nonStriker;
		
	}
	public void displayDeliveryDetails() {
		System.out.println("Delivery Details \nOver :"+over+"\nBall :"+ball+"\nRuns :"+runs+"\nBatsman :"+batsman+"\nBowler :"+bowler+"\nNonStriker :"+nonStriker);
	}
	

}
