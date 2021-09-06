package com.guru.qa.proyectoguruscreenplay.tasks;

import static com.guru.qa.proyectoguruscreenplay.userinterfaces.FundTransfer.PAYEESACCOUNTNO;
import static com.guru.qa.proyectoguruscreenplay.userinterfaces.FundTransfer.PAYERSACCOUNTNO;
import static com.guru.qa.proyectoguruscreenplay.userinterfaces.FundTransfer.AMOUNT;
import static com.guru.qa.proyectoguruscreenplay.userinterfaces.FundTransfer.DESCRIPTION;
import static com.guru.qa.proyectoguruscreenplay.userinterfaces.FundTransfer.SUBMIT;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import com.guru.qa.proyectoguruscreenplay.models.FundTransfer;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class HacerFundTransfer implements Task{
	
FundTransfer fundTransfer;
	
	public HacerFundTransfer(FundTransfer fundTransfer) {
		this.fundTransfer = fundTransfer;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
		Enter.theValue(fundTransfer.getPayersAccount()).into(PAYERSACCOUNTNO),	
		Enter.theValue(fundTransfer.getPayeesAccount()).into(PAYEESACCOUNTNO),
		Enter.theValue(fundTransfer.getAmount()).into(AMOUNT),	
		Enter.theValue(fundTransfer.getDescription()).into(DESCRIPTION),
		Click.on(SUBMIT));
	}
	
	public static HacerFundTransfer withTheData(FundTransfer fundTransfer) {
		return instrumented(HacerFundTransfer.class, fundTransfer);
			
	}

}
