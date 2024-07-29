package HandlingCheckBoxes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//selecting a particular check box
		//driver.findElement(By.xpath("//input[@id='monday']")).click();
		
		//selecting multiple checkboxes i.e all check boxes
		/*List<WebElement> checkBoxes=driver.findElements(By.xpath("//input[@class=\"form-check-input\" and @type=\"checkbox\"]"));
		
		for(int i=0;i<checkBoxes.size();i++) {
			
			checkBoxes.get(i).click();
		}*/
		
		
		//selecting last three checkboxes 
		List<WebElement> checkBoxes=driver.findElements(By.xpath("//input[@class=\"form-check-input\" and @type=\"checkbox\"]"));
		int n=checkBoxes.size();
		for(int i=n-3;i<n;i++) {
			checkBoxes.get(i).click();
		}
		
		//unselecting the check boxes which are already selected
		//List<WebElement> checkBoxes=driver.findElements(By.xpath("//input[@class=\"form-check-input\" and @type=\"checkbox\"]"));
		
		for(int i=0;i<checkBoxes.size();i++) {
			if(checkBoxes.get(i).isSelected()) {
				checkBoxes.get(i).click();
			}
		}
		
		
		
	}

}
