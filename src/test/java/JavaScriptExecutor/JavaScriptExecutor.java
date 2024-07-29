package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		//ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		//Using sendkeys sending the value
		//driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Jyoti");
		
		//using JS Executor send the value
		WebElement inputBox=driver.findElement(By.xpath("//input[@id='name']"));
		
		//JavascriptExecutor js=driver; 
		JavascriptExecutor  js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value',''john')", inputBox);
		
		////using JS Executor clicking the radio btn
		WebElement radioBtn=driver.findElement(By.xpath("//input[@id='male']"));
		js.executeScript("arguments[0].click()",radioBtn);
		

	}

}
