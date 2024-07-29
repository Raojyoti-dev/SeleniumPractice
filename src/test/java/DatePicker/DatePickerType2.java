package DatePicker;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerType2 {
	
	//userdefined method to convert month to a Month type object
	static Month MonthConverter(String month) {
		
		HashMap<String ,Month> hm=new HashMap<String,Month>();
		
		hm.put("January",Month.JANUARY);
		hm.put("February",Month.FEBRUARY);
		hm.put("March",Month.MARCH);
		hm.put("April",Month.APRIL);
		hm.put("May",Month.MAY);
		hm.put("June",Month.JUNE);
		hm.put("July",Month.JULY);
		hm.put("August",Month.AUGUST);
		hm.put("Sepetember",Month.SEPTEMBER);
		hm.put("October",Month.OCTOBER);
		hm.put("November",Month.NOVEMBER);
		hm.put("December",Month.DECEMBER);
				
		Month monthObj=hm.get(month);
		
		if(monthObj==null) {
			System.out.println("Invalid month");
		}
		return monthObj;
	}

	public static void main(String[] args) throws InterruptedException {
		
		
		// this is a type where year is selected by dropdown 
		//but if forward btn is clicked only months will be forwarded like jan-->feb-->mar
		// if we select backward btn then only months will be decremenet like dec<-- nov<-- oct like this
		// in both types of date pickers choosing date is same process only
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		//switching to the frame as datepicker is within the frame
		driver.switchTo().frame("frame-one796456169");
		
		//inputs
		String ExpectedDate="14";
		String ExpectedMonth="February";
		String ExpectedYear="2028";
		
		//clicking on the calelnder icon to open calender
		driver.findElement(By.xpath("//span[@class=\"icon_calendar\"]")).click();
		
		//choosing year through dropdown
		WebElement yearDropdown=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select"));
		Select year=new Select(yearDropdown);
		year.selectByVisibleText(ExpectedYear);
		
		//choosing month by comparing displayed and required month to click forward or backwrod btn
		while(true){
		//getting displayed month from UI
		String CurrentMonth=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span")).getText();
		//converting months to Month obj to compare months
		Month displayedMonth= MonthConverter(CurrentMonth);
		Month requiredMonth=MonthConverter(ExpectedMonth);
		
		
		int result=displayedMonth.compareTo(requiredMonth);
		if(result>0) {
			//displayed month is greater hence need to click bakcward month
			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]/span")).click();
			
		}
		else if(result<0) {
			//displayed month is smaller hence need to click forward month
			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
			
		}
		else if(result==0){
			//displayed and required months are equal so break from the loop after choosing the date from the table
			
			List<WebElement> dates=driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tbody//td//a"));
			for(int i=0;i<dates.size();i++) {
				if((dates.get(i).getText()).equals(ExpectedDate)) {
					dates.get(i).click();
					break;
				}
			}
			
		}
	}
}

}
