package WebDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WaitCommands {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		//implicit wait should be mentioned right after driver instance is created
		//implicit wait and it will wait for max3 seconds where ever sycnh problem will arise
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://demo.nopcommerce.com/register");
		//wait command given by java method
		//Thread.sleep(2000);
		driver.findElement(By.id("FirstName")).sendKeys("Jyoti");
		driver.close();
		
	}

}
