package com.guru.qa.proyectoguruscreenplay.tasks;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import com.guru.qa.proyectoguruscreenplay.exceptions.NoInternetConnection;
import com.guru.qa.proyectoguruscreenplay.questions.GuruPageVisible;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class OpenTheBrowser implements Task{
	
	private PageObject page;
	
	public OpenTheBrowser (PageObject page) {
		this.page = page;
	}

	@Override
	@Step("that {0} is in Ebay home page") 
	public <T extends Actor> void performAs(T actor) {		
		actor.attemptsTo(Open.browserOn(page)); 
		actor.should(seeThat(GuruPageVisible.isVisible()).orComplainWith(NoInternetConnection.class,
		getNoInternetConectionMessage()));
	}

	public static OpenTheBrowser on(PageObject page) {
		return instrumented(OpenTheBrowser.class, page); 
	}
	
	public String getNoInternetConectionMessage() {
		return String.format(NoInternetConnection.getErrorNetworkMessage());

	}
}
