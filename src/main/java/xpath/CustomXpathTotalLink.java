package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpathTotalLink {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		int linksCount = driver.findElements(By.xpath("//a")).size();
		System.out.println("Total Number of links on Registeration Page:" + " = " + linksCount);
	}

}
