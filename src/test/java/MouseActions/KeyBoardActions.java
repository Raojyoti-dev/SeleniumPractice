package MouseActions;

import java.awt.RenderingHints.Key;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://text-compare.com");
		
		driver.manage().window().maximize();
		
		//sending text to first text area by sendKeys();
		driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("Hi there!.. How are you ???");
		
		//here we are copyig text from first text area and slecting the text by cntrl+A and copying the text using Cntrl+C
		//then pressing tab to switch to next TextArea field then doing cntrl+V to paste same value which is is textarea1. 
		//this action is automated by keyboard actions below
		
		Actions act=new Actions(driver);
		
		//Cntrl+A for selecting the text
		
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		
		//Cntrl+C for copying the text
		
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		
		//Presstab for switching to next text area
		
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		
		//Cntrl+V for pasting the text
		
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
		
		
	}

}
