package capture;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureGoogleLangLinks {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		List<WebElement> langLinks = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		System.out.println(langLinks.size());
		for (WebElement e : langLinks) {
			String text = e.getText();
			System.out.println(text);
			if(text.contains("मराठी")) {
				e.click();
				break;
			}
		}
	}

}
