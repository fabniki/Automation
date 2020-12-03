package PIIT_.Trainingsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Firefox  {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","\\Users\\fabni\\eclipse-workspace\\Trainingsession\\Driver\\chromedriver.exe");
		// driver=new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver","\\Users\\fabni\\eclipse-workspace\\Trainingsession\\Driver\\chromedriver.exe");
	//	WebDriver driver=new ChromeDriver();
		
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\fabni\\eclipse-workspace\\Trainingsession\\Driver\\geckodriver.exe");
		//driver=new FirefoxDriver();
		//driver.get("https:www.facebook.com");
		// Driver("Chrome","https:www.facebook.com");
		Driver("Firefox","https:www.amazon.com");
		}
	public static void Driver(String browser, String URI) {
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
	}
	
		
	
	

