package windowhandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOpenWindowOneByOne {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");// parent window
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentId = it.next();
		String child1 = it.next();
		driver.switchTo().window(child1);
		System.out.println("child1 url: " + driver.getCurrentUrl());
		driver.close();
		Thread.sleep(2000);

		driver.switchTo().window(parentId);
		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
		Set<String> handle = driver.getWindowHandles();
		Iterator<String> its = handle.iterator();
		its.next();
		String child2 = its.next();
		driver.switchTo().window(child2);
		System.out.println("child2 url: " + driver.getCurrentUrl());
		driver.close();
		Thread.sleep(2000);

		driver.switchTo().window(parentId);
		driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
		Set<String> handled = driver.getWindowHandles();
		Iterator<String> IT = handled.iterator();
		IT.next();
		String child3 = IT.next();
		driver.switchTo().window(child3);
		System.out.println("child3 url: " + driver.getCurrentUrl());
		driver.close();
		Thread.sleep(2000);

		driver.switchTo().window(parentId);
		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
		Set<String> handl = driver.getWindowHandles();
		Iterator<String> It = handl.iterator();
		It.next();
		String child4 = It.next();
		driver.switchTo().window(child4);
		System.out.println("child4 url: " + driver.getCurrentUrl());
		driver.close();
		Thread.sleep(2000);

		driver.switchTo().window(parentId);
		System.out.println("parent window url " + driver.getCurrentUrl());
		
	}

}
