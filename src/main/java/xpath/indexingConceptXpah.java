package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class indexingConceptXpah {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
//driver.findElement(By.xpath("(//a[@class='nav_a'])[last()-10]")).click();
		driver.findElement(By.xpath("(//a[@class='nav_a'])[last()]")).click();
	}

}
