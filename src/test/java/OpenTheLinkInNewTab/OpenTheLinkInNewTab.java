package OpenTheLinkInNewTab;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenTheLinkInNewTab {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demo.nopcommerce.com");
		
		driver.manage().window().maximize();
		
		//Open the Resister link  in new tab as after clicking it is opening on the same tab removing the first parent tab
		//this can be done by Actions class object
		
		//locating the resister btn
		WebElement RegisterBtn=driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		
		Actions act=new Actions(driver);
		
		//Shortcut key for opening a link which is embedded in parent tab is cntrl+that link , here it is contrl+resisterbtn
		
		//Automating Cntrl+ResisterBtn through keyboard actions
		act.keyDown(Keys.CONTROL).click(RegisterBtn).keyUp(Keys.CONTROL).perform();
		
		//switching the driver to child window and performing some actions 
		Set<String> IDs=driver.getWindowHandles();
		
		ArrayList<String> arr=new ArrayList<>(IDs);
		
		driver.switchTo().window(arr.get(1));
		
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Jyoti");
		
		driver.switchTo().window(arr.get(0));
		
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Pants");
	}

}
