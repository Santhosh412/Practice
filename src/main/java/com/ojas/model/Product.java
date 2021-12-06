package com.ojas.model;

public class Product {
	private int product_Id;
	private String product_name;
	private double product_price;
	public int getProduct_Id() {
		return product_Id;
	}
	public void setProduct_Id(int product_Id) {
		this.product_Id = product_Id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public double getProduct_price() {
		return product_price;
	}
	public void setProduct_price(double product_price) {
		this.product_price = product_price;
		
	}
	public Product(int product_Id, String product_name, double product_price) {
		super();
		this.product_Id = product_Id;
		this.product_name = product_name;
		this.product_price = product_price;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [product_Id=" + product_Id + ", product_name=" + product_name + ", product_price="
				+ product_price + "]";
	}
	
}
