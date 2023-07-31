package Pageobjectclasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminDashboard extends BasePage{
 JavascriptExecutor js = (JavascriptExecutor)driver;

public AdminDashboard(WebDriver driver) {
	super(driver);	
}
@FindBy (xpath ="//div[@class='control-group']//input[@placeholder='Email']")
WebElement txt_mailes;

@FindBy (xpath ="//input[@id='password']")
WebElement txt_pswrd;

@FindBy (xpath ="//button[normalize-space()='LOGIN']")
WebElement txt_sbmt;

// just for checking clear method is working or not 
@FindBy (xpath ="//div[@class='control-group']//input[@placeholder='Email']")
WebElement txt_clear;

public void mailes(String s) throws InterruptedException {
	//js.executeScript("arguments[0].value='s';", txt_mailes);
	 txt_mailes.sendKeys(s);
}
public void pswrd(String k) throws InterruptedException {
//	js.executeScript("arguments[0].value='k';", txt_pswrd);
	txt_pswrd.sendKeys(k);
}

public void sbmt() throws InterruptedException {
	 js.executeScript("arguments[0].click();",txt_sbmt);
}
public void clear() throws InterruptedException {
	// js.executeScript("arguments[0].click();",txt_clear);
	txt_clear.clear();
}


}
