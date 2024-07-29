package FramesHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesHandling {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		//locating the frame1  and storing  to  a webElement
		WebElement frame1=driver.findElement(By.xpath("//frame[@src=\"frame_1.html\"]"));
		//switching to frame1 from main webpage, here frame1 is passesd in the form of webelement
		driver.switchTo().frame(frame1);
		//passing input value to frame1 input box
		driver.findElement(By.name("mytext1")).sendKeys("welcome");
		//switching back to main page
		driver.switchTo().defaultContent();
		
		//locating the frame2  and storing  to  a webElement
		WebElement frame2=driver.findElement(By.xpath("//frame[@src=\"frame_2.html\"]"));
		//switching to frame1 from main webpage, here frame1 is passesd in the form of webelement
		driver.switchTo().frame(frame2);
		//passing input value to frame2 input box
		driver.findElement(By.name("mytext2")).sendKeys("selenium");
		//switching back to main page
		driver.switchTo().defaultContent();
		
		//Accessing element of inner iframe of frame3
		//switching to frame3
		WebElement frame3=driver.findElement(By.xpath("//frame[@src=\"frame_3.html\"]"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.name("mytext3")).sendKeys("Java");
		
		//switching to inner iframe by index cause frame 3 has only one iframe
		driver.switchTo().frame(0);
		//driver.findElement(By.xpath("//div[@id='i8']//div[@class='rseUEf nQOrEb']")).click();//whenever direct clicking of radiobtn throws error run the code by using javascriptexecutor as belo
		//clicking the radiobtn as javascriot executor as it was throwing exception notInteractable
		WebElement radioBtn=driver.findElement(By.xpath("//div[@id='i8']//div[@class='rseUEf nQOrEb']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()",radioBtn);
		
		driver.switchTo().defaultContent();
		
	}

}
