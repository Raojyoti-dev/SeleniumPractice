package TestNG2_Annotations;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG2_Annotations {
	@Test(priority=1)
	void firstTest() {
		System.out.println("this is firstTest....");
	}
	
	@Test(priority=2)
	void secondTest() {
		System.out.println("This is secondTest...");
	}
	
	@BeforeMethod
	void before() {
		System.out.println("this should be executed befor each tests");
	}
	
	@AfterMethod
	void after() {
		System.out.println("this is should be executed after each tests");
	}

}
