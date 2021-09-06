package com.guru.qa.proyectoguruscreenplay.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ChangePassword extends PageObject {
	
    public static final Target OLD_PASSWORD = Target.the("Contraseña antigua")
            .located(By.xpath("//tbody/tr[4]/td[2]/input[1]"));	
    
    public static final Target NEW_PASSWORD = Target.the("Nueva contraseña")
            .located(By.xpath("//tbody/tr[5]/td[2]/input[1]"));
    
    public static final Target CONFIRM_PASSWORD = Target.the("Confirmar contraseña")
            .located(By.xpath("//tbody/tr[6]/td[2]/input[1]"));
    
    public static final Target BTN_SUBMIT = Target.the("Submit")
            .located(By.xpath("//tbody/tr[7]/td[2]/input[1]"));

}
