package TestNG9_Dataproviders;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {
	
	WebDriver driver; 
	@BeforeClass
	void setUp() {
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(dataProvider="dp")
	void testLogin(String email, String pwd) {
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Boolean status=driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();
		if(status) {
			
			driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
		}else {
			Assert.fail();
		}
	}
	
	
	@AfterClass
	void tearDown() {
		
		driver.quit();
		
	}
	
	
	@DataProvider(name="dp")
	Object[][] loginData() {
		
		Object data[][]= {
							{"abc@gmail.com","test123"},
							{"xyz@gmail.com","test012"},
							{"john@gmail.com","test@123"},
							{"pavanol123@gmail.com","test@123"},
							{"johncanedy@gmail.com","test"}
						
				
						};
		return data;
		
		
	}

}
