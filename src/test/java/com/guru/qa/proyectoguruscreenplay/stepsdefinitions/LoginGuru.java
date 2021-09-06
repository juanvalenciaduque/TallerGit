package com.guru.qa.proyectoguruscreenplay.stepsdefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.guru.qa.proyectoguruscreenplay.exceptions.WrongSelection;
import com.guru.qa.proyectoguruscreenplay.models.Credenciales;
import com.guru.qa.proyectoguruscreenplay.models.ExpectedResult;
import com.guru.qa.proyectoguruscreenplay.questions.UserLogged;
import com.guru.qa.proyectoguruscreenplay.tasks.LogGuru;
import com.guru.qa.proyectoguruscreenplay.tasks.OpenTheBrowser;
import com.guru.qa.proyectoguruscreenplay.userinterfaces.GuruHomePage;
import static org.hamcrest.core.StringContains.containsString;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class LoginGuru {
	
	GuruHomePage guruHomePage;	
	@Managed(driver = "chrome")
    private WebDriver hisBrowser;
	private Actor user = Actor.named("El usuario");
	
	@Before
	 public void setUp() {		
		user.can(BrowseTheWeb.with(hisBrowser));
	}
	
	@Given("^Deseo logearme a Guru$")
	public void deseo_logearme_a_Guru(){
		user.wasAbleTo(OpenTheBrowser.on(guruHomePage));
	}

	@When("^Ingreso con usuario y contrasenia$")
	public void ingreso_con_las_credenciales_usuario_y_contrasenia(List<Credenciales> credencial){
		user.attemptsTo(LogGuru.withTheCredentials(credencial.get(0)));
	}


	@Then("^Verifico el usuario$")
	public void verifico_el_usuario(List<ExpectedResult> expectedResult){
		user.should(seeThat(UserLogged.verified(), containsString(expectedResult.get(0).getExpectedResult())).orComplainWith(WrongSelection.class, WrongSelection.WRONG_SELECTION));
	}
} 
