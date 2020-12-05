package org.hcl;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int product_code, stock;
		String product_name;
		double price;
		Product p1 = new Product();
		Product p2 = new Product();
		System.out.println("Product Details :");
		Scanner sc = new Scanner(System.in);
		System.out.println("Product code :");
		product_code = sc.nextInt();
		p1.setProduct_code(product_code);
		sc.nextLine();
		System.out.println("Name :");
		product_name = sc.nextLine();
		p1.setProduct_name(product_name);
		System.out.println("Price :");
		price = sc.nextDouble();
		p1.setPrice(price);
		System.out.println("Stock :");
		stock = sc.nextInt();
		p1.setStock(stock);
		System.out.println("\n");
		
		System.out.println("Product code :");
		product_code = sc.nextInt();
		p2.setProduct_code(product_code);
		sc.nextLine();
		System.out.println("Name :");
		product_name = sc.nextLine();
		p2.setProduct_name(product_name);
		System.out.println("Price :");
		price = sc.nextDouble();
		p2.setPrice(price);
		System.out.println("Stock :");
		stock = sc.nextInt();
		p2.setStock(stock);
		
		p1.checkprice(p1.getProduct_name(), p1.getPrice(), p2.getProduct_name(), p2.getPrice());
		

	}

}
