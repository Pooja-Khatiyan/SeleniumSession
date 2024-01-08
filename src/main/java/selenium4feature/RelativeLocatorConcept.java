package selenium4feature;

//import org.openqa.selenium.support.locators.RelativeLocator;
import static org.openqa.selenium.support.locators.RelativeLocator.with;//static import

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//same concept is there in Cypress & PlayWright
public class RelativeLocatorConcept {
//relative locator means near by locator: within 50 pixels we can find other near by element predefine
	// in selenium

//	                               e3(above)
//	                                    |
//	            e1(left)<--------ele(main)------->e2(right)
//	                                    |
//                                  e4(below)	
//	       e5(near):50 pixel

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
	//	driver.manage().window().fullscreen();
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.linkText("Squamish, Canada"));

		/**
		 * with by method is static in nature so we have to call it by it's class name
		 * HOW TO READ BELOW CODE driver please find the element using relative locator
		 * with tag name p which right of the base element USE OF Relative Locator Used
		 * for finding elements by their location on a page, rather than their position
		 * on the DOM.
		 */
// right of base ele
		String rightIndex = driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
		System.out.println(rightIndex);
// left of base ele
		String leftRank = driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
		System.out.println(leftRank);
//above of base ele
		String aboveCity = driver.findElement(with(By.tagName("a")).above(ele)).getText();
		System.out.println(aboveCity);
//below of base ele
		String belowCity = driver.findElement(with(By.tagName("a")).below(ele)).getText();
		System.out.println(belowCity);
/** near method: within the periphery of 50 pixels it will capture the ele */
		Thread.sleep(3000);

	String nearEle=driver.findElement(with(By.linkText("a")).near(ele)).getText();
	System.out.println(nearEle);

//List<WebElement> elementList=driver.findElements(By.xpath("//div[@id='most_pollutedCitiesRank']/p"))	;
//	System.out.println(elementList.size());
//for(WebElement e : elementList) {
//		String text =e.getText();
//		System.out.println(text);
//	}
	
	
	
	}

}
