package Test_Cases;

import BasePackage.BaseClass;
import Pageobjectclasses.MyAdminAccountPage;

public class Test_Case004 extends BaseClass{
	
	public void admintest() {
		MyAdminAccountPage my = new MyAdminAccountPage(driver) ;
		my.logout();
		my.userdrop();
	}

}
