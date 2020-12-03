package Codetostar;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Usability {
public WebDriver driver;
@Parameters({"browser","URI"})

@BeforeClass
 public void beforeClass(String browser, String site) {
		if(browser.equalsIgnoreCase("Chrome")) {
		System.setProperty("webdriver.chrome.driver","\\Users\\fabni\\eclipse-workspace\\Trainingsession\\Driver\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get(site);
				}else if(browser.equalsIgnoreCase("Firefox")){
					System.setProperty("webdriver.gecko.driver","C:\\Users\\fabni\\eclipse-workspace\\Trainingsession\\Driver\\geckodriver.exe");
					driver=new FirefoxDriver();
					driver.get(site);
	  }
		  } 
  
  /*@AfterClass
  public void afterClass() {
  	  driver.quit();
  }*/

  

}
