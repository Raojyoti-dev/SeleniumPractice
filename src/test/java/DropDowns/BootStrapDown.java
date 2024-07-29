package DropDowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDown {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().window().maximize();
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		
		//clicking on the drop down so that options will be visible
		
		driver.findElement(By.xpath("//button[@class=\"multiselect dropdown-toggle btn btn-default\"]")).click();
		//selecting one specific element
		//driver.findElement(By.xpath("//input[@value='Bootstrap']")).click();
		
		//selecting all the options from the drop down , hence write a common xpath for all
		List<WebElement> options=driver.findElements((By.xpath("//ul[contains(@class,'multiselect')]//label")));
		
		//selecting multiple options validation Text of each lebel
		for(WebElement option:options) {
			
			String op=option.getText();
			
			System.out.println(op);
			
			if(op.equals("Angular")|| op.equals("C#")) {
				option.click();
			}
		}
		
		
		
		
		
	
	}

}
