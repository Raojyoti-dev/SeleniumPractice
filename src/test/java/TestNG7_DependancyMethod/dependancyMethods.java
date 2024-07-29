package TestNG7_DependancyMethod;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependancyMethods {
	
	@Test(priority=1)
	void openApp() {
		Assert.assertTrue(true);
	}
	@Test(priority=2,dependsOnMethods = {"openApp"})
	void login() {
		Assert.assertTrue(false);
	}
	@Test(priority=3,dependsOnMethods = {"login"})   //execution skipped as depends on login
	void search() {
		Assert.assertTrue(true);
	}
	@Test(priority=4,dependsOnMethods = {"login","search"})  //execution skipped as depends on login as well as search
	void advSearch() {
		
		Assert.assertTrue(true);
	}
	@Test(priority=5,dependsOnMethods = {"login"})  //execution skipped as depends on login
	void logout() {
		Assert.assertTrue(true);
	}

}
