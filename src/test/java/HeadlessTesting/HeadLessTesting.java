package HeadlessTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessTesting {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless=new");
		
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://demo.opencart.com/");
		
		String title=driver.getTitle();
		if(title.equals("Your Store")) {
			
			System.out.println("TestCase Passed");
		}else {
			System.out.println("TestCase failed");
		}
	}

}
