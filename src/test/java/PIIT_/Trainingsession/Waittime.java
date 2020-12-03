package PIIT_.Trainingsession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Waittime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","\\Users\\fabni\\eclipse-workspace\\Trainingsession\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.HomeDepot.com");		
	driver.manage().timeouts().implicitlyWait(30L,TimeUnit.SECONDS);
	//This is right address of element
	//WebElement store=driver.findElement(By.xpath("(//*[text()='Store Finder'])[1]")); 
	// this is the wrong address by adding extra e to store
		WebElement store=driver.findElement(By.xpath("(//*[text()='Storee Finder'])[1]"));
			
		store.click();
	}

}
