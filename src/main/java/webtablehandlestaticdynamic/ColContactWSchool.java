package webtablehandlestaticdynamic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ColContactWSchool {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
//th[@text()='Company']/parent::tr/following-sibling::tr/td[2d]
		int rowCount = driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
		String beforeXpath = "//table[@id='customers']/tbody/tr[";
		String afterXpath = "]/td[2]";
		for (int row = 2; row <= rowCount; row++) {
			String actXpath = beforeXpath + row + afterXpath;
			String contactName = driver.findElement(By.xpath(actXpath)).getText();
			System.out.println(contactName);
		}
	}

}
