package com.guru.qa.proyectoguruscreenplay.stepsdefinitions;

import java.util.List;
import org.openqa.selenium.WebDriver;

import com.guru.qa.proyectoguruscreenplay.models.Credenciales;
import com.guru.qa.proyectoguruscreenplay.models.ModContrasenia;
import com.guru.qa.proyectoguruscreenplay.tasks.CambiarContra;
import com.guru.qa.proyectoguruscreenplay.tasks.ChangePassword;
import com.guru.qa.proyectoguruscreenplay.tasks.LogGuru;
import com.guru.qa.proyectoguruscreenplay.tasks.OpenTheBrowser;
import com.guru.qa.proyectoguruscreenplay.userinterfaces.GuruHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class ModificarContrasenia {

	GuruHomePage guruHomePage;
	@Managed(driver = "chrome")
	private WebDriver hisBrowser;
	private Actor user = Actor.named("Juan Diego");

	@Before
	public void setUp() {
		user.can(BrowseTheWeb.with(hisBrowser));
	}

	@Given("^Deseo modificar mi contrasenia y loguearme con ella$")
	public void deseo_modificar_mi_contrasenia_y_loguearme_con_ella() {
		user.wasAbleTo(OpenTheBrowser.on(guruHomePage));
	}
	
	@When("^Ingreso a modificacion de contrasenia$")
	public void ingreso_a_modificacion_de_contrasenia(){
		user.attemptsTo(ChangePassword.withTheCredentials());						
	}

	@When("^Diligencio los campos en modificacion de contrasenia$")
	public void diligencio_los_campos_en_modificacion_de_contrasenia(List<ModContrasenia> modContrasenia) {
		user.attemptsTo(CambiarContra.withTheCredentials(modContrasenia.get(0)));
		user.remember("contraseña", modContrasenia.get(0).getNewPassword());
	}

	@When("^Ingreso con usuario y nueva contrasenia$")
	public void ingreso_con_usuario_y_nueva_contrasenia(List<Credenciales> credencial) {		
		hisBrowser.switchTo().alert().accept();
		user.attemptsTo(LogGuru.withTheCredentials(credencial.get(0)));
	}
}
