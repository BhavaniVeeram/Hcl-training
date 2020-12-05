package org.hcl;

public class Product {
	int product_code, stock;
	double price;
	String product_name;
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public int getProduct_code() {
		return product_code;
	}
	public void setProduct_code(int product_code) {
		this.product_code = product_code;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public void checkprice(String p1Name, double product1, String p2Name, double product2){
		if(product1>product2) {
			System.out.println(p2Name+" is cheaper than "+p1Name);
		}
		else if (product1<product2) {
			System.out.println(p1Name+" is cheaper than "+p2Name);
		}
		else
			System.out.println("Both the products are having same price");
	}
	

}
