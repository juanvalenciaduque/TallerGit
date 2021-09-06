package com.guru.qa.proyectoguruscreenplay.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)   
@CucumberOptions( features= "src/test/resources/features/LoginGuru.feature",
        glue = { "com.guru.qa.proyectoguruscreenplay.stepsdefinitions" },
        snippets =  SnippetType.CAMELCASE
        )  

public class ProyectoGuruScreenPlayRunner {

}
