package com.guru.qa.proyectoguruscreenplay.exceptions;

public class WrongSelection extends AssertionError
{

	public static final String WRONG_SELECTION= "El mensaje mostrado es incorrecto";

	public WrongSelection(String message, Throwable cause) {
		super(message, cause);			
	}
}