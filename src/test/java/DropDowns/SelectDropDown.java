package DropDowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com");
		
		
		WebElement dropdownEle=driver.findElement(By.xpath("//select[@id='country']"));
		
		Select dropdown=new Select(dropdownEle);
		
	//	dropdown.selectByVisibleText("France");
		
	//	dropdown.selectByValue("uk");
		
	//	dropdown.selectByIndex(5);
		
		List<WebElement> options=dropdown.getOptions();
		
		System.out.println("total no. of options: "+options.size());
		
		for(WebElement option:options) {
			System.out.println(option.getText());
		}
		
	}

}
