package Test_Cases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import Pageobjectclasses.HomePage;

public class Test_Case001 extends BaseClass {
	JavascriptExecutor js = ((JavascriptExecutor)driver);
	@Test
	public void testaccount() throws InterruptedException {
		HomePage hp = new HomePage(driver) ;
	//	hp.setEmail("jj");
		hp.freequiz();
		hp.startquiz();
		hp.whitebutton();
		hp.labelclick1();
		hp.nxtclick1();
		hp.yesclick1();
		hp.nextclick2();
		hp.romance();
		hp.nextclick3();
	}

}
