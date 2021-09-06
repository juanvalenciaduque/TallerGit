package com.guru.qa.proyectoguruscreenplay.tasks;

import static com.guru.qa.proyectoguruscreenplay.userinterfaces.BalanceDetails.ACCOUNT;
import static com.guru.qa.proyectoguruscreenplay.userinterfaces.BalanceDetails.SUBMIT;
import static com.guru.qa.proyectoguruscreenplay.userinterfaces.LoggedScreen.BALANCEENQUIRY;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import com.guru.qa.proyectoguruscreenplay.models.BalanceAccount;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class ConsultarBalance implements Task{
	
	BalanceAccount balanceAccount;
	
	public ConsultarBalance(BalanceAccount balanceAccount) {
		this.balanceAccount = balanceAccount;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(BALANCEENQUIRY),
		Enter.theValue(balanceAccount.getAccount()).into(ACCOUNT),
		Click.on(SUBMIT));		
	}
	
	
	
	public static ConsultarBalance withTheAccount(BalanceAccount balanceAccount) {
		return instrumented(ConsultarBalance.class, balanceAccount);
			
	}

}
