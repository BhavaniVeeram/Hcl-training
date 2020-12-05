package org.hcl;


 class Service implements Car {
	 int sum, years;
	 String brand;
	 
	
	 	public Service(int sum, int years, String brand) {
		
		this.sum = sum;
		this.years = years;
		this.brand = brand;
	}

		public void sum() {
	 		if (sum%2==0) 
	 			System.out.println("You can come on Tuesday, Thursday or Saturday");
	 		else
	 			System.out.println("You can come on Monday, Wednesday, Friday");	
	 	}
	 	
		public void brand() {
			if (brand.equals("Maruti"))
				System.out.println("Your service charges are- 4750");
			else
				System.out.println("Your service charges are- 5000");
		}
		
		public void years() {
			if(years>5){
				System.out.println("You are eligible for free washing");
			}
			else
				System.out.println("You are not eligible for free washing");
		}

		
		

}
