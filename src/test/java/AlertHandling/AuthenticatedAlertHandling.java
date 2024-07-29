package AlertHandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticatedAlertHandling {

	public static void main(String[] args) {

			WebDriver driver=new ChromeDriver();
			//driver.get("http://the-internet.herokuapp.com/basic_auth");
			
//			using injection method to handle authenticated alert
//			by passing username and password in url it self
			
			driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
	}

}
