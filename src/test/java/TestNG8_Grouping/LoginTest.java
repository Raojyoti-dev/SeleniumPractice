package TestNG8_Grouping;

import org.testng.annotations.Test;

public class LoginTest {
	
	
	@Test(priority=1,groups ={"Sanity"})
	void loginByGoogle() {
		
		System.out.println("logging in by google...");
	}
	
	@Test(priority=2,groups ={"Sanity"})
	void loginByFacebook() {
		
		System.out.println("logging in by facebook...");
	}

	@Test(priority=3,groups ={"Sanity"})
	void loginByTwitter() {
		
		System.out.println("logging in by twitter...");
	}
}
