package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrecedingSiblingAmazon {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		String text = driver.findElement(By.xpath("//a[text()='Careers']/ancestor::ul/preceding-sibling::div"))
				.getText();
		System.out.println(text);
		Thread.sleep(1000);
		driver.get("https://www.amazon.com/");
		String text1 = driver.findElement(By.xpath("//a[text()='Help']/ancestor::ul/preceding-sibling::div")).getText();
		System.out.println(text1);

	}
}
