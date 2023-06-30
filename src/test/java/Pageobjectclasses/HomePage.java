package Pageobjectclasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage{
	
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	 Actions act = new Actions(driver);
	
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

//driver.switchTo().newWindow(WindowType.TAB);// driver.switchTo().newWindow(WindowType.TAB);

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

// 4th qustion	
@FindBy(name="question4")
WebElement txt_question4;

@FindBy(xpath="//a[@id='next1']")
WebElement txt_next44;
   
//after 4 qustion
@FindBy(xpath="//a[@id='next1']")
WebElement txt_after4;

//5th qustion
@FindBy(xpath="//div[@class='list-container']//div[1]//label[1]//span[1]")
WebElement txt_ele1;
@FindBy(xpath="//div[@class='rankOrder top_rank']//li[1]")
WebElement txt_ele2;
@FindBy(xpath="//span[text()='Present and accepting']")
WebElement txt_ele3;
@FindBy(xpath="//div[@class='rankOrder top_rank']//li[2]")
WebElement txt_ele4;
@FindBy(xpath="//span[text()='Clear and discerning']")
WebElement txt_ele5;
@FindBy(xpath="//div[@class='rankOrder top_rank']//li[3]")
WebElement txt_ele6;
@FindBy(xpath="//span[text()='Inspiring and evolutionary']")
WebElement txt_ele7;
@FindBy(xpath="//li[@class='draggedLast-value ui-droppable']")
WebElement txt_ele8;

@FindBy(xpath="//a[@id='next1']")
WebElement txt_after5
;
// 6 question
@FindBy(xpath="//span[text()='Being sensual and making things exciting and fun between us']")
WebElement txt_mag1;
@FindBy(xpath="//div[@class='rankOrder top_rank']//li[1]")
WebElement txt_mag2;
@FindBy(xpath="//span[text()='Being committed and staying connected so that they know they are loved']")
WebElement txt_mag3;
@FindBy(xpath="//div[@class='rankOrder top_rank']//li[2]")
WebElement txt_mag4;
@FindBy(xpath="//span[text()='Being honest and wanting to fully understand the truth']")
WebElement txt_mag5;
@FindBy(xpath="//div[@class='rankOrder top_rank']//li[3]")
WebElement txt_mag6;
@FindBy(xpath="//span[contains(text(),'Being open and curious to learn more about my part')]")
WebElement txt_mag7;
@FindBy(xpath="//li[@class='draggedLast-value ui-droppable']")
WebElement txt_mag8;

@FindBy(xpath="//a[@id='next1']")
WebElement txt_after6;
 
//  qustion = 7
@FindBy(xpath="//span[text()='Integrity']")
WebElement txt_gem1;
@FindBy(xpath="//div[@class='rankOrder top_rank']//li[1]")
WebElement txt_gem2;
@FindBy(xpath="//span[text()='Sovereignty']")
WebElement txt_gem3;
@FindBy(xpath="//div[@class='rankOrder top_rank']//li[2]")
WebElement txt_gem4;
@FindBy(xpath="//span[text()='Presence']")
WebElement txt_gem5;
@FindBy(xpath="//div[@class='rankOrder top_rank']//li[3]")
WebElement txt_gem6;
@FindBy(xpath="//span[text()='Commitment']")
WebElement txt_gem7;
@FindBy(xpath="//li[@class='draggedLast-value ui-droppable']")
WebElement txt_gem8;

@FindBy(xpath="//a[@id='next1']")
WebElement txt_after7;
//
  
  //qustion - 8
@FindBy(xpath="//span[text()='Creating conversations about what can be improved']")
WebElement txt_gun1;
@FindBy(xpath="//div[@class='rankOrder top_rank']//li[1]")
WebElement txt_gun2;
@FindBy(xpath="//span[text()='Bringing empathy and understanding']")
WebElement txt_gun3;
@FindBy(xpath="//div[@class='rankOrder top_rank']//li[2]")
WebElement txt_gun4;
@FindBy(xpath="//span[text()='Being direct about my thoughts and feelings']")
WebElement txt_gun5;
@FindBy(xpath="//div[@class='rankOrder top_rank']//li[3]")
WebElement txt_gun6;
@FindBy(xpath="//span[text()='Initiating provocative conversations and energizing the room']")
WebElement txt_gun7;
@FindBy(xpath="//li[@class='draggedLast-value ui-droppable']")
WebElement txt_gun8;

@FindBy(xpath="//a[@id='next1']")
    WebElement txt_after8;
  
  
// qustion - 9 
@FindBy(xpath="//span[text()='De-escalate and help to restore positive feelings between us']")
WebElement txt_bun1;
@FindBy(xpath="//div[@class='rankOrder top_rank']//li[1]")
WebElement txt_bun2;
@FindBy(xpath="//span[text()='Speak truthfully and acknowledge what happened']")
WebElement txt_bun3;
@FindBy(xpath="//div[@class='rankOrder top_rank']//li[2]")
WebElement txt_bun4;
@FindBy(xpath="//span[text()='Make sure we each get all our needs met']")
WebElement txt_bun5;
@FindBy(xpath="//div[@class='rankOrder top_rank']//li[3]")
WebElement txt_bun6;
@FindBy(xpath="//span[text()='Make suggestions for what might improve things']")
WebElement txt_bun7;
@FindBy(xpath="//li[@class='draggedLast-value ui-droppable']")
WebElement txt_bun8;

@FindBy(xpath="//a[@id='next1']")
    WebElement txt_after9;
 
  
  //qustion = 10 
@FindBy(xpath="//span[text()='Living my values and creating an inspiring vision for our relationship']")
WebElement txt_mug1;
@FindBy(xpath="//div[@class='rankOrder top_rank']//li[1]")
WebElement txt_mug2;
@FindBy(xpath="//span[text()='Seeing their best qualities and being grateful for what is']")
WebElement txt_mug3;
@FindBy(xpath="//div[@class='rankOrder top_rank']//li[2]")
WebElement txt_mug4;
@FindBy(xpath="//span[text()='Honoring our sovereignty and our individual needs']")
WebElement txt_mug5;
@FindBy(xpath="//div[@class='rankOrder top_rank']//li[3]")
WebElement txt_mug6;
@FindBy(xpath="//span[text()='Tracking what has my partner feel the most loved and adored']")
WebElement txt_mug7;
@FindBy(xpath="//li[@class='draggedLast-value ui-droppable']")
WebElement txt_mug8;

@FindBy(xpath="//a[@id='next1']")
WebElement txt_after10
;
// part - 2
@FindBy(xpath="//a[@id='nextpart2']")
WebElement txt_button11;
//qustion = 11 
@FindBy(xpath="//span[text()='Anxious']")
WebElement txt_rum1;
@FindBy(xpath="//div[@class='rankOrder top_rank']//li[1]")
WebElement txt_rum2;
@FindBy(xpath="//span[text()='Superior']")
WebElement txt_rum3;
@FindBy(xpath="//div[@class='rankOrder top_rank']//li[2]")
WebElement txt_rum4;
@FindBy(xpath="//span[text()='Ashamed']")
WebElement txt_rum5;
@FindBy(xpath="//div[@class='rankOrder top_rank']//li[3]")
WebElement txt_rum6;
@FindBy(xpath="//span[text()='Resentful']")
WebElement txt_rum7;
@FindBy(xpath="//li[@class='draggedLast-value ui-droppable']")
WebElement txt_rum8;

@FindBy(xpath="//a[@id='next1']")
WebElement txt_after11;

//qustion = 12 
@FindBy(xpath="//span[text()='Blame']")
WebElement txt_car1;
@FindBy(xpath="//div[@class='rankOrder top_rank']//li[1]")
WebElement txt_car2;
@FindBy(xpath="//span[text()='Defend']")
WebElement txt_car3;
@FindBy(xpath="//div[@class='rankOrder top_rank']//li[2]")
WebElement txt_car4;
@FindBy(xpath="//span[text()='Control']")
WebElement txt_car5;
@FindBy(xpath="//div[@class='rankOrder top_rank']//li[3]")
WebElement txt_car6;
@FindBy(xpath="//span[text()='Acquiesce']")
WebElement txt_car7;
@FindBy(xpath="//li[@class='draggedLast-value ui-droppable']")
WebElement txt_car8;

@FindBy(xpath="//a[@id='next1']")
WebElement txt_after12;

//qustion = 13
@FindBy(xpath="//div[@class='list-container']//div[1]//label[1]//span[1]")
WebElement txt_bar1;
@FindBy(xpath="//div[@class='rankOrder top_rank']//li[1]")
WebElement txt_bar2;
@FindBy(xpath="//span[text()='Use sharp piercing words']")
WebElement txt_bar3;
@FindBy(xpath="//div[@class='rankOrder top_rank']//li[2]")
WebElement txt_bar4;
@FindBy(xpath="//span[text()='Take some space from the situation']")
WebElement txt_bar5;
@FindBy(xpath="//div[@class='rankOrder top_rank']//li[3]")
WebElement txt_bar6;
@FindBy(xpath="//span[text()='Try to fix my partner']")
WebElement txt_bar7;
@FindBy(xpath="//li[@class='draggedLast-value ui-droppable']")
WebElement txt_bar8;

@FindBy(xpath="//a[@id='next1']")
WebElement txt_after13;

//qustion = 14
@FindBy(xpath="//span[text()='Connection']")
WebElement txt_on1;
@FindBy(xpath="//div[@class='rankOrder top_rank']//li[1]")
WebElement txt_on2;
@FindBy(xpath="//span[text()='Kindness']")
WebElement txt_on3;
@FindBy(xpath="//div[@class='rankOrder top_rank']//li[2]")
WebElement txt_on4;
@FindBy(xpath="//span[text()='Space']")
WebElement txt_on5;
@FindBy(xpath="//div[@class='rankOrder top_rank']//li[3]")
WebElement txt_on6;
@FindBy(xpath="//span[text()='Acceptance']")
WebElement txt_on7;
@FindBy(xpath="//li[@class='draggedLast-value ui-droppable']")
WebElement txt_on8;

@FindBy(xpath="//a[@id='next1']")
WebElement txt_after14;

//qustion = 15
@FindBy(xpath="//span[text()='Resist and burrow deep down inside']")
WebElement txt_off1;
@FindBy(xpath="//div[@class='rankOrder top_rank']//li[1]")
WebElement txt_off2;
@FindBy(xpath="//span[text()='React with frustration and blame']")
WebElement txt_off3;
@FindBy(xpath="//div[@class='rankOrder top_rank']//li[2]")
WebElement txt_off4;
@FindBy(xpath="//span[text()='Dissociate and focus on my needs']")
WebElement txt_off5;
@FindBy(xpath="//div[@class='rankOrder top_rank']//li[3]")
WebElement txt_off6;
@FindBy(xpath="//span[text()='Feel numb and make compromises to move things forward']")
WebElement txt_off7;
@FindBy(xpath="//li[@class='draggedLast-value ui-droppable']")
WebElement txt_off8;

@FindBy(xpath="//a[@id='next1']")
WebElement txt_after15;

//question = 16
WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
//wait.until(ExpectedConditions.visibilityOfElementLocated(txt_key1(of.duration(10)));
@FindBy(xpath="//div[@class='list-container']//div[1]//label[1]//span[1]")
WebElement txt_key1;
@FindBy(xpath="//div[@class='rankOrder top_rank']//li[1]")
WebElement txt_key2;
@FindBy(xpath="//div[@class='list-container']//div[2]//label[1]//span[1]")
WebElement txt_key3;
@FindBy(xpath="//div[@class='rankOrder top_rank']//li[2]")
WebElement txt_key4;
@FindBy(xpath="//div[@class='list-container']//div[3]//label[1]//span[1]")
WebElement txt_key5;
@FindBy(xpath="//div[@class='rankOrder top_rank']//li[3]")
WebElement txt_key6;
@FindBy(xpath="//div[@class='list-container']//div[4]//label[1]//span[1]")
WebElement txt_key7;
@FindBy(xpath="//li[@class='draggedLast-value ui-droppable']")
WebElement txt_key8;

@FindBy(xpath="//a[@id='next1']")
WebElement txt_after16;

//question = 17
@FindBy(xpath="//span[text()='Needy or desperate']")
WebElement txt_keys1;
@FindBy(xpath="//div[@class='rankOrder top_rank']//li[1]")
WebElement txt_keys2;
@FindBy(xpath="//span[text()='Superior or blamey']")
WebElement txt_keys3;
@FindBy(xpath="//div[@class='rankOrder top_rank']//li[2]")
WebElement txt_keys4;
@FindBy(xpath="//span[text()='Dishonest or betray my trust']")
WebElement txt_keys5;
@FindBy(xpath="//div[@class='rankOrder top_rank']//li[3]")
WebElement txt_keys6;
@FindBy(xpath="//span[text()='Over processing or pushy']")
WebElement txt_keys7;
@FindBy(xpath="//li[@class='draggedLast-value ui-droppable']")
WebElement txt_keys8;

@FindBy(xpath="//a[@id='next1']")
WebElement txt_after17;

// question 18
@FindBy(xpath="//span[text()='I identify as male']")
WebElement txt_qust18;
@FindBy(xpath="//a[@id='next1']")
WebElement txt_button19;

//question 19
@FindBy(xpath="//span[normalize-space()='I follow one or more relationship experts']")
WebElement txt_qust19;
@FindBy(xpath="//a[@id='next1']")
WebElement txt_button20;

//question = 20
@FindBy(xpath="//input[@placeholder='Type your answere here...']")
WebElement txt_qust20;
@FindBy(xpath="//a[@id='next1']")
WebElement txt_button21;

// question = 21
@FindBy(xpath="//input[@name='question21']")
WebElement txt_qust21;
@FindBy(xpath="//a[@id='next1']")
WebElement txt_button22;

// question 22 

@FindBy(xpath="//input[@placeholder='name@example.com']")
WebElement txt_qust22;

@FindBy(xpath="//input[@type='checkbox']")
WebElement txt_button23;

@FindBy(xpath="//a[@id='next1']")
WebElement txt_button24; 


//question 23 - 22
@FindBy(name="question23")
WebElement txt_qust23;

@FindBy(xpath="//input[@type='checkbox']")
WebElement txt_button25;

@FindBy(xpath="//button[@name='sub_btn']")
WebElement txt_button26;

// alert 
@FindBy(xpath="//a[text()='Yes']")
WebElement txt_button27;

@FindBy(xpath="//div[7]//a[@class='btn btn-white-filled' and text()=' UPGRADE TO UNLOCK']")
WebElement txt_reports;

@FindBy(xpath="//div[@class='control-group mb-4']//input[@type='email']")
WebElement txt_emailid;

@FindBy(id="password")
WebElement txt_passcode;

@FindBy(xpath="//input[@type='submit']")
WebElement txt_submission;


//user details 

 @FindBy(xpath = "//input[@placeholder='First Name']")
WebElement txt_first_name;

@FindBy(name = "last_name")
WebElement txt_last_name;
 
@FindBy(name = "email")
WebElement txt_emailing;


@FindBy(name = "number")
WebElement txt_numbering;


@FindBy(xpath = "//input[@type='checkbox']")
WebElement txt_checkboxing;

@FindBy(name = "billing_address")
WebElement txt_bill_address; 

//Select selection = new Select(); country
@FindBy(id="country")
WebElement txt_selectcountry;

@FindBy(id="state")
WebElement txt_selectstate;

// billing_city
@FindBy(name="billing_city")
WebElement txt_billingcity;

@FindBy(name="billing_zip")
WebElement txt_billing_zip;

@FindBy(name="card_number")
WebElement txt_card_number;

@FindBy(name="cvv")
WebElement txt_cvv;

//for card
 @FindBy(name="expiration-month")
   WebElement txt_expiremonth;
 
 @FindBy(name="expiration-year")
  WebElement txt_expireyear;
 
 @FindBy(xpath="//button[@id=\"purchase-btn\"]")
 WebElement txt_purchase;
 


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
 js.executeScript("arguments[0].click();",txt_nxt1);
	Thread.sleep(2000);
 }
 // 2nd question
 public void yesclick1() {
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
 //question 4
 public void qust4(String name) {
	 txt_question4.sendKeys(name);
 }
 public void nextclick4() throws InterruptedException {
	 js.executeScript("arguments[0].click();",txt_next44);
	 Thread.sleep(3000);
 } 
 public void after4q() {
	 txt_after4.click();
 }
 // question 5
 public void qust5() {
	 act.dragAndDrop(txt_ele1,txt_ele2).build().perform();
	 act.dragAndDrop(txt_ele3,txt_ele4).build().perform();
	 act.dragAndDrop(txt_ele5,txt_ele6).build().perform();
	 act.dragAndDrop(txt_ele7,txt_ele8).build().perform();
 }
 public void after5q() {
	 txt_after5.click();
 }
 // question 6
 public void qust6()  {
	 act.dragAndDrop(txt_mag1,txt_mag2).build().perform();
	 act.dragAndDrop(txt_mag3,txt_mag4).build().perform();
	 act.dragAndDrop(txt_mag5,txt_mag6).build().perform();
	 act.dragAndDrop(txt_mag7,txt_mag8).build().perform();
	 
 }
 public void after6q() {
	 js.executeScript("arguments[0].click();", txt_after6);
// txt_after6.click();
 }
 public void qust7()  {
	 act.dragAndDrop(txt_gem1,txt_gem2).build().perform();
	 act.dragAndDrop(txt_gem3,txt_gem4).build().perform();
	 act.dragAndDrop(txt_gem5,txt_gem6).build().perform();
	 act.dragAndDrop(txt_gem7,txt_gem8).build().perform();
	 
 }
 public void after7q() {
	 js.executeScript("arguments[0].click();", txt_after7);
 }
 public void qust8()  {
	 act.dragAndDrop(txt_gun1,txt_gun2).build().perform();
	 act.dragAndDrop(txt_gun3,txt_gun4).build().perform();
	 act.dragAndDrop(txt_gun5,txt_gun6).build().perform();
	 act.dragAndDrop(txt_gun7,txt_gun8).build().perform();
	 
 }
 public void after8q() {
	 js.executeScript("arguments[0].click();", txt_after8);
 }
 public void qust9()  {
	 act.dragAndDrop(txt_bun1,txt_bun2).build().perform();
	 act.dragAndDrop(txt_bun3,txt_bun4).build().perform();
	 act.dragAndDrop(txt_bun5,txt_bun6).build().perform();
	 act.dragAndDrop(txt_bun7,txt_bun8).build().perform();
	 
 }
 public void after9q() {
	 js.executeScript("arguments[0].click();", txt_after9);
 }
 public void qust10()  {
	 act.dragAndDrop(txt_mug1,txt_mug2).build().perform();
	 act.dragAndDrop(txt_mug3,txt_mug4).build().perform();
	 act.dragAndDrop(txt_mug5,txt_mug6).build().perform();
	 act.dragAndDrop(txt_mug7,txt_mug8).build().perform();
	 
 }
 public void after10q() {
	 js.executeScript("arguments[0].click();", txt_after10);
 }
 public void part2() {
	 js.executeScript("arguments[0].click();", txt_button11);
 }
 public void qust11()  {
	 act.dragAndDrop(txt_rum1,txt_rum2).build().perform();
	 act.dragAndDrop(txt_rum3,txt_rum4).build().perform();
	 act.dragAndDrop(txt_rum5,txt_rum6).build().perform();
	 act.dragAndDrop(txt_rum7,txt_rum8).build().perform(); 
 }
 public void after11q() {
	 js.executeScript("arguments[0].click();", txt_after11);
 }
 public void qust12()  {
	 act.dragAndDrop(txt_car1,txt_car2).build().perform();
	 act.dragAndDrop(txt_car3,txt_car4).build().perform();
	 act.dragAndDrop(txt_car5,txt_car6).build().perform();
	 act.dragAndDrop(txt_car7,txt_car8).build().perform(); 
 }
 public void after12q() {
	 js.executeScript("arguments[0].click();", txt_after12);
 }
 public void qust13()  {
	 act.dragAndDrop(txt_bar1,txt_bar2).build().perform();
	 act.dragAndDrop(txt_bar3,txt_bar4).build().perform();
	 act.dragAndDrop(txt_bar5,txt_bar6).build().perform();
	 act.dragAndDrop(txt_bar7,txt_bar8).build().perform(); 
 }
 public void after13q() {
	 js.executeScript("arguments[0].click();", txt_after13);
 }
 public void qust14()  {try {
	 act.dragAndDrop(txt_on1,txt_on2).build().perform();
	 act.dragAndDrop(txt_on3,txt_on4).build().perform();
	 act.dragAndDrop(txt_on5,txt_on6).build().perform();
	 act.dragAndDrop(txt_on7,txt_on8).build().perform(); 
 
  } catch (Exception e) {
	 System.out.println(e);
 }}
 public void after14q() {
	 js.executeScript("arguments[0].click();", txt_after14);
 }
 public void qust15()  {
	 act.dragAndDrop(txt_off1,txt_off2).build().perform();
	 act.dragAndDrop(txt_off3,txt_off4).build().perform();
	 act.dragAndDrop(txt_off5,txt_off6).build().perform();
	 act.dragAndDrop(txt_off7,txt_off8).build().perform(); 
 }
 public void after15q() {
	 js.executeScript("arguments[0].click();", txt_after15);
 }
 public void qust16()  {
	 try {
	 act.dragAndDrop(txt_key1,txt_key2).build().perform();
	 act.dragAndDrop(txt_key3,txt_key4).build().perform();
	 act.dragAndDrop(txt_key5,txt_key6).build().perform();
	 act.dragAndDrop(txt_key7,txt_key8).build().perform(); 
 } catch(Exception e) {
	 System.out.println(e); }
 }
 public void after16q() {
	 js.executeScript("arguments[0].click();", txt_after16);
 }
 public void qust17()  {
	 act.dragAndDrop(txt_keys1,txt_keys2).build().perform();
	 act.dragAndDrop(txt_keys3,txt_keys4).build().perform();
	 act.dragAndDrop(txt_keys5,txt_keys6).build().perform();
	 act.dragAndDrop(txt_keys7,txt_keys8).build().perform(); 
 }
 public void after17q() {
	 js.executeScript("arguments[0].click();", txt_after17);
 }
 public void qust18() {
	 js.executeScript("arguments[0].click();", txt_qust18); }
 
 public void qust18a() {
	 js.executeScript("arguments[0].click();", txt_button19);
 }
 public void qust19() {
	 js.executeScript("arguments[0].click();", txt_qust19); }
 
 public void qust19a() {
	 js.executeScript("arguments[0].click();", txt_button20);
 }
 public void qust20(String value) {
	 js.executeScript("arguments[0].value='iphone';", txt_qust20); }
 
 public void qust20a() {
	 js.executeScript("arguments[0].click();", txt_button21);
 }
 public void qust21(String values) {
	 js.executeScript("arguments[0].value='fifa';", txt_qust21); }
 
 public void qust21a() {
	 js.executeScript("arguments[0].click();", txt_button22);
 }

 
 public void qust22(String b) {
		js.executeScript("arguments[0].value='kaizen@mailinator.com';",txt_qust22);
	}
	public void qust22a() {
		js.executeScript("arguments[0].click();",txt_button23);
	}
	public void qust22b() {
		js.executeScript("arguments[0].click();",txt_button24);
	}
	 public void qust23(String mob) {
		 js.executeScript("arguments[0].value='555';",txt_qust23);  
	 }

 public void qust23a() {
	 js.executeScript("arguments[0].click();", txt_button25);
 }
 public void qust23b() {
	 js.executeScript("arguments[0].click();", txt_button26);
 }
 
 public void alerting() {
	 js.executeScript("arguments[0].click();",txt_button27);
 }
 public void upgrade() {
	 js.executeScript("arguments[0].click();",txt_reports);
 }
 public void emailid(String passes) {
		js.executeScript("arguments[0].value='jennifer@jennifersrussell.com';", txt_emailid); }

public void passcode(String pass) {
	js.executeScript("arguments[0].value='11111111';", txt_passcode); }


public void submission() {
	 js.executeScript("arguments[0].click();",txt_submission);
}
public void firstname(String passess) {
	js.executeScript("arguments[0].value='king';", txt_first_name);
	}
public void lastname(String p) {
	js.executeScript("arguments[0].value='kingof';", txt_last_name);
	
	}
public void emailing(String passel) {
	js.executeScript("arguments[0].value='p@gmail.com';", txt_emailing);
	
	}
public void numbering(String cal) {
	js.executeScript("arguments[0].value='78787';", txt_numbering);
	}
public void checkboxing() {
	js.executeScript("arguments[0].click();", txt_checkboxing);
}
public void bill_address(String cal) {
	js.executeScript("arguments[0].value='kingof';", txt_bill_address);
	}
public void selectcountry() {
	Select selection = new Select(txt_selectcountry);
	selection.selectByVisibleText("India");
}
public void selectstate() {
	Select selection = new Select(txt_selectstate);
	selection.selectByVisibleText("Haryana");
}
public void billing_city() {
	js.executeScript("arguments[0].value='chandigarh';", txt_billingcity);
}

public void billing_zip() {
	js.executeScript("arguments[0].value='135133';", txt_billing_zip);
}
public void card_number() {
js.executeScript("arguments[0].value='4242424242424242';", txt_card_number);
}

public void cvv() {
js.executeScript("arguments[0].value='123';", txt_cvv);
}
public void expiremonth() {
	Select selection = new Select(txt_expiremonth);
	selection.selectByVisibleText("02 - February");
}
public void expireyear() {
Select selection = new Select(txt_expireyear);
selection.selectByVisibleText("2024");
}
public void purchase() {
	js.executeScript("arguments[0].click();",txt_purchase);
}


}

