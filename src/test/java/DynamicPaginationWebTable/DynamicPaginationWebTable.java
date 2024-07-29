package DynamicPaginationWebTable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPaginationWebTable {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com");
		
		driver.manage().window().maximize();
		
		//finding total pages of the table
		int totalPages=driver.findElements(By.xpath("//ul[@id='pagination']//li")).size();
		
		//repeating the steps for all pages
		for(int i=1;i<=totalPages;i++) {
			
			Thread.sleep(5000);
			//as deafult page1 is displayed no need to click that page so which page number is greater than 1 clicking that
			if(i>1) {
				
				driver.findElement(By.xpath("//ul[@id='pagination']//li["+i+"]")).click();
				//System.out.println(i+"CLicked");
			}
			
			//for each clicked page counting no. of rows and columns
			int rowSize=driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr")).size();
			//System.out.println(rowSize);
			int colSize=driver.findElements(By.xpath("//table[@id='productTable']//thead//th")).size();
			//System.out.println(colSize);
			
			//running a nested for loop to extract data of atble page wise
			for(int j=1;j<=rowSize;j++) {
				
				for(int k=1;k<=colSize;k++) {
					
					String value=driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+j+"]//td["+k+"]")).getText();
					System.out.print(value+"\t");
				}
				
				System.out.println();
				
			}
					
		}
		
		
	}

}
