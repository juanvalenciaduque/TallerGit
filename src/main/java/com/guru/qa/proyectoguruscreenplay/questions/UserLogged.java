package com.guru.qa.proyectoguruscreenplay.questions;



import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import com.guru.qa.proyectoguruscreenplay.userinterfaces.LoggedScreen;;

@Subject
public class UserLogged implements Question<String>  {
	
	public UserLogged() {
	}

	@Override
	public String answeredBy(Actor actor) {
		
		
				return LoggedScreen.USER_LOGGED.resolveFor(actor).getTextContent();				
	}
	
	public static UserLogged verified() {
		return new UserLogged();
	}	
}


