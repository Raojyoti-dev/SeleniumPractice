package DataDrivenTest;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DDTExecutionClass {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		//https://moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		driver.manage().window().maximize();
		
		String filePath=System.getProperty("user.dir")+"\\TestData\\DataDrivenTestData.xlsx";
		
		int rowCount=ExcelUtils.getRowCount(filePath,"Sheet2");
		
		for(int i=1;i<=rowCount;i++) {
			
			//1)read data from excel
			
			String principal=ExcelUtils.getCellData(filePath,"Sheet2",i,0);
			String interest=ExcelUtils.getCellData(filePath,"Sheet2",i,1);
			String Period=ExcelUtils.getCellData(filePath,"Sheet2",i,2);
			String Frequency=ExcelUtils.getCellData(filePath,"Sheet2",i,3);
			String ExpectedAmount=ExcelUtils.getCellData(filePath,"Sheet2",i,4);
			
			//2)pass above data into Application
			WebElement AmountField=driver.findElement(By.xpath("//input[@id='principal']"));
			AmountField.sendKeys(principal);
			
			WebElement rate=driver.findElement(By.xpath("//input[@id='interest']"));
			rate.sendKeys(interest);
			
			WebElement Tenure=driver.findElement(By.xpath("//input[@id='tenure']"));
			Tenure.sendKeys(Period);
			
			WebElement TenurePeriod=driver.findElement(By.xpath("//select[@id='tenurePeriod']"));
			Select select=new Select(TenurePeriod);
			select.selectByVisibleText(Frequency);
			
			//clicking on the calculate btn
			driver.findElement(By.xpath("//img[@src='https://images.moneycontrol.com/images/mf_revamp/btn_calcutate.gif']")).click();
			
			//3)Validation
			//getting actual calculated value from Application to compare
			String ActualAmount=driver.findElement(By.xpath("//span[@id=\"resp_matval\"]//strong")).getText();
			
			if(Double.parseDouble(ActualAmount)==Double.parseDouble(ExpectedAmount)) {
				
				System.out.println("Test Passed");
				ExcelUtils.setCellData(filePath,"Sheet2",i,6,"Passed");
				ExcelUtils.fillGreenColor(filePath,"Sheet2",i,6);
			}
			else {
				System.out.println("Test Failed");
				ExcelUtils.setCellData(filePath,"Sheet2",i,6,"Failed");
				ExcelUtils.fillRedColor(filePath,"Sheet2",i,6);
			}
			
			Thread.sleep(3000);
			//clearing the before enetering next row value
			driver.findElement(By.xpath("//img[@class='PL5']")).click();
			
			
		}
	}

}
