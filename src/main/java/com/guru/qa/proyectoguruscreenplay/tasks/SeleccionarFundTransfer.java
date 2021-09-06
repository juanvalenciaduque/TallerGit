package com.guru.qa.proyectoguruscreenplay.tasks;

import static com.guru.qa.proyectoguruscreenplay.userinterfaces.LoggedScreen.FUNDTRANSFER;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarFundTransfer implements Task{
	
	public SeleccionarFundTransfer() {		
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(											
				Click.on(FUNDTRANSFER));
	}
	
	public static SeleccionarFundTransfer option() {
		return instrumented(SeleccionarFundTransfer.class);			
	}

}
