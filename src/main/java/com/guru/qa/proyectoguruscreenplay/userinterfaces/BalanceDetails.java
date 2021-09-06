package com.guru.qa.proyectoguruscreenplay.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class BalanceDetails extends PageObject {	

	public static final Target BALANCE = Target.the("Balance")
			.located(By.xpath("//tbody/tr[16]/td[2]"));
	
	public static final Target ACCOUNT = Target.the("Account")
			.located(By.xpath("//tbody/tr[6]/td[2]/input[1]"));
	
	public static final Target SUBMIT = Target.the("Submit")
			.located(By.xpath("//tbody/tr[11]/td[2]/input[1]"));
}
