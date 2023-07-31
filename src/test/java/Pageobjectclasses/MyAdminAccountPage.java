package Pageobjectclasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class MyAdminAccountPage extends BasePage {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	public MyAdminAccountPage(WebDriver driver) {
		super(driver);	
}
	//Evolving Love | Dashboard
	@FindBy(xpath="//h1[normalize-space()='Dashboard']") //h1[normalize-space()='Dashboard']
	WebElement msgHeading;
	
	@FindBy(xpath="//button[@id='userDrop']")
	WebElement txt_userdrop;
	
	@FindBy(xpath="//a[normalize-space()='Log Out']")
	WebElement txt_logout;
	
	// for dashboard 
	public boolean isMyAdminAccountPageExists() {
		try {
			return (msgHeading.isDisplayed());
		} catch (Exception e) {
			return (false);
		}
	}
	public void userdrop() {
		Select ck = new Select(txt_userdrop);
		ck.selectByVisibleText(null);
		js.executeScript("arguments[0].click();",txt_userdrop);
	}
	public void logout() {
		//Select ck = new Select(txt_logout);
		//ck.selectByVisibleText("logout");
		js.executeScript("arguments[0].click();",txt_logout);
	}
}