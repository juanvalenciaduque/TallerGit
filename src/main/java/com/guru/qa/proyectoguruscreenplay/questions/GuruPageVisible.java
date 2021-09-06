package com.guru.qa.proyectoguruscreenplay.questions;

import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static com.guru.qa.proyectoguruscreenplay.userinterfaces.GuruHomePage.LOGO;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

@Subject
public class GuruPageVisible implements Question<Boolean>{

	public Boolean answeredBy(Actor actor) { 
		
		return the(LOGO).answeredBy(actor).isCurrentlyVisible();
	}

	public static Question<Boolean> isVisible() {
		return new GuruPageVisible();
	}
	
}