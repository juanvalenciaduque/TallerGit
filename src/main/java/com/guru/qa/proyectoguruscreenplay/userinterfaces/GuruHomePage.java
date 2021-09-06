package com.guru.qa.proyectoguruscreenplay.userinterfaces;

import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://demo.guru99.com/V4/index.php")
public class GuruHomePage extends PageObject {
		    
	    public static final Target USER = Target.the("Usuario")
	            .located(By.xpath("//input[@name='uid']"));	
	    
	    public static final Target PASSWORD = Target.the("Contrasenia")
	            .located(By.xpath("//input[@name='password']"));
	    
	    public static final Target BTN_LOGIN = Target.the("Boton Login")
	            .located(By.xpath("//input[@name='btnLogin']"));
	    
	    public static final Target LOGO = Target.the("Logo")
	            .located(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/a/img"));
	    
}

