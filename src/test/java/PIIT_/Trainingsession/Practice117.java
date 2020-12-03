package PIIT_.Trainingsession;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Practice117 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","\\Users\\fabni\\eclipse-workspace\\Trainingsession\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.HomeDepot.com");
		WebElement searchbar=driver.findElement(By.id("headerSearch"));		
 WebElement search=driver.findElement(By.className("SearchBox__buttonIcon"));
 searchbar.sendKeys("mask");
 search.click();
 Thread.sleep(6000);
//WebElement account=driver.findElement(By.className("HeaderIcon__primarySvg"));
//account.click();
// WebElement store=driver.findElement(By.xpath("(//a[@class='TaskLinks__link'])[1]"));
//store.click();
//WebElement zipcode=driver.findElement(By.id("storeSearchBox"));
//zipcode.sendKeys("Arlington,VA");
//WebElement searchzip=driver.findElement(By.id("iPage-1d"));
//searchzip.click();
// Object outputType;
File shots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileHandler.copy(shots, new File("C:\\Users\\fabni\\eclipse-workspace\\Trainingsession\\pictures\\HomeDepot.png"));
	}
}
