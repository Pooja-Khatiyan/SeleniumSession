package selenium4feature;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class W3SchoolBelowEle {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	Thread.sleep(3009);
	
WebElement baseEle=	driver.findElement(By.xpath("(//tbody/tr/th)[1]"));
String text=driver.findElement(RelativeLocator.with(By.tagName("td")).below(baseEle)).getText();
System.out.println(text);
List<WebElement>eleList=driver.findElements(RelativeLocator.with(By.tagName("td")).below(baseEle));
System.out.println(eleList.size());
for(WebElement e : eleList) {
	String list=e.getText();
	System.out.println(list);
if(list.equals("Magazzini Alimentari Riuniti")) {
	break;
}
	}
	}

}
