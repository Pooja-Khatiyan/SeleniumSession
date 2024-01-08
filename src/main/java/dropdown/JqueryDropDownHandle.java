package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryDropDownHandle {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/selectmenu/");
		driver.switchTo().frame(0);

//		driver.findElement(By.cssSelector("span#speed-button")).click();
//		Thread.sleep(2000);
//		List<WebElement> optionList = driver.findElements(By.cssSelector("ul#speed-menu li"));
//		System.out.println(optionList.size());
//		for (WebElement e : optionList) {
//			String text = e.getText();
//			System.out.println(text);
//			if (text.equals("Fast")) {
//				e.click();
//				break;
//			}
//		}

		System.out.println("****************");
//		driver.findElement(By.cssSelector("span#files-button")).click();
//		Thread.sleep(2000);
//		List<WebElement>fileOptions=driver.findElements(By.cssSelector("ul#files-menu li"));
//Thread.sleep(1500);
//System.out.println(fileOptions.size());
//for(WebElement e : fileOptions) {
//	String text =e.getText();
//	System.out.println(text);
//	if(text.equals("Some unknown file")) {
//		e.click();
//		break;
//	}
//}

		System.out.println("********************");

//		driver.findElement(By.cssSelector("span#number-button")).click();
//		Thread.sleep(2000);
//		List<WebElement> numOptions = driver.findElements(By.cssSelector("ul#number-menu li"));
//		Thread.sleep(1500);
//		System.out.println(numOptions.size());
//		for (WebElement e : numOptions) {
//			String text = e.getText();
//			System.out.println(text);
//			if (text.equals("10")) {
//				e.click();
//				break;
//			}
//		}

		System.out.println("********************");

		driver.findElement(By.cssSelector("span#salutation-button")).click();
		Thread.sleep(2000);
		List<WebElement> titleOptions = driver.findElements(By.cssSelector("ul#salutation-menu li"));
		Thread.sleep(1500);
		System.out.println(titleOptions.size());
		for (WebElement e : titleOptions) {
			String text = e.getText();
			System.out.println(text);
			if (text.equals("Mr.")) {
				e.click();
				break;
			}
		}

	}

}
