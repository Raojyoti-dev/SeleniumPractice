package WebDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		/*String title=driver.getTitle();
		System.out.println(title);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		String pageSource=driver.getPageSource();
		System.out.println(pageSource);
		
		String ID=driver.getWindowHandle();
		System.out.println(ID);*/
		
		//get windowhandles
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div/div[5]/div[3]/a")).click();
		Set<String> IDS=driver.getWindowHandles();
		System.out.println(IDS);
		
	}

}
