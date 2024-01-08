package webtablehandlestaticdynamic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountryListWschoolStaticTable {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		int rowCount = driver.findElements(By.xpath("//table[@id=\"customers\"]//tr")).size();
		String beforeXpath = "//table[@id=\"customers\"]/tbody/tr[";
		String afterXpath = "]/td[3]";
		for (int row = 2; row <= rowCount; row++) {
			String actXpath = beforeXpath + row + afterXpath;
			String countryName = driver.findElement(By.xpath(actXpath)).getText();
			System.out.println(countryName);
		}
	}
}
