package windowhandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericMethodForAssignment {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		By t = By.xpath("//a[contains(@href,'twitter')]");
		By f = By.xpath("//a[contains(@href,'facebook')]");
		By l = By.xpath("//a[contains(@href,'linkedin')]");
		By y = By.xpath("//a[contains(@href,'youtube')]");
		getNewTab(t);
		getNewTab(f);
		getNewTab(l);
		getNewTab(y);
	}

	public static void doClick(By locator) {
		driver.findElement(locator).click();
	}

	public static void getNewTab(By locator) {
		doClick(locator);
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentId = it.next();
		String child = it.next();
		driver.switchTo().window(child);
		System.out.println("child url: " + driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(parentId);
	}
}
