package Run;

import org.testng.annotations.Test;

import Codetostar.Usability;
import Pages.Facebok.Home;

public class Functions extends Usability {
	
  @Test(priority=2,dependsOnMethods = "g")
  public void f() { 
	  //open the facebook page and verify the login function
	  //This method is for the id and password filling in facebook now we want to put different emails and passwords
	  // we are going to put parameters for id and password parts
	  System.out.println("Annotation is test");
	  Home ob=new Home(driver);
	  ob.emailofinput("faabniki@gmail.com");
	  ob.psswrdoffield("123456");	  
	  ob.signingin();
	  }
  @Test(priority=1)
  public void g() {
	  System.out.println("g");
  }
}
