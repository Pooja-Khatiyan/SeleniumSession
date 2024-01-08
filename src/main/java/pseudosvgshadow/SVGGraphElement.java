package pseudosvgshadow;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SVGGraphElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://petdiseasealerts.org/forecast-map");
		Thread.sleep(5000);
		// hierarchy => browser -- page -- iframe -- svg
		// we have to use special xpath with local-name(): for each child element we
		// have to use name()
		// for child local-name() is also work but general stand is above one
		String stateXpath = "//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']//*[name()='g' and @class='region']";
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));
		List<WebElement> stateList = driver.findElements(By.xpath(stateXpath));
		System.out.println(stateList.size());
		Actions act = new Actions(driver);
		for (WebElement e : stateList) {
			act.moveToElement(e).perform();
			String idValue = e.getAttribute("id");
			System.out.println(idValue);
			if (idValue.equals("florida")) {
				int size =e.getSize().getWidth();
				act.moveToElement(e, (size/2)-40, 0).click().perform();
				// contains can also be used
				// assignment : under maryland how many country are there and there text
			try {	
				e.click();
				}catch(ElementNotInteractableException e1) {
				}
	//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")))	;
				String regionXpath ="//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='florida']//*[name()='g' and @class='subregion'] //*";
		List<WebElement>regionList= driver.findElements(By.xpath(regionXpath));
		System.out.println(regionList.size());
		int count = 0;
		for(WebElement e1 : regionList) {
			act.moveToElement(e1).perform();
			String idValue1 = e1.getAttribute("name");
			System.out.println("region number " +  count+ ":"+idValue1);
			count++;
			}
		break;	
			}
		}

	}

}
