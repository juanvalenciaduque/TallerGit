package com.guru.qa.proyectoguruscreenplay.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class LoggedScreen extends PageObject {
	
    public static final Target USER_LOGGED = Target.the("Usuario Logueado")
            .located(By.xpath("//td[contains(text(),'Manger Id')]"));
    
    public static final Target CHANGE_PASSWORD = Target.the("Cambiar contraseña")
            .located(By.xpath("//a[contains(text(),'Change Password')]"));    
    
    public static final Target LOGOUT = Target.the("Salir")
            .located(By.xpath("//a[contains(text(),'Log out')]"));
    
    public static final Target FUNDTRANSFER = Target.the("Fund transfer")
            .located(By.xpath("//a[contains(text(),'Fund Transfer')]"));
    
    public static final Target BALANCEENQUIRY = Target.the("Balance Enquiry")
            .located(By.xpath("//a[contains(text(),'Balance Enquiry')]"));
}
