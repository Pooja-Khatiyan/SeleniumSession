package webtablehandlestaticdynamic;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FollowingSiblingWebTableHandling {
//to select specific role value we can use capture group with indexing/position function
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(2000);
		List<WebElement> list = driver
				.findElements(By.xpath("//a[text()='Joe.Root']/parent::td/following-sibling::td"));

		List<String> eleList = new ArrayList<String>();
		for (WebElement e : list) {
			String text = e.getText();
			eleList.add(text);

		}
		System.out.println(eleList);
		driver.close();
	}

}
