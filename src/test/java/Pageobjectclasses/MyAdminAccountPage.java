package Pageobjectclasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAdminAccountPage extends BasePage {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	public MyAdminAccountPage(WebDriver driver) {
		super(driver);
		
}
	@FindBy(xpath="//button[@id='userDrop']")
	WebElement txt_userdrop;
	
	
	
	@FindBy(xpath="//a[normalize-space()='Log Out']")
	WebElement txt_logout;
	
	public void logout() {
		js.executeScript("arrguments[0].click();",txt_userdrop);
	}
	public void userdrop() {
		js.executeScript("arrguments[0].click();",txt_logout);
	}
	
	
}