package com.guru.qa.proyectoguruscreenplay.models;

public class  Products 
{
	
	 private String product;
	 private String categorie;
	 private String amount;
	
	public Products(String product, String categorie, String amount, String expectedResult) {
		this.product = product;
		this.categorie = categorie;
		this.amount = amount;
	}
	
	public String getproduct() {
		return product;
	}
	
	public void setproduct(String product) {
		this.product = product;
	}
	
	public String getcategorie() {
		return categorie;
	}
	
	public void setcategorie(String categorie) {
		this.categorie = categorie;
	}
	
	public String getAmount() {
		return amount;
	}
	
	public void setAmount(String amount) {
		this.amount = amount;
	}

}
