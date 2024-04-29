package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginupshein {

WebDriver driver=null;
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	   driver.navigate().to("https://www.homedepot.com/auth/view/createaccount/diy?redirect=/&ref=");
	} 

	@When("User enters faridatoshpulatova388@gmail.com and <password>")
	public void user_enters_ftoshpulatova77_gmail_com_and_password() {
	    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("faridatoshpulatova388@gmail.com");
	    driver.findElement(By.xpath("//form[@class='sui-grid sui-grid-cols-1 sui-gap-4']")).click();
	    driver.findElement(By.xpath("//input[@id='password-input-field']")).sendKeys("Bbbb12$677");
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
	   driver.findElement(By.xpath("//span[normalize-space()='Sign In']")).click();
	}

	@Then("user succsessfully login and see information")
	public void user_succsessfully_login_and_see_information() {
		driver.getPageSource().contains("apples");
		   driver.close();
	}




}
