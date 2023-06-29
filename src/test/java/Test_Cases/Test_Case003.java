package Test_Cases;

import org.testng.Assert;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import Pageobjectclasses.AdminDashboard;
import Pageobjectclasses.MyAdminAccountPage;

public class Test_Case003 extends BaseClass {
	@Test(dataProvider="LoginData,dataProviderClass=DataProviders.class") 
	// here we give extra parameter because data providers is present in separte class ( dataProviderClass=DataProviders.class )
	
	public void testingaccount(String email, String password, String exp) throws InterruptedException {
		
 	AdminDashboard ad = new AdminDashboard(driver) ;
 	ad.mailes(email);
 	ad.pswrd(password);
 	ad.sbmt();
 	MyAdminAccountPage my = new MyAdminAccountPage(driver) ;
 	boolean targetpage = my.isMyAdminAccountPageExists();
 	
 	if(exp.equals("Valid")) {
 		if(targetpage==true) {
 			my.logout();
 			Assert.assertTrue(true);
 		}
 		else {
 			Assert.assertTrue(false);
 		}
 	}
 	if(exp.equals("InValid")) {
 		if(targetpage==true) {
 			my.logout();
 			Assert.assertTrue(false);
 		}
 		else {
 			Assert.assertTrue(true);
 		}
 	}


}
}