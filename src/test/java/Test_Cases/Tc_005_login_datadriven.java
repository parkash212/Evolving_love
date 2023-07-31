	package Test_Cases;
	
	import org.testng.Assert;
	import org.testng.annotations.Test;
	
	import BasePackage.BaseClass;
	import Pageobjectclasses.AdminDashboard;
	import Pageobjectclasses.MyAdminAccountPage;
	import utilities.DataProviders;

	public class Tc_005_login_datadriven extends BaseClass{
		@Test(dataProvider = "LoginData", dataProviderClass= DataProviders.class) 
	// name of dataprovider anotaion is logindata
	// note : because dataprovider anotation is not present in same class so we need to add additional parameter which is ==
	// dataProviderClass = DataProviders.class [ here DataProviders is name of class ]
	// note  : if we have dataprovider in same class then this parmeter is enough =dataProvider = "LoginData"
	
	public void test_logindatadriven(String email, String password, String exp) throws InterruptedException {
			// here because data provider is passing 3 parameter so we have to write them here 
			
			try {
	AdminDashboard ad = new AdminDashboard(driver) ;
	ad.mailes(email);
	ad.pswrd(password);
	ad.sbmt();
	ad.clear();
	
	 	MyAdminAccountPage my = new MyAdminAccountPage(driver) ;
	 	boolean targetpage = my.isMyAdminAccountPageExists();
	 	
	 	if(exp.equals("Valid")) {
		if(targetpage==true) {
			my.userdrop();
			my.logout();
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	if(exp.equals("InValid")) {
		if(targetpage==true) {
			//MyAdminAccountPage my = new MyAdminAccountPage(driver) ;
	 			my.userdrop();
	 			my.logout();
	 			Assert.assertTrue(false);
	 		}
	 		else {
	 			Assert.assertTrue(true);
	 		}
	 	}
			}catch(Exception e) {
				Assert.fail();
			}
			}
	}
