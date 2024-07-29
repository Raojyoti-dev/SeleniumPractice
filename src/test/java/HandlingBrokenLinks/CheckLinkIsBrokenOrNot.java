package HandlingBrokenLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckLinkIsBrokenOrNot {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		//finding total no. of links
		List<WebElement>totalLinks=driver.findElements(By.tagName("a"));
		
		int totalNoOfBrokenLinks=0;
		//for each link checking if href value is there or not
		for(WebElement LinkElement:totalLinks) {
			
			String hrefValue=LinkElement.getAttribute("href");
			
			if(hrefValue==null||hrefValue.isEmpty()) {
				System.out.println("cant be checked...");
				continue;
			}
			
			
			try {
				
				URL linkURL=new URL(hrefValue); //converting href string value to URL type
				HttpURLConnection conn=(HttpURLConnection)linkURL.openConnection();//opening connection to server
				conn.connect();//connecting to the server
				
				
				if(conn.getResponseCode()>=400) {
					System.out.println(hrefValue+" it is a broken link");
					totalNoOfBrokenLinks++;
				}
				else {
					System.out.println(hrefValue+" Not a broken link");
				}
			
			} catch (Exception e) {
				
				System.out.println(e.getMessage());
				
			}
		
		}
		
		System.out.println(totalNoOfBrokenLinks);
		
		

	}
	
	

}
