package seleniumsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class NavigationConcept {

	public static void main(String[] args) throws MalformedURLException {
		WebDriver driver = new ChromeDriver();
//		driver.get("https://naveenautomationlabs.com/opencart/");
//		System.out.println(driver.getTitle());
//		driver.navigate().to("https://www.google.com/");
//		System.out.println(driver.getTitle());
//		driver.navigate().back();
//		System.out.println(driver.getTitle());
//		driver.navigate().forward();
//		System.out.println(driver.getTitle());
//		driver.navigate().back();
//		System.out.println(driver.getTitle());
		// driver.navigate().to("https://naveenautomationlabs.com/opencart/");
		driver.navigate().to(new URL("https://naveenautomationlabs.com/opencart/"));
		driver.navigate().refresh();// to refresh the page
//with navigate we have 4 methods-- back(),forward(),refresh(),to()

	}

}
