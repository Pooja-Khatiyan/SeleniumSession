package windowhandle;
import java.util.ArrayList;
//Famous interview question
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowMutlipleHandler {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");// parent window
		Thread.sleep(2000);
		String parentWindowId = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
//List<WebElement>listEle = driver.findElements(By.xpath("//a[@target='_blank']"));
//for(WebElement e : listEle) {//through this 5 links get opened
//	e.click();
//}
/**
 * getWindowHandles always return set<string>: becz set are unique non order based,
 * uniqueness and non order by default it is defined
 */
		Set<String> handles = driver.getWindowHandles();//it capture 5 windows id including parent
//set to List conversion
//		List<String>handleList = new ArrayList<String>(handles);
//		for(String e :handleList ) {}
		
		Iterator<String> it = handles.iterator();
		while (it.hasNext()) {
			String windowId = it.next();
			driver.switchTo().window(windowId);
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			Thread.sleep(1200);
			if (!windowId.equals(parentWindowId)) {//i.e we are comparing here
				driver.close();
			}		
	}
driver.switchTo().window(parentWindowId);
System.out.println("parent window url: " + driver.getCurrentUrl());
	}

}
