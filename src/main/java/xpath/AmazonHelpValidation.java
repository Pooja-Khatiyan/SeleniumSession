package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonHelpValidation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(1000);
String text = driver.findElement(By.xpath("((//div[@class='navFooterLinkCol navAccessibility'])[last()] //a)[last()]"))
				.getText();
System.out.println(text);
if(text.equals("Help")) {
	System.out.println("PASS");
}else {
	System.out.println("FAIL");
}

	}

}
