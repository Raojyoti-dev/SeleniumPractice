package NavigationCommands;

import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;

public class NavigationMethods {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		//passing url as an URL obj
		
		/*URL myurl=new URL("https://demo.opencart.com/");
		driver.navigate().to(myurl);*/
		
		driver.navigate().to("https://demo.opencart.com/");
		driver.navigate().to("https://demo.nopcommerce.com/register");
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().refresh();
		
		
		//driver.close();
		
	}

}
