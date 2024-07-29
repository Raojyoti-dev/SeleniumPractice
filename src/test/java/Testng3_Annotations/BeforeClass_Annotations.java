package Testng3_Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeClass_Annotations {
	
	@Test(priority=1)
	void firstTest() {
		System.out.println("this is first test");
	}
	
	@Test(priority=2)
	void secondTest() {
		System.out.println("this is second test");
	}
	@Test(priority=3)
	void thirdTest() {
		System.out.println("this is third test");
	}
	@BeforeClass
	void beforeClassTest() {
		System.out.println("this should be executed beofre all tests only once");
	}
	@AfterClass
	void afterClassTest() {
		System.out.println("this should be executed after completing all tests only once");
	}
	
}