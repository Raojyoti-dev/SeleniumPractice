package TestNG8_Grouping;

import org.testng.annotations.Test;

public class PaymentTest {
	
	
	@Test(priority=1,groups ={"Sanity","Regression","Functional"})
	void PaymentByRupees() {
		System.out.println("payment is by rupees...");
	}
	
	@Test(priority=2,groups ={"Sanity","Regression","Functional"})
	void PaymentByDollars() {
		System.out.println("payment is by dollars...");
	}

}
