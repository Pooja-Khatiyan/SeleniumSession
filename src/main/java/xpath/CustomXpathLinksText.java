package xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpathLinksText {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		List<WebElement> linksList = driver.findElements(By.className("list-group-item"));// by classname
		// List<WebElement> linksList =
		// driver.findElements(By.xpath("//a[@class='list-group-item']"));//by Xpath
		System.out.println(linksList.size());
		for (WebElement e : linksList) {
			String text = e.getText();
			System.out.println(text);
		}

		System.out.println("*********************************************");
//it will capture the text of 1st header always			
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		String header = driver.findElement(By.tagName("h2")).getText();
		System.out.println(header);

//how to capture the text of the 2nd header : for that we will use text function[text()] in the xpath
		System.out.println("*********************************************");
		// it will capture the text of 1st header always
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		String texts = driver.findElement(By.xpath("//a[text()='Recurring payments']")).getText();
		System.out.println(texts);

//how many forgotten password links are there on the page
		System.out.println("*********************************************");
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		int linkCount = driver.findElements(By.xpath("//a[text()='Forgotten Password']")).size();
		System.out.println(linkCount);
		if (linkCount == 2) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
	}

}
