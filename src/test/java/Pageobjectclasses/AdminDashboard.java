package Pageobjectclasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminDashboard extends BasePage{
 JavascriptExecutor js = (JavascriptExecutor)driver;
	 
TakesScreenshot scrShot =(TakesScreenshot)driver;

public AdminDashboard(WebDriver driver) {
	super(driver);
	
}
@FindBy (xpath ="//div[@class='control-group']//input[@placeholder='Email']")
WebElement txt_mailes;

@FindBy (xpath ="//input[@id='password']")
WebElement txt_pswrd;

@FindBy (xpath ="//button[normalize-space()='LOGIN']")
WebElement txt_sbmt;


public void mailes(String s) throws InterruptedException {
	js.executeScript("arguments[0].value='jennifer@jennifersrussell.com';", txt_mailes);
}

public void pswrd(String k) throws InterruptedException {
	js.executeScript("arguments[0].value='11111111';", txt_pswrd);
}

public void sbmt() throws InterruptedException {
	 js.executeScript("arguments[0].click();",txt_sbmt);
}
}
