package PIIT_.Trainingsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxpractice {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.gecko.driver","\\Users\\fabni\\eclipse-workspace\\Trainingsession\\Driver\\geckodriver.exe" );
driver=new FirefoxDriver();
driver.get("http://www.facebook.com");
	}
	

}
