package com.guru.qa.proyectoguruscreenplay.tasks;

import static com.guru.qa.proyectoguruscreenplay.userinterfaces.GuruHomePage.BTN_LOGIN;
import static com.guru.qa.proyectoguruscreenplay.userinterfaces.GuruHomePage.PASSWORD;
import static com.guru.qa.proyectoguruscreenplay.userinterfaces.GuruHomePage.USER;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.guru.qa.proyectoguruscreenplay.models.Credenciales;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LogGuru implements Task{

	Credenciales credencial;
	
	public LogGuru(Credenciales credencial) {
		this.credencial = credencial;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(			
				Enter.theValue(credencial.getUser()).into(USER),	
				Enter.theValue(credencial.getPassword()).into(PASSWORD),											
				Click.on(BTN_LOGIN));		
	}	
	
	public static LogGuru withTheCredentials(Credenciales credencial) {
		return instrumented(LogGuru.class, credencial);
			
	}
}
