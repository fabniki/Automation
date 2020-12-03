package PIIT_.Trainingsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Firefoxpracticeifelse {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Driver("Chrome","https://www.homedepot.com/");
	}
public static void Driver(String browser,String URL) {
	if(browser.equalsIgnoreCase("Chrome")) {
	String address=System.getProperty("user.dir");
		System.out.println("this is dir="+address);
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\fabni\\eclipse-workspace\\Trainingsession\\Driver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", address+"\\Driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get(URL);
		 driver.manage().window().maximize();
	}else if (browser.equalsIgnoreCase("Firefox")) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\fabni\\eclipse-workspace\\Trainingsession\\Driver\\geckodriver.exe");
	
		driver=new FirefoxDriver();
		driver.get(URL);
	}
}
	
}
