package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;


public class LoginStepDefinition 
{
	static WebDriver driver;
	
	@Given("^User is already on login page$")
	public void user_already_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "D:\\My coading workspace\\MyCucumberTestProject\\Drivers\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://ui.freecrm.com/");
        driver.manage().window().maximize();
	}
	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_free_CRM() {
		String title = driver.getTitle();
		System.out.println("Login Page title ::"+title);
		Assert.assertEquals("Cogmento CRM", title);
		
	}
	@Then("^user enters username and password$")
	public void user_enters_username_and_password() {
		
		driver.findElement(By.name("email")).sendKeys("amolmane1007@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Amol@1007");
	}
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		
		WebElement loginbutton =driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", loginbutton);
			
	}
	@Then("^user is on home page$")
	public void user_is_on_home_page() {
		String title = driver.getTitle();
		System.out.println("Home Page title ::"+title);
		Assert.assertEquals("Cogmento CRM", title);
		
		
	}
	@Then("close the browser")
	public void close_the_browser() {
	   driver.close();
	}
	
	
}
