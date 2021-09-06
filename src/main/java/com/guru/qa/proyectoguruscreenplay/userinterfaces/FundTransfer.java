package com.guru.qa.proyectoguruscreenplay.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://demo.guru99.com/V4/index.php")
public class FundTransfer extends PageObject {
		    
	    public static final Target PAYERSACCOUNTNO = Target.the("PAYERS ACCOUNT NO")
	            .located(By.xpath("//tbody/tr[4]/td[2]/input[1]"));	
	    
	    public static final Target PAYEESACCOUNTNO = Target.the("PAYEES ACCOUNT NO")
	            .located(By.xpath("//tbody/tr[5]/td[2]/input[1]"));	
	    
	    public static final Target AMOUNT = Target.the("AMOUNT")
	            .located(By.xpath("//tbody/tr[6]/td[2]/input[1]"));	
	    
	    public static final Target DESCRIPTION = Target.the("DESCRIPTION")
	            .located(By.xpath("//tbody/tr[7]/td[2]/input[1]"));
	    
	    public static final Target ERRORMSG = Target.the(" Payees Account Number must not be blank")
	            .located(By.xpath("//label[@id='message11']"));	
	    
	    public static final Target SUBMIT = Target.the("Submit")
	            .located(By.xpath("//tbody/tr[8]/td[2]/input[1]"));	
	   
}

