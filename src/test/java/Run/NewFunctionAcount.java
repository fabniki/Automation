package Run;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Codetostar.Usability;
import Pages.Facebok.Forgot_password;
import Pages.Facebok.Home;
//This is testNG class
public class NewFunctionAcount extends Usability {
	
  @Test
  public void f() {
	  //open the facebook page and verify the login function
	  System.out.println("Annotation is test");
	  Home ob=new Home(driver);
	  ob.emailofinput("faabniki@gmail.com");
	  ob.psswrdoffield("123456");	  
	  ob.signingin();
	  }
  @Test 
    public void Forgotlinkforpassword() {

	  Home it=new Home(driver);
	  it.Forgotpass();
	  
	   Forgot_password ds=new Forgot_password(driver);
	   String Forgoturtext=ds.ForgotYourAccountText().getText();
	   System.out.println(Forgoturtext);
	 SoftAssert gt=new SoftAssert();
	 gt.assertEquals(Forgoturtext, "Find Your Accountit");
	
	 // Assert.assertEquals(Forgoturtext , "Find Your Account");
	  ds.searchfieldemail("faabniki@gmail.com");
	  ds.buttonlk();
	gt.assertAll();
  }
  
  
  
  @BeforeClass
  public void beforeClass() {
	  
  }  
	 
	  }

 // @AfterClass
 // public void afterClass() {
	//  System.out.println("all done");
	//  driver.close();
  



