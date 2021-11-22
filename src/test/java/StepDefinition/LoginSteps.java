package StepDefinition;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	WebDriver driver;
	@Given("^user is on login page$")
	public void user_is_on_login_page() {
		System.out.println("User is on the login page");
		driver=utilities.DriverFactory.open();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
	}
    
    @When ("^user enters correct email and password$")
    public void user_enters_correct_email_and_password() {
    	
    	 driver.findElement(By.id("ap_email")).sendKeys("surbhigupta.tayal@gmail.com");
    	 driver.findElement(By.id("continue")).click();
    	 driver.findElement(By.id("ap_password")).sendKeys("Surbhi@123");
    	 driver.findElement(By.id("signInSubmit")).click();
    	
    }
   	  
    @When ("^user give (.*)$")
    public void user_give_username(String username) {
     driver.findElement(By.name("email")).sendKeys(username);
    }
    
    @And ("^user clicks on continue button$")
    public void user_clicks_on_continue_button() {
    	 driver.findElement(By.id("continue")).click();
    }
    
   @And ("^user enter (.*)$")
    public void user_give_password(String password) {
    	driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys(password);
    	 }
  
   
       @And ("^user clicks submit button$")
    public void user_clicks_submit_button()
    {
    	driver.findElement(By.id("signInSubmit")).click();	
    }
    
    @Then("^user gets confirmation$")
    public void user_gets_confirmation() {
    	System.out.println("User gets confirmation");
    	String Config=driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).getText();
    	Assert.assertTrue(Config.contains("Hello"));
    	System.out.println(Config);
    	
    }

     @After
    public void teardown() {
     driver.quit();
}
}
    