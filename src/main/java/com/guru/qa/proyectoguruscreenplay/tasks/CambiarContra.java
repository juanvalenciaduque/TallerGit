package com.guru.qa.proyectoguruscreenplay.tasks;

import static com.guru.qa.proyectoguruscreenplay.userinterfaces.ChangePassword.BTN_SUBMIT;
import static com.guru.qa.proyectoguruscreenplay.userinterfaces.ChangePassword.CONFIRM_PASSWORD;
import static com.guru.qa.proyectoguruscreenplay.userinterfaces.ChangePassword.NEW_PASSWORD;
import static com.guru.qa.proyectoguruscreenplay.userinterfaces.ChangePassword.OLD_PASSWORD;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import com.guru.qa.proyectoguruscreenplay.models.ModContrasenia;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class CambiarContra implements Task{
	
	ModContrasenia modContrasenia;
	
	public CambiarContra(ModContrasenia modContrasenia) {
		this.modContrasenia = modContrasenia;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
		Enter.theValue(modContrasenia.getOldPassword()).into(OLD_PASSWORD),	
		Enter.theValue(modContrasenia.getNewPassword()).into(NEW_PASSWORD),
		Enter.theValue(modContrasenia.getConfirmPassword()).into(CONFIRM_PASSWORD),	
		Click.on(BTN_SUBMIT));	
	}
	
	public static CambiarContra withTheCredentials(ModContrasenia modContrasenia) {
		return instrumented(CambiarContra.class, modContrasenia);
			
	}

}
