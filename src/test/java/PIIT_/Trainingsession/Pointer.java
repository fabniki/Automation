package PIIT_.Trainingsession;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Pointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","\\Users\\fabni\\eclipse-workspace\\Trainingsession\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.com");
		WebElement pointer=driver.findElement(By.xpath("//*[text()='Account & Lists']"));
		Actions its=new Actions(driver);
		its.moveToElement(pointer).build().perform();
		WebElement sign=driver.findElement(By.xpath("(//*[text()='Sign in'])[1]"));
		its.moveToElement(sign).click().build().perform();
			}
	}
