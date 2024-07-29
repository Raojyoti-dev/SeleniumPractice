package MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement desktop=driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		Thread.sleep(2000);
		WebElement mac=driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(desktop).moveToElement(mac).click().build().perform();
		
	}

}
