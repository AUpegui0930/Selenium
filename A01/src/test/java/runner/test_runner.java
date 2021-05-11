package runner;
/*Autor: Andres Felipe Upegui
 * aupegui0930@gmail.com
 * Ejercicio para chowcair utilizando selenium, cucumber y maven
 * Mayo 10 2021
 * 
 * */

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = "src/test/java/features",
		glue =("seleniumglue")
		)



public class test_runner {

}
