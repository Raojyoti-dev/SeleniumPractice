package TestNG8_Grouping;

import org.testng.annotations.Test;

public class SignUpTest {
	
	@Test(priority=1,groups ={"Regression"})
	void signupByGoogle() {
		System.out.println("signing up by google...");
	}
	
	@Test(priority=2,groups ={"Regression"})
	void signupByFacebook() {
		System.out.println("signing up by facebook...");
	}
	
	@Test(priority=3,groups ={"Regression"})
	void signupByTwitter() {
		System.out.println("signing up by twitter...");
	}

}
