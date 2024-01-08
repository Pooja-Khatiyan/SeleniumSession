package actionsConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GenericMoveToElement {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");

		By parentMenu = By.cssSelector("a.menulink");
		By childMenu = By.linkText("COURSES");
		parentChildMenu(parentMenu, childMenu);
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void parentChildMenu(By parentMenuLocator, By ChildMenuLocator) {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(parentMenuLocator)).perform();
		driver.findElement(ChildMenuLocator).click();
	}

}
