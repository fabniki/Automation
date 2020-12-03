package PIIT_.Trainingsession;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Practice1115 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","\\Users\\fabni\\eclipse-workspace\\Trainingsession\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("http://jqueryui.com/droppable/");
		//first driver should switch to frame with index number 0
		//driver.switchTo().frame(0);
		//WebElement drag=driver.findElement(By.id("draggable"));
		//WebElement drop=driver.findElement(By.id("droppable"));
		//Actions its=new Actions(driver);		
		//its.dragAndDrop(drag, drop).build().perform();
		
		//Alerts or pop ups
		//driver.get("http://demo.guru99.com/test/delete_customer.php");
		//WebElement alert=driver.findElement(By.name("submit"));
		//alert.click();		
		//driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		//Calender
		driver.get("https://www.qatarairways.com/en-us/book.html#beTId_flight|");
		WebElement coockie=driver.findElement(By.id("cookie-close"));
		coockie.click();
		WebElement departure=driver.findElement(By.id("T7-departure_1"));
		departure.click();
		//WebElement date2=driver.findElement(By.xpath("//*[text()='Dec 2020']"));
		//date2.click();		
		//WebElement day2=driver.findElement(By.xpath("(//*[text()='2'])[6]"));
		//day2.click();
		WebElement date=driver.findElement(By.xpath("(//*[text()='26'])[2]"));
		date.click();
		File shots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(shots, new File("C:\\Users\\fabni\\eclipse-workspace\\Trainingsession\\pictures\\Airlines.png"));
		
	}
	
}
