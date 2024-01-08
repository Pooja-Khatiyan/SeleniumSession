package webtablehandlestaticdynamic;
//RelativeLocator Concept can also be used here--selenium4feature:in 4.0 it is released
//here locator is dynamic locator that's why we are not maintaining locator in main method
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassicCRMWebTable {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();

		driver.get("https://classic.crmpro.com/");// this is dynamic web table
//below types of locators are static so we can maintain it in main method
		driver.findElement(By.name("username")).sendKeys("apiautomation");
		driver.findElement(By.name("password")).sendKeys("selenium@12345");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
//contacts a is available inside the frame
		driver.switchTo().frame("mainpanel");// important point
		Thread.sleep(1000);
//locator linktext won't work here due to mismatch of Contacts in DOM and page, to over come it we have to use 
//capital CONTACTS which is visible on page
		driver.findElement(By.linkText("CONTACTS")).click();
//we can use linktext it is use for links or anchor tag
//driver.findElement(By.xpath("//a[text()='Joe Root']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
		selectUser("Keerthana Vignesh");
		Thread.sleep(1000);
		String text = getUserCompanyName("Keerthana Vignesh");
		System.out.println(text);
		List<String> lists = userDetails("Josh Buttler");
		System.out.println(lists);
		String textno = getUserPhoneNo("Aman Srivastava");
		System.out.println(textno);
		String emailid = getEmailId("Andrew Charles");
		System.out.println(emailid);
	}

	public static List<String> userDetails(String userName) {
		List<WebElement> list = driver
				.findElements(By.xpath(" //a[text()='" + userName + "']/parent::td/following-sibling::td"));
		List<String> eleList = new ArrayList<String>();
		for (WebElement e : list) {
			String text = e.getText();
			eleList.add(text);
		}
		return eleList;
	}

	public static String getEmailId(String userName) {
		return driver.findElement(By.xpath("(//a[text()='" + userName + "']/parent::td/following-sibling::td)[5]/a"))
				.getText();
	}

	public static String getUserPhoneNo(String userName) {
		return driver
				.findElement(By.xpath(
						"(//a[text()='" + userName + "']/parent::td/following-sibling::td/span[@context='phone'])[1]"))
				.getText();
	}

	public static String getUserCompanyName(String userName) {
		return driver
				.findElement(By
						.xpath("//a[text()='" + userName + "']/parent::td/following-sibling::td/a[@context='company']"))
				.getText();
	}

	public static void selectUser(String userName) {
		// dynamic xpath
		driver.findElement(
				By.xpath("//a[text()='" + userName + "']/parent::td/preceding-sibling::td/input[@type='checkbox']"))
				.click();
	}
}