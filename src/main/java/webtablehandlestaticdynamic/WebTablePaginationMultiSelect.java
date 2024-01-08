package webtablehandlestaticdynamic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePaginationMultiSelect {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(4000);
//multiple selection 
		while (true) {

			if (driver.findElements(By.xpath("//td[text()='India' or text()='Russia']")).size() > 0) {
				// if (driver.findElements(By.xpath("//td[text()='India']")).size() > 0) {//for selectMultiOPtions
				selectMultipleCountry("India", "Russia");
				selectMultiOPtions("India");
			}
			// Pagination logic : click on next
			WebElement next = driver.findElement(By.linkText("Next"));
			if (next.getAttribute("class").contains("disabled")) {
				System.out.println("pagination is over...element is not found...");
				break;
			}
			next.click();
			Thread.sleep(1000);

		}
	}

	public static void selectMultiOPtions(String countryName) {
		List<WebElement> eles = driver.findElements(
				By.xpath("//td[text()='" + countryName + "']//preceding-sibling::td/input[@type='checkbox']"));
		for (WebElement e : eles) {
			e.click();
		}
	}

	public static void selectMultipleCountry(String countryName, String Name) {
		List<WebElement> eles = driver.findElements(
				By.xpath("//td[text()='" + countryName + "']//preceding-sibling::td/input[@type='checkbox']"));
		List<WebElement> ele = driver
				.findElements(By.xpath("//td[text()='" + Name + "']//preceding-sibling::td/input[@type='checkbox']"));
		for (WebElement e : eles) {
			e.click();
		}
		for (WebElement e : ele) {
			e.click();
		}
	}
}
