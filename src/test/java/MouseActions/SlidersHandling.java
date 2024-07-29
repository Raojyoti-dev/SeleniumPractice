package MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SlidersHandling {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		
		driver.manage().window().maximize();
		//locating min point of sliding bar
		WebElement MinPoint= driver.findElement(By.xpath("//span[1]"));
		
		System.out.println(MinPoint.getLocation());
		//locating maxpoint of the sliding bar
		WebElement MaxPoint=driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[2]"));
		
		System.out.println(MaxPoint.getLocation());
		
		Actions act=new Actions(driver);
		//x pointer 200 will make slider to move right side and x pointer as 59+200 and Y will remain same
		act.dragAndDropBy(MinPoint, 200, 250).perform();
		//X pointer -200 will slide left so it will be 612-200 and Y will remain same
		act.dragAndDropBy(MaxPoint, -200, 250).perform();
		
		System.out.println("After"+MinPoint.getLocation());
		System.out.println("After"+MaxPoint.getLocation());
		
		//for vertical sliders changes corrdinates of Y azis only after getting location of min point and max point by adding and 
		//subtracting value from Y coordinate only.
	}

}
