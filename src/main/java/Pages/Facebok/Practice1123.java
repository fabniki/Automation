package Pages.Facebok;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
// they run by testNG in package run
public class Practice1123 {
public WebDriver driver;
@FindBy(name ="email")
WebElement emailkey;
@FindBy(name = "pass")
WebElement password;
@FindBy(name="login")
WebElement signin;

public Practice1123(WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void email() {
	emailkey.sendKeys("fabniki");
}
public void passwords() {
	password.sendKeys("12345");
}
public void log() {
	signin.click();
}

}
