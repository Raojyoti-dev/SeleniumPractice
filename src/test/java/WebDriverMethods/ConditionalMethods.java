package WebDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConditionalMethods {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		
		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println(logo.isDisplayed());
		
		
		WebElement inputSts=driver.findElement(By.xpath("//input[@id='FirstName']"));
		System.out.println(inputSts.isEnabled());
		
		System.out.println("Before male btn is selected...");
		WebElement maleBtn=driver.findElement(By.xpath("//input[@id='gender-male']"));
		System.out.println(maleBtn.isSelected());
		
		System.out.println("After male btn is selected....");
		maleBtn.click();
		System.out.println(maleBtn.isSelected());
		
		
	}

}
