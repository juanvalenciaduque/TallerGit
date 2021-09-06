package com.guru.qa.proyectoguruscreenplay.questions;

import com.guru.qa.proyectoguruscreenplay.userinterfaces.BalanceDetails;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class GetBalance implements Question<String>{
	
	public GetBalance() {
	}


	
	@Override
	public String answeredBy(Actor actor) {
		
		
		return BalanceDetails.BALANCE.resolveFor(actor).getTextContent();				
	}
	
	
	public static GetBalance verified() {
		return new GetBalance();
	}	

}
