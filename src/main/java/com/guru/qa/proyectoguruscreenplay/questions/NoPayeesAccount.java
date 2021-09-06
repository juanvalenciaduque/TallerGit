package com.guru.qa.proyectoguruscreenplay.questions;

import com.guru.qa.proyectoguruscreenplay.userinterfaces.FundTransfer;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class NoPayeesAccount implements Question<String>{
	
	public NoPayeesAccount() {
	}

	@Override
	public String answeredBy(Actor actor) {
		
		
				return FundTransfer.ERRORMSG.resolveFor(actor).getTextContent();				
	}
	
	public static NoPayeesAccount verified() {
		return new NoPayeesAccount();
	}	

}
