package com.guru.qa.proyectoguruscreenplay.exceptions;

public class ProductNotFound extends AssertionError  
{	
	public static final String PRODUCT_NOT_FOUND="The product found does not correspond to the search";

	public ProductNotFound(String message, Throwable cause) {
		super(message, cause);	
	}	
}