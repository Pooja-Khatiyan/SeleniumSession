package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * IMPORTANT INTERVIEW QUESTION
 */
public class XpathOddEvenConcept {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");
//for odd
		int list = driver.findElements(By.xpath("(//select[@id='Form_getForm_Country']/option)[position()mod 2 =1]"))
				.size();
		System.out.println(list);
//for even
		int elelist = driver.findElements(By.xpath("(//select[@id='Form_getForm_Country']/option)[position()mod 2 =0]"))
				.size();
		System.out.println(elelist);
	}

}
