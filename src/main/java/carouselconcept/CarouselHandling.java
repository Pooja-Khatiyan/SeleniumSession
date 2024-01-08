package carouselconcept;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CarouselHandling {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.noon.com/uae-en/");
		Thread.sleep(4000);
		getCarouselItems();
	}

	public static void getCarouselItems() {
		// carousel where header is available
		String xpath = "//h2[text()='Recommended for you']/../..//following-sibling::div//div[@data-qa='product-name']";
		String nextXpath = "//h2[text()='Recommended for you']/../..//following-sibling::div//div[contains(@class,'swiper-button-next')]";
		// carouse2 where img is available
		String Xpathfest = "//img[contains(@alt,'/christmas-decor-2023?f[isCarousel]=true?')]/ancestor::div[@class='componentArea-12']/following-sibling::div//div[@data-qa='product-name']";
		String nextFestXpath = "(//img[contains(@alt,'/christmas-decor-2023?f[isCarousel]=true?')]/ancestor::div[@class='componentArea-12']/following-sibling::div//div[contains(@class,'swiper-button-next')])[1]";
		List<WebElement> productList = driver.findElements(By.xpath(Xpathfest));
		System.out.println(productList.size());
//AL -these Xpath contain 50 eles ---50(store in list) -- click ---50 --click ---50-- i.e duplicate entries are allowed in AL
		List<String> productNameList = new ArrayList<String>();// it maintain the duplicate values(AL) to avoid this we will use Set
															
		Set<String> productSet = new HashSet<String>();
		while (!driver.findElement(By.xpath(nextFestXpath)).getAttribute("class").contains("swiper-button-disabled")) {
			for (WebElement e : productList) {
				String productName = e.getAttribute("title");
				productSet.add(productName);
			}
			driver.findElement(By.xpath(nextFestXpath)).click();
		}
		// print the products:
		for (String e : productSet) {
			System.out.println(e);
		}

	}

}
