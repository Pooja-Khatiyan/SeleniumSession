package webtablehandlestaticdynamic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePaginationSingleSelect {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(4000);

		// Single Selection : use cases
		// 1>country present on 1st page
		// 2>country present on any page
		// 3>country is not there
		while (true) {
			//if element is on 1st page itself
//			if (driver.findElements(By.xpath("//td[text()='Hong Kong']")).size() > 0) {
//				selectCountry("Hong Kong");
			if (driver.findElements(By.xpath("//td[text()='Pooja']")).size() > 0) {
				selectCountry("Pooja");// give infinite loop
                break;
			} else {
				// Pagination
				WebElement next = driver.findElement(By.linkText("Next"));
				if (next.getAttribute("class").contains("disabled")) {
					System.out.println("pagination is over...element is not found...");
					break;
				}
				next.click();
				Thread.sleep(1000);
			}
		}
	}

	public static void selectCountry(String countryName) {
		driver.findElement(
				By.xpath("//td[text()='" + countryName + "']//preceding-sibling::td/input[@type='checkbox']")).click();
	}
}
