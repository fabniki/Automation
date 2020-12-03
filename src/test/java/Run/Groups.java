package Run;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Groups {
  @Test(groups ={"Adhoc","Regression"} )
    public void f() {
	  System.out.println("This is for Adhoc or Regression");
  }
  @Test(groups ={"smoke"} )
  public void f1() {
	  System.out.println("This is for smoke");
  }
  @Test(groups ={"Regression"} ) 
  public void f20() {
	  throw new SkipException("forcing the skip");
	//  System.out.println("This is for Regression");
  }
  @Test(groups ={"Adhoc","smoke"} )
  public void f100() {
	  System.out.println("This is for Adhoc or smoke");
  }
  @Test(groups ="Adhoc" )
  public void f19() {
  }
}
