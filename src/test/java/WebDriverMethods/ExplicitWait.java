package WebDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExplicitWait {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		//declaring explicit wait
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		//this webelement is causeing synchronization issue hence adding explicit wait here
		WebElement ele=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
		//driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		ele.sendKeys("Admin");
		
	}

}
