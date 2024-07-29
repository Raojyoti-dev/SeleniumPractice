package CssSelectors_Locators;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CssSelectors {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//tag and id
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Shirts");
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("pants");
		
		
		//tag and class
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("caps");
		//driver.findElement(By.cssSelector(".search-box-text")).sendKeys("sleepers");
		
		//tag and attribute
		//driver.findElement(By.cssSelector("input[placeholder=\"Search store\"]")).sendKeys("sweaters");
		//driver.findElement(By.cssSelector("[placeholder=\"Search store\"]")).sendKeys("sarees");
		
		//tag and class and attribute
		//driver.findElement(By.cssSelector("input.search-box-text[name=\"q\"]")).sendKeys("blouses");
		driver.findElement(By.cssSelector(".search-box-text[name=\"q\"]")).sendKeys("Clips");
		
		
	}

}
