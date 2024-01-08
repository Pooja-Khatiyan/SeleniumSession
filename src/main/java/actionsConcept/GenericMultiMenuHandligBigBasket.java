package actionsConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GenericMultiMenuHandligBigBasket {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		By parentShopByMenu = By.xpath("(//span[text()='Shop by'])[2]");
		By beveragesSecondMenu = By.linkText("Beverages");
	    By teaThirdMenu = By.linkText("Tea");
		By greenTeaFourthMenu = By.linkText("Green Tea");
		By fruitsSecMenu= By.linkText("Fruits & Vegetables");
		By vegThirdMenu=By.linkText("Fresh Vegetables");
		By leafyFouthMenu =By.linkText("Leafy Vegetables");
		//fourLevelMenuHandle(parentShopByMenu, fruitsSecMenu, vegThirdMenu, leafyFouthMenu);
		multiLevelHandle(parentShopByMenu, fruitsSecMenu, vegThirdMenu, leafyFouthMenu);	
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
public static void multiLevelHandle	(By parentMenuLocator, By firstChildMenuLocator, By secondChildLocator,
By thirdChildMenuLocator) {
	driver.findElement(parentMenuLocator).click();
	Actions act = new Actions(driver);
	
	     
}

	public static void fourLevelMenuHandle(By parentMenuLocator, By firstChildMenuLocator, By secondChildLocator,
			By thirdChildMenuLocator) throws InterruptedException {
//4 menu item	
		driver.findElement(parentMenuLocator).click();
		Actions act = new Actions(driver);
		Thread.sleep(1000);
		act.moveToElement(driver.findElement(firstChildMenuLocator)).build().perform();
		Thread.sleep(1000);
		act.moveToElement(driver.findElement(secondChildLocator)).build().perform();
		Thread.sleep(1000);
		driver.findElement(thirdChildMenuLocator).click();
	}
}