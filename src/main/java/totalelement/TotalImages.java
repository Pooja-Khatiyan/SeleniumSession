package totalelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		List<WebElement> imgList = driver.findElements(By.tagName("img"));
		System.out.println("total no of images: " + imgList.size());
		for (WebElement e : imgList) {
			String srcVal = e.getAttribute("src");
			String altVal = e.getAttribute("alt");
			System.out.println(srcVal + " : " + altVal);
		}
	}

}
