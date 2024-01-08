package webtablehandlestaticdynamic;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CosmocodeWebTable {
static WebDriver driver;
	public static void main(String[] args) {
	driver=new ChromeDriver();
	driver.get("https://cosmocode.io/automation-practice-webtable/");
	//driver.findElement(By.xpath("//table[@id='countries']//tr/following-sibling::tr/td//input[@class='hasVisited']")).click();=selecting allh
	driver.findElement(By.xpath("//tbody/tr/following-sibling::tr//td/strong[text()='Afghanistan']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
List<WebElement>list=	driver.findElements(By.xpath("//tbody/tr/following-sibling::tr//td/strong[text()='Afghanistan']/parent::td/following-sibling::td"));
List<String>eleList = new ArrayList<String>();
for(WebElement e : list) {
	String text=e.getText();
	eleList.add(text);
}
System.out.println(eleList);

	}

}
