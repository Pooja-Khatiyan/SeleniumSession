package webtablehandlestaticdynamic;
//important interview question
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//generic method for specific page
public class GenericMethodWebTableHandling {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(2000);
		selectUser("Joe.Root");
		selectUser("John.Smith");
		List<String> joeDetails = getUserInfo("Joe.Root");
		System.out.println(joeDetails);

	}

	public static void selectUser(String userName) {
		// dynamic xpath
		driver.findElement(
				By.xpath("//a[text()='" + userName + "']/parent::td/preceding-sibling::td/input[@type='checkbox']"))
				.click();
	}

	public static List<String> getUserInfo(String userName) {
		List<WebElement> colEles = driver
				.findElements(By.xpath("//a[text()='" + userName + "']/parent::td/following-sibling::td"));
		List<String> colValueList = new ArrayList<String>();
		for (WebElement e : colEles) {
			String text = e.getText();
			colValueList.add(text);
		}
		return colValueList;
	}

}
