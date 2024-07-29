package TestNG6_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {
	@Test
	void testTitle() {
		
		String actualTitle="Opencart";
		String expectedTitle="Openhall";
		
		/*if(actualTitle.equals(expectedTitle)) {
			System.out.println("test is passed");
		}else {
			System.out.println("test is failed");
		}*/
		
		//insted of conditional statement using ASssertion
		
		//Assert.assertEquals(actualTitle,expectedTitle);   //Method1
		
		//Assertion along with conditional statement   //Method2
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("testcase is passed");
			Assert.assertTrue(true);
			
		}
		else {
			System.out.println("testcase is failed");
			Assert.assertTrue(false);
		}
	}
	

}
