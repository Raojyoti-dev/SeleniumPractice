package TestNG_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG_1 {
	
	WebDriver driver;
	
  @Test(priority=1)
  public void OpenApp() {
	  
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://demo.opencart.com/");
	  driver.manage().window().maximize();
  }
  
  @Test(priority=2)
 public void TestLogo() {
	  
	  Boolean status=driver.findElement(By.xpath("<img src=\"https://demo.opencart.com/image/catalog/opencart-logo.png\" title=\"Your Store\" alt=\"Your Store\" class=\"img-fluid\" xpath=\"1\">")).isDisplayed();
	  System.out.println(status);
	  
  }
  
  @Test(priority=3)
 public  void Logout() {
	  driver.quit();
  }
}
