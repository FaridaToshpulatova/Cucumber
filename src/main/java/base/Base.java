package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

import util.PropertiesReader;

public class Base extends PropertiesReader {
	protected  static WebDriver driver;
	 public static String BaseUrl;
	 
	 public static WebDriver setup () throws IOException {
	  
	  PropertiesReader.userLogin();
	  
	  String browser =pr.getProperty("browser");
	  
	  if (browser.equals("chrome")) {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\ftosh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	   driver= new ChromeDriver();
	  }
	  
	  else if (browser.equals("edge")) {
	  System.setProperty("webdriver.edge.driver", "\"C:\\Users\\ftosh\\Downloads\\edgedriver_win64\\msedgedriver.exe\"");
	  driver= new EdgeDriver();
	     }
	  
	  
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   BaseUrl= pr.getProperty("url");
	  
	   return driver;
	 
	}
}