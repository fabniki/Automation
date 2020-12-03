package PIIT_.Trainingsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","\\Users\\fabni\\eclipse-workspace\\Trainingsession\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://jqueryui.com/droppable/");
		Actions it=new Actions(driver);
		driver.switchTo().frame(0);
		WebElement sr=driver.findElement(By.id("draggable"));
		WebElement dr= driver.findElement(By.id("droppable"));
		
		it.dragAndDrop(sr, dr).build().perform();
		
		
	}

}
