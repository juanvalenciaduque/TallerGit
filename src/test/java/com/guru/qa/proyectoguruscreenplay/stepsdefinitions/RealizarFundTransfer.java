package com.guru.qa.proyectoguruscreenplay.stepsdefinitions;

import static org.junit.Assert.assertEquals;
import java.util.List;
import org.openqa.selenium.WebDriver;
import com.guru.qa.proyectoguruscreenplay.tasks.ConsultarBalance;
import com.guru.qa.proyectoguruscreenplay.tasks.HacerFundTransfer;
import com.guru.qa.proyectoguruscreenplay.tasks.LogOut;
import com.guru.qa.proyectoguruscreenplay.tasks.OpenTheBrowser;
import com.guru.qa.proyectoguruscreenplay.userinterfaces.GuruHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import com.guru.qa.proyectoguruscreenplay.models.BalanceAccount;
import com.guru.qa.proyectoguruscreenplay.models.FundTransfer;
import com.guru.qa.proyectoguruscreenplay.questions.GetBalance;

public class RealizarFundTransfer {
	
	GuruHomePage guruHomePage;	
	@Managed(driver = "chrome")
    private WebDriver hisBrowser;
	private Actor user = Actor.named("Juan Diego");
	
	@Before
	public void setUp() {
		user.can(BrowseTheWeb.with(hisBrowser));
	}
	
	@Given("^Deseo realizar un Fund Transfer$")
	public void deseo_realizar_un_Fund_Transfer(){
		user.wasAbleTo(OpenTheBrowser.on(guruHomePage));
	}
	
	@When("^Consulto deposito de la cuenta payers$")
	public void consulto_deposito_de_la_cuenta_payers(List<BalanceAccount> balanceAccount){
		user.attemptsTo(ConsultarBalance.withTheAccount(balanceAccount.get(0)));
		user.remember("BalancePayers", GetBalance.verified());
		System.out.println(user.recall("BalancePayers").toString());		
	}
	
	@When("^Consulto deposito de la cuenta payees$")
	public void consulto_deposito_de_la_cuenta_payees(List<BalanceAccount> balanceAccount){
		user.attemptsTo(ConsultarBalance.withTheAccount(balanceAccount.get(0)));
		user.remember("BalancePayees", GetBalance.verified());
		System.out.println(user.recall("BalancePayees").toString());
		user.attemptsTo(LogOut.option());
		hisBrowser.switchTo().alert().accept();
	}	
	
	@When("^Diligencio los campos en Fund Transfer y presiono submit$")
	public void diligencio_los_campos_en_Fund_Transfer_y_presiono_submit(List<FundTransfer> data) throws Exception {
		user.attemptsTo(HacerFundTransfer.withTheData(data.get(0)));
		user.remember("Amount", data.get(0).getAmount());
	}
	

	
	@Then("^Consulto nuevo deposito de la cuenta payers$")
	public void consulto_nuevo_deposito_de_la_cuenta_payers(List<BalanceAccount> balanceAccount){
		user.attemptsTo(ConsultarBalance.withTheAccount(balanceAccount.get(0)));
		user.remember("NewBalancePayers", GetBalance.verified());
	}
		
	@Then("^Verifico que el valor fue descontado correctamente en la cuenta Payers$")
	public void verifico_que_el_valor_fue_descontado_correctamente_en_la_cuenta_Payers(){	
		String balanceAmount = String.valueOf(Integer.valueOf(user.recall("BalancePayers").toString()) - Integer.valueOf(user.recall("Amount").toString()));
		String newBalance = user.recall("NewBalancePayers").toString();	
		assertEquals(newBalance, balanceAmount);
		user.attemptsTo(LogOut.option());
		hisBrowser.switchTo().alert().accept();
	}
	
	@Then("^Consulto nuevo deposito de la cuenta payees$")
	public void consulto_nuevo_deposito_de_la_cuenta_payees(List<BalanceAccount> balanceAccount){
		user.attemptsTo(ConsultarBalance.withTheAccount(balanceAccount.get(0)));
		user.remember("NewBalancePayees", GetBalance.verified());
	}
	
	
	@Then("^Verifica que el valor fue agregado correctamente en la cuenta Payees$")
	public void verifica_que_el_valor_fue_agregado_correctamente_en_la_cuenta_Payees(){
		String balanceAmount = String.valueOf(Integer.valueOf(user.recall("BalancePayees").toString()) + Integer.valueOf(user.recall("Amount").toString()));
		String newBalance = user.recall("NewBalancePayees").toString();	
		assertEquals(newBalance, balanceAmount);
	}
	
}
