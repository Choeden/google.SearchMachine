package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import common.testBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.googleHomePage;

public class simpleSearch extends testBase{
	
	
	@Given("I am on the google homepage")
	public void i_am_on_the_google_homepage() {
		
		launchBrowser();
	
	}

	@When("I enter the {string}")
	public void i_enter_the(String product_name) {
		
		//WebElement searchBar=Driver.findElement(By.className("gLFyf"));
		//searchBar.sendKeys(product_name);
		googleHomePage gp=new googleHomePage(Driver);
		gp.enteringProductName(product_name);
	  
	}

	@When("I click on the search button")
	public void i_click_on_the_search_button() {
		
		//WebElement searchButton=Driver.findElement(By.name("btnK"));
		//searchButton.click();
		googleHomePage gp=new googleHomePage(Driver);
		gp.clickingOnSearchButton();
	}

	@Then("I see the realted search results successfully")
	public void i_see_the_realted_search_results_successfully() {
		
		/*WebElement searchResult=Driver.findElement(By.id("result-stats"));
		System.out.println("=============================================================================");
		String resultText=searchResult.getText();
		System.out.println(resultText);
		System.out.println("=============================================================================");*/
		
		//boolean displayResults=searchResult.isDisplayed();
		googleHomePage gp=new googleHomePage(Driver);
		Assert.assertTrue(gp.isSearchResultVisible(), "search Result is not displayed");
		
		closeAll();
		/*Driver.close(); // it will close the current browser
		Driver.quit(); //It will close all the browser*/
	
	}

}
