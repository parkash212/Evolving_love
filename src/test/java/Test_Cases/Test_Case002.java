package Test_Cases;

import org.testng.annotations.Test;

import BasePackage.BaseClass;
import Pageobjectclasses.StartingQuiz;

public class Test_Case002 extends BaseClass{
	@Test
	public void baseAccount() {
		StartingQuiz st = new StartingQuiz(driver);
		st.labelclick1();
		st.nxtclick1();
		
	}

}
