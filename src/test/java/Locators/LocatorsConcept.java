package Locators;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement; 
 
public class LocatorsConcept {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("search")).sendKeys("laptop");
		
		Boolean displaySts=driver.findElement(By.id("logo")).isDisplayed();
		
		System.out.println(displaySts);
		
		driver.findElement(By.linkText("My Account")).click();
		
		System.out.println("link is clicked");
		
		//driver.findElement(By.partialLinkText("Account")).click();
		
		//System.out.println("Partial link is clicked");
		
		List<WebElement> totalLinks=driver.findElements(By.className("list-inline-item"));
		System.out.println(totalLinks.size());
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		List<WebElement> images=driver.findElements(By.tagName("img"));
		System.out.println(images.size());
		
		
		
		
		
		
		
		
	}
	
	

}
