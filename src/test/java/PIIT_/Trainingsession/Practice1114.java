package PIIT_.Trainingsession;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Practice1114 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","\\Users\\fabni\\eclipse-workspace\\Trainingsession\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/*Drop-Down
		driver.get("http://www.facebook.com");
		WebElement createnewaccount=driver.findElement(By.id("u_0_2"));
		createnewaccount.click();
		Thread.sleep(6000);
		WebElement month=driver.findElement(By.name("birthday_month"));
		Select om=new Select(month);
		om.selectByValue("7");
		WebElement day=driver.findElement(By.name("birthday_day"));
		Select od=new Select(day);
		od.selectByValue("24");
		WebElement year=(WebElement) driver.findElement(By.id("year"));
				Select oy=new Select(year);
		oy.selectByValue("1980");
		WebElement sex=driver.findElement(By.name("sex"));
		sex.click();*/
		//Controlling the pointer
		driver.get("http://www.amazon.com");
		WebElement pointer=driver.findElement(By.xpath("//*[text()='Account & Lists']"));
		Actions its=new Actions(driver);
		its.moveToElement(pointer).build().perform();		
		WebElement sign=driver.findElement(By.xpath("(//*[text()='Sign in'])[1]"));
		its.moveToElement(sign).click().build().perform();
		//opening a new window			
		WebElement create=driver.findElement(By.id("createAccountSubmit"));
		its.keyDown(create, Keys.LEFT_SHIFT).click().build().perform();
		its.keyUp(create, Keys.LEFT_SHIFT).build().perform();
		Thread.sleep(6000);
		/*window handle=id of each window 
		driver.getwindowHandle gets the window's id 
		in order to print that id ,parentwindowhandles is just a name like t= and it is a string
		String parentwindowhandles=driver.getWindowHandle();
		System.out.println(parentwindowhandles);
		driver.getWindowHandles() get all windows which are open and their iD, more than one data
		with set<string> we are able to save all ids(multiple data)*/
		Set<String> multiplewindows=driver.getWindowHandles();
		for (String window:multiplewindows) {
			System.out.println(window);
		}
			
		}
		
		
		
		
		
		
	}

