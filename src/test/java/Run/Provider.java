package Run;

import org.testng.annotations.Test;
import org.testng.internal.annotations.ObjectFactoryAnnotation;

import Codetostar.Usability;
import Pages.Facebok.Home;

import org.testng.annotations.DataProvider;
//This class is about different test cases
//like valid email,invalid password
//invalid email and invalid password
//invalid email and valid password
public class Provider extends Usability {
  @Test(dataProvider = "dp")
  public void f(String n, String s) {
  System.out.println("Annotation is test");
		  Home ob=new Home(driver);
		  ob.emailofinput(n);
		  ob.psswrdoffield(s);	  
		  ob.signingin();
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "faabniki@gmail.com", "12345" },
      new Object[] { "Ryanb@gmail.com", "Virginia" },
      new Object[] {"Ehsanb@hotmail.com","Virginia"}
    };
  }
}
