package capture;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapturelinksOfLogin {
	//by relative xpath =//a[contains(@class,'list-group-item')]
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		List<WebElement> linkList = driver.findElements(By.xpath("//div[@class='list-group']/a"));
		System.out.println(linkList.size());
		for (WebElement e : linkList) {
			String text = e.getText();
			System.out.println(text);
			if (text.contains("Order History")) {
				System.out.println("Loop Breaks");
				break;
			}
		}

	}

}
