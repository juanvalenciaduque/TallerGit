package com.guru.qa.proyectoguruscreenplay.interactions;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class Clicking implements Interaction
{
	
	private Target target;
	
	public Clicking(Target target) 
	{
		this.target = target;
	}

	@Override
	public <T extends Actor> void performAs(T actor) 
	{
		actor.attemptsTo(														
				Click.on(target));		
	}	
	
	public static Clicking Selecting(Target target) 
	{
		return instrumented(Clicking.class, target);			
	}
}
