package SimpleAutomationTest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class SimpleTestScript {

	public static void main(String[] args) {
		
		
		//lunching chrome browser
		
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new EdgeDriver();
		//WebDriver driver=new FirefoxDriver();
		
		//navigating to url
		driver.get("https://demo.opencart.com/");
		
		//validation statement
		String title=driver.getTitle();
		if(title.equals("Your Store")) {
			
			System.out.println("TestCase Passed");
		}else {
			System.out.println("TestCase failed");
		}
		
		//closing the borwser
		//driver.close();
	}

}
