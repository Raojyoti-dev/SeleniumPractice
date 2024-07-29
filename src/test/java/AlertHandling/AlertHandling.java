package AlertHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.manage().window().maximize();
		
		//handling normal alert box with only ok button
		
	/*	driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		
		Alert alt=driver.switchTo().alert();
		
		System.out.println(alt.getText());
		
		alt.accept();*/
		
		//Thread.sleep(3);
		
		//handling confirmation alert box with both ok and cancel button
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		
		driver.switchTo().alert().getText();
		driver.switchTo().alert().dismiss();
		//driver.switchTo().alert().accept();*/
		
		//Thread.sleep(3);
		//handling prompt alert box
		/*Thread.sleep(2000);
		driver.findElement(By.linkText("Click for JS Prompt")).click();
				
		Alert alt=driver.switchTo().alert();
		alt.sendKeys("welcome");
		alt.accept();*/
		
		
	}

}
