package StaticWebTable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com");
		
		//total number of rows
		int rowSize=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println(rowSize);
		
		//WHENEVER THERE IS ONLY SINGLE TABLE WE CAN USE TAGNAME DIRECTLY TO FIND OUT NO. OF ROWS OR COLS OTHERWISE USE XPATH
		
		/*int byTagnameSize=driver.findElements(By.tagName("tr")).size();
		System.out.println(byTagnameSize);*/
		
		//total number of columns
		int colSize=driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]//th")).size();
		System.out.println(colSize);
		
		//fetching specific data 5th row 1st column data I need
		String data=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
		System.out.println(data);
		
		//fetching all table data
		/*System.out.println("BookName"+"  "+"Author"+"  "+"Subject"+"  "+"Price");
		for(int i=2;i<=rowSize;i++) {
			for(int j=1;j<=colSize;j++) {
				
				WebElement eachValue=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td["+j+"]"));
				System.out.print(eachValue.getText()+"  ");
			}
			System.out.println();
		}*/
		
		

	}

}
