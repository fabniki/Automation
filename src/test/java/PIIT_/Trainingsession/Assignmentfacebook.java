package PIIT_.Trainingsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmentfacebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","\\Users\\fabni\\eclipse-workspace\\Trainingsession\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("fatemeh.abniki@gmail.com");
		WebElement password=driver.findElement(By.id("pass"));
		//WebElement login=driver.findElement(By.name("login"));
		WebElement login=driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/form/div/button"));
		password.sendKeys("Nothing");
		login.click();	
		WebElement Forgot=driver.findElement(By.partialLinkText("Forgot"));
		//WebElement Forgot=driver.findElement(By.linkText("Forgot Password?"));
		Forgot.click();		
		driver.navigate().back();
		//WebElement createnewaccount=driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _16jx _4jy6 _4jy2 selected _51sy']"));
		WebElement createnewaccount=driver.findElement(By.xpath("//*[text()='Create New Account']"));
		createnewaccount.click();
		WebElement signup=driver.findElement(By.id("u_6_s"));
		signup.click();
	}

}
