package webtablehandlestaticdynamic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(2000);
		// a[text()='Joe.Root']/parent::td/preceding-sibling::td/input
//		to be me specefic
		driver.findElement(By.xpath("//a[text()='Kevin.Mathews']/parent::td/preceding-sibling::td/input[@type='checkbox']"))
				.click();
//same formula work for all ,just we have to change the text field	
	
	}


	}


