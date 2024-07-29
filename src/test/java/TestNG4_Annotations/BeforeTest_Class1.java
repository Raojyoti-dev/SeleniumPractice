package TestNG4_Annotations;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeTest_Class1 {
	@Test
	void firstTest() {
		System.out.println("this is firstTest...");
	}
	@Test
	void secondTest() {
		System.out.println("this is secondTest...");
	}
	@BeforeTest
	void beforeTestMethod() {
		System.out.println("this should be run before each Test mentioned in XML..");
	}

}
