package BasePackage;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseClass {
	public WebDriver driver;
	JavascriptExecutor js = ((JavascriptExecutor)driver);
	TakesScreenshot takesScreenshot  = (TakesScreenshot)driver;

	
	@BeforeClass(groups= {"sanity,regression"})
	@Parameters("browser")
	public void setup(@Optional("chrome") String br) 
	{
		
		if(br.equalsIgnoreCase("edge")) {
		//if(browser.equalsIgnoreCase("edge")) {
			driver =  new EdgeDriver();
		} else {
		
		driver = new ChromeDriver(); }
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://evolvinglove.customerdevsites.com/");	
		
	}
	@AfterClass(groups= {"sanity,regression"})
	public void teardown() throws IOException  {
		//driver.quit();
	}
	public String captureScreen(String tname) {
		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot takesScreenshot  = (TakesScreenshot)driver;
	File input = takesScreenshot.getScreenshotAs(OutputType.FILE);
	String destination = System.getProperty("user.dir") + "\\screenshots\\" +tname + "_" + timeStamp + ".png";
	try {
	 // File output = new File("C:\\Users\\iMark Admin\\Desktop\\Code editor\\seleniumproject\\Screenshot\\ex.png");
	  FileUtils.copyFile(input,new File(destination));
	  //FileUtils.copyFile(input,new File(destination));
	} catch ( Exception e) {
		e.getMessage();
	} return destination;
	
	}
	}


