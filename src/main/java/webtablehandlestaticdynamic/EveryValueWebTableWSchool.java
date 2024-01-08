package webtablehandlestaticdynamic;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EveryValueWebTableWSchool {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		List<WebElement> eleList = driver
				.findElements(By.xpath("//th[text()='Company']/parent::tr/following-sibling::tr/td"));
		List<String> list = new ArrayList<String>();
		for (WebElement e : eleList) {
			String text = e.getText();
			list.add(text);
		}
		System.out.println(list);

	}

}
