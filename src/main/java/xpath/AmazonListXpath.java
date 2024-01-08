package xpath;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonListXpath {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.get("https://www.amazon.com/");
List<WebElement>list=driver.findElements(By.xpath("//div[text()='Get to Know Us']/following-sibling::ul/child::li"));
//this can also be used //div[text()='Make Money with Us']/parent::div//a
//in the place of child we can also use //a to select all the below 6 links
System.out.println(list.size());
	List<String> eleList = new ArrayList<String>();
for(WebElement e : list) {
	String text = e.getText();
	eleList.add(text)	;
	}
System.out.println(eleList);
	}

}
