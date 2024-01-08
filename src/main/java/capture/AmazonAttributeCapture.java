package capture;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAttributeCapture {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
//WEbElement + perform action (getAttribute)		

		String srcValue = driver.findElement(By.xpath(
				"//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[2]/div[1]/div/div[1]/div/div/div/div/div[1]/a[2]/div/div/div/div/img"))
				.getAttribute("src");
		System.out.println(srcValue);
		String altValue = driver.findElement(By.xpath(
				"//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[2]/div[1]/div/div[1]/div/div/div/div/div[1]/a[2]/div/div/div/div/img"))
				.getAttribute("alt");
		System.out.println(altValue);
	}

}
