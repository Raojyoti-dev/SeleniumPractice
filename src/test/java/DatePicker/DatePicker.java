package DatePicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker{

	public static void main(String[] args) throws InterruptedException {
		
		
		//this is a date picker where if we select frwsard then jan 2024-->feb 2024-->march 2024 like that
		//if we select backward button then march 2024 <--feb 2024 <-- jan 2024
		//thats why we are capturing month and year and simultaneously comparing with expected ones
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://jqueryui.com/datepicker");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		//directly sending dates to input field through send keys
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("04/02/2024");
		
		//using date picker
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		String date="11";
		String month="May";
		String year="2027";
		
		while(true) {
			
			//Thread.sleep(5000);
			String Month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String Year=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(month.equals(Month) && (year.equals(Year))){
				
				break;
			}
			
			//future date clicking
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			//past date clicking
			//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
			
		}
		
		//once month and year is matched fetching all dates to select the date
		
		List<WebElement> Dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//td/a"));
		
		for(int i=0;i<Dates.size();i++) {
			
			if(date.equals(Dates.get(i).getText())) {
				
				Dates.get(i).click();
				break;
			}
		}
		
	}
		
	
		
	}


