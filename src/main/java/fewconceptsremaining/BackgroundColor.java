package fewconceptsremaining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackgroundColor {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com");
		WebElement element = driver.findElement(By.xpath("//input[@value='Login']"));
		String bgcolor = element.getCssValue("backgroundColor");
		System.out.println(bgcolor);
	}

}
