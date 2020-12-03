package Run;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Codetostar.Usability;



	public class Ilisteners extends Usability implements ITestListener {

		@Override
		public void onTestSuccess(ITestResult result) {
			// TODO Auto-generated method stub
			//ITestListener.super.onTestSuccess(result);
			System.out.println("Automation is success");
			this.driver = ((Usability)result.getInstance()).driver;
			  Date dt=new Date();
			  System.out.println(dt);
			  String si=dt.toString().replace(" ", "_").replace(":", "_");
			  System.out.println(si);
			  File shots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			   try {
			   FileHandler.copy(shots,new File("C:\\Users\\fabni\\eclipse-workspace\\Trainingsession\\pictures\\passed\\"+si+".png"));
			  } catch (IOException e) {
			   // TODO Auto-generated catch block
			   e.printStackTrace();
			  }
		}

		@Override
		public void onTestFailure(ITestResult result) {
			// TODO Auto-generated method stub
			//ITestListener.super.onTestFailure(result);
			System.out.println("automation is failed");
			this.driver = ((Usability)result.getInstance()).driver;
			  Date dt=new Date();
			  System.out.println(dt);
			  String si=dt.toString().replace(" ", "_").replace(":", "_");
			  System.out.println(si);
			  File shots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			   try {
			   FileHandler.copy(shots,new File("C:\\Users\\fabni\\eclipse-workspace\\Trainingsession\\pictures\\failed"+si+".png"));
			  } catch (IOException e) {
			   // TODO Auto-generated catch block
			   e.printStackTrace();
			  }
			
			
			
		}

		@Override
		public void onStart(ITestContext context) {
			// TODO Auto-generated method stub
			//ITestListener.super.onStart(context);
			System.out.println("Automation starts");
		}


}
