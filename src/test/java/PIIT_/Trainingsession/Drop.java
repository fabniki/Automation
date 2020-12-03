package PIIT_.Trainingsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.NewSessionPayload;
import org.openqa.selenium.support.ui.Select;

public class Drop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","\\Users\\fabni\\eclipse-workspace\\Trainingsession\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		WebElement createnewaccount=driver.findElement(By.linkText("Create New Account"));
		createnewaccount.click();
		Thread.sleep(6000);
		WebElement Month=driver.findElement(By.name("birthday_month"));
		Select ob=new Select(Month);
		//ob.selectByValue("4");
		WebElement Day=driver.findElement(By.name("birthday_day"));
		Select od=new Select(Day);
		od.selectByValue("20");
		ob.selectByVisibleText("Jan");
		//WebElement Year=(WebElement) driver.findElements(By.name("birthday_year"));
		//Select oy=new Select(Year);
			
	}
		
	}


