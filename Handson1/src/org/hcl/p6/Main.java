package org.hcl.p6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String batsman, bowler, nonStriker;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the over");
		Long over = sc.nextLong();
		System.out.println("Enter the ball");
		Long ball = sc.nextLong();
		System.out.println("Enter the runs");
		Long runs = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the batsman name");
		batsman = sc.nextLine();
		System.out.println("Enter the bowler");
		bowler = sc.nextLine();
		System.out.println("Enter the nonStriker");
		nonStriker = sc.nextLine();
		Delivery d = new Delivery();
		d.setOver(over);
		d.setBall(ball);
		d.setRuns(runs);
		d.setBatsman(batsman);
		d.setBowler(bowler);
		d.setNonStriker(nonStriker);
		d.display();
		
		
		
		
		

	}

}
