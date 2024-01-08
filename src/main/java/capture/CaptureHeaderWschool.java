package capture;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureHeaderWschool {
	static WebDriver driver;

	public static void main(String[] args) {
		// td[text()='Maria Anders']/parent::tr/preceding-sibling::tr/th)[1]
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		String text = driver
				.findElement(By.xpath("(//td[text()='Maria Anders']/parent::tr/preceding-sibling::tr/th)[1]"))
				.getText();

		System.out.println(text);

	}

}
