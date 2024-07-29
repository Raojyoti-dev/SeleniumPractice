package CaptureScreenshot;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class CapturScreenshot {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//1)FullPage screenshot by In built interface methods
		
		/*TakesScreenshot ts=(TakesScreenshot)driver;
		File sourceFile=ts.getScreenshotAs(OutputType.FILE);
		File targetFile=new File(System.getProperty("user.dir")+"\\Screenshots\\fullpage.png");
		sourceFile.renameTo(targetFile);
		*/
		
		
		//2) Screenshot of specific part using xpath only 
		/*WebElement featuredProducts=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		File sourceFile=featuredProducts.getScreenshotAs(OutputType.FILE);
		File target=new File(System.getProperty("user.dir")+"\\Screenshots\\featuredProducts.png");
		sourceFile.renameTo(target);*/
		
		//3)Screenshot of a web element using xpath of that element same as scenario 2 only in scenario 2 we captured whole featured products(group of products) xpath as single web element
		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File sourceFile=logo.getScreenshotAs(OutputType.FILE);
		File targetFile=new File(System.getProperty("user.dir")+"\\Screenshots\\logo.png");
		sourceFile.renameTo(targetFile);
		
	}

}
