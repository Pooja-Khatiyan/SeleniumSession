package actionsConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement rightClickEle = driver.findElement(By.xpath("//span[text()='right click me']"));
//driver.findElement(By.cssSelector("span.context-menu-one"))	;
		Actions act = new Actions(driver);
		act.contextClick(rightClickEle).perform();
		List<WebElement> lists = driver.findElements(By.cssSelector("ul>li.context-menu-icon "));
//ul>li.context-menu-icon>span :exactly pointing to each and every span

//i use this class becz i want to exclude "context-menu-separator" class
//here span is having the text but with li we can capture the text
//if we apply getText on parent(li) though this we are able to capture child (span) text	
		System.out.println(lists.size());
		for (WebElement e : lists) {
			String text = e.getText();
			System.out.println(text);
			if (text.equals("Delete")) {
				e.click();
				break;
			}
		}
	}

}
