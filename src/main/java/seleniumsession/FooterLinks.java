 package seleniumsession;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterLinks {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");
		By footerLinks = By.xpath("//footer//a");
		List<WebElement> footerLinksList = driver.findElements(footerLinks);
		System.out.println(footerLinksList.size());
		for (WebElement e : footerLinksList) {
			String text = e.getText();
			System.out.println(text);
		}

		ElementUtil eutil = new ElementUtil(driver);

		int count = eutil.getElementsCount(footerLinks);
		System.out.println(count);
		List<String> actFooterTextList = eutil.getElementsTextList(footerLinks);
		List<String> expectedFooters = Arrays.asList("About Us", "Returns", "Specials", "Newsletter");

		if (actFooterTextList.containsAll(expectedFooters)) {
			System.out.println("imp footer links--PASS...");
		} else {
			System.out.println("FAIL");
		}

	}

}
