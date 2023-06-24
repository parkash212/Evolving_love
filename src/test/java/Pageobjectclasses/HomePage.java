package Pageobjectclasses;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	//WebDriver driver;
	public HomePage(WebDriver driver) {
		super(driver);
		Actions act = new Actions(driver);
		TakesScreenshot scrShot =(TakesScreenshot)driver;
		//JavascriptExecutor js = (JavascriptExecutor)driver;
	}
	
	@FindBy (xpath ="//a[normalize-space()='TAKE MY FREE QUIZ NOW']")
	WebElement txt_freequiz;
	
	@FindBy (xpath =" //a[normalize-space()='START QUIZ']")
	WebElement txt_startquiz;
	
	@FindBy (xpath =" //a[@class='btn btn-white mt-3']")
	WebElement txt_whitebutton;
	
	// ist question 
		@FindBy(xpath=" //label[1]//span[1]") 
		WebElement txt_label1;
		
		@FindBy(xpath=" //a[@id='next1']") 
		WebElement txt_nxt1;
		
		// 2nd question
		
		@FindBy(xpath="//span[normalize-space()='Yes']") // //span[normalize-space()='Yes']
		   WebElement txt_yesno;
		 @FindBy(xpath=" //a[@id='next1']")
		  WebElement txt_next22;
		
		// 3rd qustion
			@FindBy(xpath="//span[normalize-space()='Romantic partner']")
			    WebElement txt_romantic;
			@FindBy(xpath="//a[@id='next1']")
			WebElement txt_next33;
	
	//public void setEmail(String email) {
		//txt_usermail.sendKeys(email);
	//}
	public void freequiz() {
		txt_freequiz.click();;
	}
	public void startquiz() {
		txt_startquiz.click();
	}
	public void whitebutton() {
		 txt_whitebutton.click();
	}
	
//ist question
	public void labelclick1() {
		 txt_label1.click();
	 }
	 public void nxtclick1() throws InterruptedException {
		 txt_nxt1.click();
		// JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click();",txt_nxt1);
		Thread.sleep(2000);
	 }
	 // 2nd question
	 public void yesclick1() {
		// try {
	// } catch(Exception e) {
		// System.out.println(e);}
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click();",txt_yesno); // txt_yesno.click();; //txt_yesno
		// System.out.println(e);}
	 }
	 public void nextclick2() {
		 txt_next22.click();
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click();",txt_next22); 
	 }
	 //3rd question
	 public void romance() {
		 txt_romantic.click();
	 }
	 public void nextclick3() {
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click();",txt_next33);  
	 } 
	}

	
	   


