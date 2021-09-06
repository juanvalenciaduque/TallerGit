package com.guru.qa.proyectoguruscreenplay.tasks;


import static net.serenitybdd.screenplay.Tasks.instrumented;
import static com.guru.qa.proyectoguruscreenplay.userinterfaces.LoggedScreen.CHANGE_PASSWORD;
import com.guru.qa.proyectoguruscreenplay.models.Credenciales;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class ChangePassword implements Task{
	

	Credenciales credencial;
	
	public ChangePassword() {
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(											
				Click.on(CHANGE_PASSWORD));		
	}	
	
	public static ChangePassword withTheCredentials() {
		return instrumented(ChangePassword.class);
			
	}

}
