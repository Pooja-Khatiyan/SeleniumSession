package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonCaptureGroupXpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		//to be more specific 
		driver.findElement(By.xpath("//label[@class='radio-inline'][1]/input[@type='radio']")).click();
		// can also use
		driver.findElement(By.xpath("(//label[@class='radio-inline'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
	}

}
