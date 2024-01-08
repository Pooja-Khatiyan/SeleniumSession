package fewconceptsremaining;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeightWidthElement {
//can be use for UI validation
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com");
		WebElement element = driver.findElement(By.xpath("//input[@value='Login']"));
		Rectangle rect = element.getRect();
		System.out.println(rect.getHeight());
		System.out.println(rect.getWidth());
		// give coordinates of element on the page or it's dimension on the page
		System.out.println(rect.getX());
		System.out.println(rect.getY());
//		element.getRect().getDimension().getHeight();this way also we can access the height and width
//		element.getRect().getDimension().getWidth();
		// this method can be use to get point from left corner or x/y coordinate from left corner
		int x = element.getLocation().x;
		int y = element.getLocation().y;

	}

}
