package Run;

import org.testng.annotations.Test;

import Pages.Facebok.Practice1123;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class PracticeRun1123 {
	public WebDriver driver;
  @Test(priority=2)
  public void f() {
	  System.out.println("Annotation is test");
	  Practice1123 ob=new Practice1123(driver);
	  ob.email();
	  ob.passwords();
	  ob.log();
  }
  @Test(priority=1)
  public void g() {
	  System.out.println("g");
  }
  

  

  @BeforeClass
  public void beforeClass() {
	  Driver("Chrome","https://www.facebook.com");
  }
  public 
  
  void Driver(String browser, String URI) {
		if(browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver","\\Users\\fabni\\eclipse-workspace\\Trainingsession\\Driver\\chromedriver.exe");
			 driver=new ChromeDriver();
			 driver.get(URI);
		}else if(browser.equalsIgnoreCase("Firefox")){
			System.setProperty("webdriver.gecko.driver","C:\\Users\\fabni\\eclipse-workspace\\Trainingsession\\Driver\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get(URI);
		}	
		}

  
	// TODO Auto-generated method stub
	





@AfterClass
  public void afterClass() {
	  System.out.println("all done");
	driver.close();
  }

}
