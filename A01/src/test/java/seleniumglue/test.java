package seleniumglue;
/*Autor: Andres Felipe Upegui
 * aupegui0930@gmail.com
 * Ejercicio para chowcair utilizando selenium, cucumber y maven
 * Mayo 10 2021
 * 
 * */


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;


public class test {

	private WebDriver driver;
	
	
@Given("^el usuario se encuentra en la pagina inicial de Choucair$")
public void ElusuarioseencuentraenlapaginainicialdeChoucair() throws Throwable{
	System.setProperty("webdriver.chrome.driver", "./src/test/resources/Chromedriver/chromedriver");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.choucairtesting.com");
}

@When("^hace click sobre el menu sobre la opcion de empleos$")
public void Haceclicksobreelmenusobrelaopciondeempleos() throws Throwable{
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//WebElement empleos = driver.findElement(By.xpath("//a[@text='Empleos']"));
	WebElement empleos = driver.findElement(By.id("menu-item-550"));
	empleos.click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
/*	
	WebElement convocatorias = driver.findElement(By.className("elementor-image-box-img"));
	convocatorias.click();
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,3000)");
	
	WebElement buscarPalabras = driver.findElement(By.id("search_keywords"));
	buscarPalabras.sendKeys("analista");
	*/
		
}

@Then("^se debe redirigir a la pantalla de empleos$")
public void Sedeberedirigiralapantalladeempleos() throws Throwable{
	WebElement buscarPalabras = driver.findElement(By.id("search_keywords"));
	
	Assert.assertTrue("Prueba fallida, no se redireccionó", buscarPalabras.isDisplayed());
	
}


	
}
