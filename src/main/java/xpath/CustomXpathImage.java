package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpathImage {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		int imgCount = driver.findElements(By.xpath("//img")).size();
System.out.println("Total Number Of Images On The Page: "+" "+ imgCount );
	}

}
