package com.guru.qa.proyectoguruscreenplay.tasks;

import static com.guru.qa.proyectoguruscreenplay.userinterfaces.LoggedScreen.LOGOUT;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import com.guru.qa.proyectoguruscreenplay.models.Credenciales;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class LogOut implements Task{
	
	Credenciales credencial;
	
	public LogOut() {
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(LOGOUT));		
	}	
	
	public static LogOut option() {
		return instrumented(LogOut.class);
			
	}

}
