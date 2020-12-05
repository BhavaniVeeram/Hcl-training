package org.hcl3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String stallName, ownerName;
		int stallCost, noOfTvSets, noOfProjectors, noOfScreens; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose Stall Type\n1)Gold Stall\n2)Premium Stall\n3)Executive Stall");
		int stallType = sc.nextInt();
		
		
			if (stallType ==1) {
				System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of TV sets)");
				sc.nextLine();
				String line = sc.nextLine();
				String[] values = new String[4];
				values = line.split(",");
				stallName = values[0];
				stallCost = Integer.parseInt(values[1]);
				ownerName = values[2];
				noOfTvSets = Integer.parseInt(values[3]);
			GoldStall g = new GoldStall(stallName, stallCost, ownerName, noOfTvSets);
				g.display();
			}else if(stallType==2) {
				System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name, Number Of Screens)");
				sc.nextLine();
				String line = sc.nextLine();
				String[] values = new String[4];
				values = line.split(",");
				stallName = values[0];
				stallCost = Integer.parseInt(values[1]);
				ownerName = values[2];
				noOfScreens = Integer.parseInt(values[3]);
				ExecutiveStall e = new ExecutiveStall(stallName, stallCost, ownerName, noOfScreens); 
				e.display();
			}else if (stallType==3) {
				System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name, Number Of Projectors)");
				sc.nextLine();
				String line = sc.nextLine();
				String[] values = new String[4];
				values = line.split(",");
				stallName = values[0];
				stallCost = Integer.parseInt(values[1]);
				ownerName = values[2];
				noOfProjectors = Integer.parseInt(values[3]);
				
				PremiumStall p = new PremiumStall(stallName, stallCost, ownerName, noOfProjectors);
				p.display();
			}

	}

}
