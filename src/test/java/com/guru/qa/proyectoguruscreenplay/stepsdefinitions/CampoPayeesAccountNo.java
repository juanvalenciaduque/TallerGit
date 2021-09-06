package com.guru.qa.proyectoguruscreenplay.stepsdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.StringContains.containsString;
import java.util.List;
import org.openqa.selenium.WebDriver;
import com.guru.qa.proyectoguruscreenplay.exceptions.WrongSelection;
import com.guru.qa.proyectoguruscreenplay.models.ExpectedResult;
import com.guru.qa.proyectoguruscreenplay.models.FundTransfer;
import com.guru.qa.proyectoguruscreenplay.questions.NoPayeesAccount;
import com.guru.qa.proyectoguruscreenplay.tasks.OpenTheBrowser;
import com.guru.qa.proyectoguruscreenplay.tasks.SeleccionarFundTransfer;
import com.guru.qa.proyectoguruscreenplay.tasks.DiligenciarFundTransfer;
import com.guru.qa.proyectoguruscreenplay.userinterfaces.GuruHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class CampoPayeesAccountNo {
	
	GuruHomePage guruHomePage;	
	@Managed(driver = "chrome")
    private WebDriver hisBrowser;
	private Actor user = Actor.named("Juan Diego");
	
	@Before
	public void setUp() {
		user.can(BrowseTheWeb.with(hisBrowser));
	}
	
	@Given("^Deseo realizar un fund tranfer sin el campo Payees account no$")
	public void deseo_realizar_un_fund_tranfer_sin_el_campo_Payees_account_no() throws Exception {
		user.wasAbleTo(OpenTheBrowser.on(guruHomePage));
	}
	
	@Given("^Ingreso a la opcion Fund Transfer$")
	public void ingreso_a_la_opcion_Fund_Transfer() {
		user.wasAbleTo(SeleccionarFundTransfer.option());
	}

	@When("^Diligencio los campos en Fund Transfer$")
	public void diligencio_los_campos_en_Fund_Transfer(List<FundTransfer> data) {
		user.attemptsTo(DiligenciarFundTransfer.withTheData(data.get(0)));
	}

	@Then("^Verifico el mensaje de Payees account No nulo$")
	public void verifico_el_mensaje_de_Payees_account_No_nulo(List<ExpectedResult> expectedResult) {
		user.should(seeThat(NoPayeesAccount.verified(), containsString(expectedResult.get(0).getExpectedResult())).orComplainWith(WrongSelection.class, WrongSelection.WRONG_SELECTION));
	}

}
