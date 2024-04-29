package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class defination {

	WebDriver driver= null;
	
	@Given("open the browswer")
	public void open_the_browswer() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ftosh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
	}

	@And("user on google search page")
	public void user_on_google_search_page() {
		
		driver.navigate().to("https://www.google.com/");

	}

	@When("user enters a text in a google search box")
	public void user_enters_a_text_in_a_google_search_box() {
		driver.findElement(By.name("q")).sendKeys("apples");
	
	}

	@When("hits the enter")
	public void hits_the_enter() {
	    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("user is navigated search page")
	public void user_is_navigated_search_page() {
	   driver.getPageSource().contains("apples");
	   driver.close();
	}






}



