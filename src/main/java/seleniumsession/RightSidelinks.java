package seleniumsession;

//import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RightSidelinks{
	//by relative xpath =//a[contains(@class,'list-group-item')]
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	//By rightSideField = By.className("list-group-item");

		List<WebElement> linkList=driver.findElements(By.xpath("//a[@class='list-group-item']"));
		System.out.println(linkList.size());
		for (WebElement e : linkList ) {
			String text = e.getText();
			System.out.println(text);
		}

	}	
	}


