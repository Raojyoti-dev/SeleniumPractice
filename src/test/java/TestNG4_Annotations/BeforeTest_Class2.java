package TestNG4_Annotations;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeTest_Class2 {
	@Test
	void thirsTest() {
		System.out.println("this is thirdTest...");
	}
	@Test
	void fourthTest() {
		System.out.println("this is fourthTest...");
	}
	@BeforeTest
	void afterTestMethod() {
		System.out.println("this should be run after each Test mentioned in XML...");
	}

}
