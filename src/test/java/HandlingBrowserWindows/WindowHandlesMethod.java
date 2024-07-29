package HandlingBrowserWindows;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WindowHandlesMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set<String> winIds=driver.getWindowHandles();
		
		//if two or three bowser windows are ther then this should be applied
		/*ArrayList<String> arr=new ArrayList<String>(winIds);
		
		String parentId=arr.get(0);
		String childId=arr.get(1);
		
		//switching between browsers
		driver.switchTo().window(childId);
		System.out.println(driver.getTitle());
		driver.switchTo().window(parentId);
		System.out.println(driver.getTitle());*/
		
		//if validation should be done after switching to multiple browser windows then for each loop can be used
		
		
		for(String windId:winIds) {
			
			
			 String title=driver.switchTo().window(windId).getTitle();
			 
			 //performing some action on broswer winodows
			 //if you ant to multiple browser windows
			 if(title.equals("Human Resources Management Software | OrangeHRM")|| title.equals("someother bowser window")) {
				 //System.out.println("this is child page");
				 driver.close();
			 }
		}
		
		//System.out.println("code executed successfully");
		
		
		
	}

}