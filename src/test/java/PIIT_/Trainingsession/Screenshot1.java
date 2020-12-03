package PIIT_.Trainingsession;
import java.io.File;



import java.io.IOException;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
public class Screenshot1 {
	static WebDriver driver;
	
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","\\Users\\fabni\\eclipse-workspace\\Trainingsession\\Driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("fa_ni@gmail.com");
		Thread.sleep(6000);
		picture("facebookmail");
			}	
		public static void picture(String pic) throws IOException {
		Date dt=new Date();
			System.out.println(dt);
			String si=dt.toString().replace(" "," _").replace(":", "_");
			System.out.println(si);
	File shots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(shots, new File("C:\\Users\\fabni\\eclipse-workspace\\Trainingsession\\pictures\\"+si+pic+".png"));

		}
}