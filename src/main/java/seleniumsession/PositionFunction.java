package seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PositionFunction {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//driver.findElement(By.xpath("(//a[@class='list-group-item'])[position()=4]")).click();
		driver.findElement(By.xpath("(//a[@class='list-group-item'])[4]")).click();
	}

}
