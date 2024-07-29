package TestNG5_AllAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class All_Annotations {
	
	@Test(priority=1)
	void test1() {
		System.out.println("this is test1...");
	}
	@Test(priority=2)
	void test2() {
		System.out.println("this is test2...");
	}
	@BeforeSuite
	void BS() {
		System.out.println("this is before suit...");
	}
	@AfterSuite
	void AS() {
		System.out.println("this is after suit...");
	}
	
	@BeforeTest
	void BT() {
		System.out.println("this is before test...");
	}
	@AfterTest
	void AT() {
		System.out.println("this is after test...");
	}
	@BeforeClass
	void BC() {
		System.out.println("this is before class...");
	}
	@AfterClass
	void AC() {
		System.out.println("this is after class...");
	}
	@BeforeMethod
	void BM() {
		System.out.println("this is before method...");
	}
	@AfterMethod
	void AM() {
		System.out.println("this is after method...");
	}

}
