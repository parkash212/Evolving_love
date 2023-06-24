package Pageobjectclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StartingQuiz extends BasePage{
	WebDriver driver;
	 JavascriptExecutor js = ((JavascriptExecutor)driver);
	public StartingQuiz(WebDriver driver) {
		super(driver);
		
	}
	// ist question 
	@FindBy(xpath=" //label[1]//span[1]") 
	WebElement txt_label1;
	
	@FindBy(xpath=" //a[@id='next1']") 
	WebElement txt_nxt1;
	
	 // 2nd question
	@FindBy(xpath="//span[normalize-space()='Yes']")
	   WebElement txt_yesno;
	 @FindBy(xpath=" //a[@id='next1']")
	  WebElement txt_next22;
	
	// 3rd qustion
	@FindBy(xpath="//span[normalize-space()='Romantic partner']")
	    WebElement txt_romantic;
	@FindBy(xpath="//a[@id='next1']")
	WebElement txt_next33;
	
	 public void labelclick1() {
		 txt_label1.click();
	 }
	 public void nxtclick1() {
		// txt_nxt1.click();
		 js.executeScript("argumnets[0].click();",txt_nxt1);
	 }
	 // 2nd question
	 public void yesclick1() {
		 txt_yesno.click();
	 }
	 public void nextclick2() {
		 js.executeScript("argumnets[0].click();",txt_next22); 
	 }
	 //3rd qustion
	 public void romance() {
		 txt_romantic.click();
	 }
	 public void nextclick3() {
		 js.executeScript("argumnets[0].click();",txt_next33); 
	 } 
	 
	 
	 // WebElement button1 =  driver.findElement(By.xpath(" //a[@id='next1']")); 
	 // js.executeScript("arguments[0].click();",button1 );

}
