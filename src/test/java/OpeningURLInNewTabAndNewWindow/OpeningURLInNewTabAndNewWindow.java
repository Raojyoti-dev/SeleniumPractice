package OpeningURLInNewTabAndNewWindow;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningURLInNewTabAndNewWindow {

	public static void main(String[] args) {

			WebDriver driver=new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			//if I am opening two urls it will open in same tab one after another removing the first one
			/*driver.get("https://www.opencart.com/");
			driver.get("https://orangehrm.com/");*/
			
			
			//here opening second url in new tab using switch to() command
 			/*driver.get("https://www.opencart.com/");
			driver.switchTo().newWindow(WindowType.TAB);
			driver.get("https://orangehrm.com/");*/
			
			//here opening second url in new window using switch to() command
			driver.get("https://www.opencart.com/");
			driver.switchTo().newWindow(WindowType.WINDOW);
			driver.get("https://orangehrm.com/");
			
			
			
			
			
	}

}
