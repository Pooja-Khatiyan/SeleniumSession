package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LastLinkFresherWork {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");
String text=driver.findElement(By.xpath("((//footer//div[@class='sc-6293d692-0 eNMhGa'])[last()]//a)[last()]")).getText();
System.out.println(text);	
	}

}
