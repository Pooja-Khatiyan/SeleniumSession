package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownToSpecificElementToView {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.get("https://classic.freecrm.com/index.html");
		Thread.sleep(4000);
WebElement callsEle=driver.findElement(By.xpath("//h3[normalize-space()='Calls & Voice']"));//having space
/**
 * true means : i want to scroll it down, arguments[0] means: the one we have supplied
 * we are suppling only one argument and position of the is zero
 */
js.executeScript("arguments[0].scrollIntoView(true)", callsEle);	
//js.executeScript("arguments[0].scrollIntoView(true);", callsEle);	both are same
	
	}

}
