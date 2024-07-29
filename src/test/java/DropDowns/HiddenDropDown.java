package DropDowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");
		//loggin in
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		//PIM
		driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='PIM']")).click();
		
		Thread.sleep(3000);
		
		//clciking on the dropdown icon
		
		driver.findElement(By.xpath("//div[6]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]")).click();
		
		//Thread.sleep(3000);
		//selecting a specific option
		//driver.findElement(By.xpath("//span[normalize-space()='Automaton Tester']")).click();
		
		//displaying all options hence write a common xpath which includes all options of dropdown menu
		List<WebElement>options=driver.findElements(By.xpath("//div[@role=\"listbox\"]//span"));
		
		System.out.println(options.size());
		
		for(WebElement option:options) {
			
			System.out.println(option.getText());
		}
	
	}

}
