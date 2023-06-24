package utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import BasePackage.BaseClass;

public class ExtentReport implements ITestListener {
	
public ExtentSparkReporter sparkReporter; // ui of the report
public ExtentReports extent; 
public ExtentTest test;
String repName;

 public void onStart(ITestContext context) {
	    String timestamp = new SimpleDateFormat("yyy.MM.dd.HH.mm.ss").format(new Date()); // time stamp
repName = "Test-Report-" + timestamp + ".html";
sparkReporter = new ExtentSparkReporter(".\\reports\\" + repName); //specify location of report
sparkReporter.config().setDocumentTitle("evolving Test Report"); // title of the report
sparkReporter.config().setReportName("evolving love");
    sparkReporter.config().setTheme(Theme.DARK);
    extent = new ExtentReports();
	extent.attachReporter(sparkReporter);
	extent.setSystemInfo("application", "love");
	extent.setSystemInfo("operating system", System.getProperty("os.name"));
	extent.setSystemInfo("User name", System.getProperty("user.name"));
  }
  public void onTestSuccess(ITestResult result) {
    // not implemented
    	  test = extent.createTest(result.getName());
	  }
  public void onTestStart(ITestResult result) {
	    // not implemented
	  }
      public void onTestFailure(ITestResult result) {
    	  test = extent.createTest(result.getName());
    	  try {
    		  String imgpath = new BaseClass().captureScreen(result.getName());
    		  test.addScreenCaptureFromPath(imgpath );
    	  } catch (Exception e) {
    		  System.out.println(e); }
	  }
      public void onFinish(ITestContext context) {
	    // not implemented
	  extent.flush();
  }
}


