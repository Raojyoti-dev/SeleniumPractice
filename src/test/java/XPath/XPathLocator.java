package XPath;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class XPathLocator {

	public static void main(String[] args) {
		
		
		 WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//using a single attribute xpath
		//driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("sarees");
		
		//using multiple attribute xpath
		//driver.findElement(By.xpath("//input[@placeholder='Search'][@name=\"search\"]")).sendKeys("pants");
		
		//using and operator between two attributes in xpath
		//driver.findElement(By.xpath("input[@placeholder='Search'and @name=\"search\"]")).sendKeys("shirts");
		
		////using or operator between two attributes in xpath
		//driver.findElement(By.xpath("input[placeholder='Search'or @name='xyz']")).sendKeys("shirts");
		
		//xpath using inner text
		//driver.findElement(By.xpath("//a[text()=\"MacBook\"]")).click();
		
		//get the innertext of featured using text() method 
		String text1=driver.findElement(By.xpath("//h3[text()=\"Featured\"]")).getText();
		//String text=driver.findElement(By.xpath("//*[@id=\"content\"]/h3")).getText();
		System.out.println(text1);
		System.out.println("feature captured correctly");
		
	}

}
