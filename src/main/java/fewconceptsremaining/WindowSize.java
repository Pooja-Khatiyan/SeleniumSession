package fewconceptsremaining;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSize {
//responsive testing with window size
	public static void main(String[] args) {
		// added in selenium 4
		WebDriver driver = new ChromeDriver();

		driver.manage().window().setSize(new Dimension(1000, 1800));

//	Dimension dim = new Dimension(800 , 500);
//	driver.manage().window().setSize(dim);
		driver.get("https://www.amazon.com");
	}

}
