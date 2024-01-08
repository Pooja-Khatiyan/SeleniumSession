package totalelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinksOnAmazon {
//using xpath
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		List<WebElement> totalLinks = driver.findElements(By.xpath("//a"));
		System.out.println(totalLinks.size());
		for (WebElement e : totalLinks) {
			String text = e.getText();
			if (text.length() != 0) {
				System.out.println(text);
			}
		}
	}

}
