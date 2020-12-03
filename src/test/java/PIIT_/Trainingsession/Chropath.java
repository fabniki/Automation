package PIIT_.Trainingsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
;
public class Chropath {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","\\Users\\fabni\\eclipse-workspace\\Trainingsession\\Driver\\chromedriver.exe");
	 driver=new ChromeDriver();
	 //this is for checking to see if the sentence is located there and typed right
	
		driver.get("http://www.facebook.com");
		WebElement sentence=driver.findElement(By.xpath("//h2[contains(text(),'Connect with friends and the world around you on F')]"));
		// first write : sentence.getText();
		String result=sentence.getText();
		System.out.println(result);
	}

}
