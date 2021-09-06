package com.guru.qa.proyectoguruscreenplay.tasks;

import static com.guru.qa.proyectoguruscreenplay.userinterfaces.FundTransfer.PAYEESACCOUNTNO;
import static com.guru.qa.proyectoguruscreenplay.userinterfaces.FundTransfer.PAYERSACCOUNTNO;
import static com.guru.qa.proyectoguruscreenplay.userinterfaces.FundTransfer.AMOUNT;
import static com.guru.qa.proyectoguruscreenplay.userinterfaces.FundTransfer.DESCRIPTION;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import com.guru.qa.proyectoguruscreenplay.models.FundTransfer;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

public class DiligenciarFundTransfer implements Task{
	
FundTransfer fundTransfer;
	
	public DiligenciarFundTransfer(FundTransfer fundTransfer) {
		this.fundTransfer = fundTransfer;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
		Enter.theValue(fundTransfer.getPayersAccount()).into(PAYERSACCOUNTNO),	
		Enter.theValue(fundTransfer.getPayeesAccount()).into(PAYEESACCOUNTNO),
		Enter.theValue(fundTransfer.getAmount()).into(AMOUNT),	
		Enter.theValue(fundTransfer.getDescription()).into(DESCRIPTION));
	}
	
	public static DiligenciarFundTransfer withTheData(FundTransfer fundTransfer) {
		return instrumented(DiligenciarFundTransfer.class, fundTransfer);
			
	}

}
