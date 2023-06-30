package Test_Cases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import Pageobjectclasses.HomePage;

public class Test_Case001 extends BaseClass {
	JavascriptExecutor js = ((JavascriptExecutor)driver);
	@Test(groups = {"Regression,sanity "})
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
		hp.qust4("ashley");
		hp.nextclick4();
		hp.after4q();
		hp.qust5();
		hp.after5q();
		hp.qust6();
		hp.after6q();
		hp.qust7();
		hp.after7q();
		hp.qust8();
		hp.after8q();
		hp.qust9();
		hp.after9q();
		hp.qust10();
		hp.after10q();
		hp.part2();
		hp.qust11();
		hp.after11q();
		hp.qust12();
		hp.after12q();
		hp.qust13();
		hp.after13q();
		hp.qust14();
		hp.after14q();
		hp.qust15();
		hp.after15q();
		hp.qust16();
		hp.after16q();
		hp.qust17();
		hp.after17q();
		hp.qust18();
		hp.qust18a();
		hp.qust19();
		hp.qust19a();
		hp.qust20("iphone");
		hp.qust20a();
		hp.qust21("fifa");
		hp.qust21a();
		//hp.qust22("ashley@mailinator.com");
		//hp.qust22a();
		//hp.qust22b();
		
		hp.qust22("p");
		hp.qust22a();
		hp.qust22b();
		hp.qust23("555");	
		hp.qust23a();
		hp.qust23b();
		hp.alerting();
		hp.upgrade();
		hp.emailid("jennifer@jennifersrussell.com");
		hp.passcode("11111111");
		hp.submission();
		hp.firstname("king");
		hp.lastname("kingof");
		hp.emailing("p2@gmail.com");
		hp.numbering("678678");
		hp.checkboxing();
		hp.bill_address("goa");
		hp.selectcountry();
		hp.selectstate();
		hp.billing_city();
		hp.billing_zip();
		hp.card_number();
		hp.cvv();
		hp.expiremonth();
		hp.expireyear();
		hp.purchase();
	}

}
