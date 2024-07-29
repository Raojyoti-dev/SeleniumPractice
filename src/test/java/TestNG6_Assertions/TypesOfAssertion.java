package TestNG6_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TypesOfAssertion {
	
	//@Test
	void test() {
		
		System.out.println("testing...");
		System.out.println("testing...");
		
		Assert.assertEquals(true,false);  //hard assertion
		
		System.out.println("testing...");
		System.out.println("testing...");
		
	}	
		//Soft assertion
	@Test
	void test2() {
		
	
		System.out.println("softtesting...");
		System.out.println("softtesting...");
		
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(true,false);
		
		System.out.println("softtesting...");
		System.out.println("softtesting...");
		
		sa.assertAll();    //222222mandatory statement
	}

}
