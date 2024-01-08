package webtablehandlestaticdynamic;

import org.openqa.selenium.By;
//also called web table traversing
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//tbody= table body; tr= table row; th= table header; td=table data
public class StaticWebTableConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		// WEB TABLE TRAVERSING

		// table[@id='customers']/tbody/tr[2]/td[1]
		// table[@id='customers']/tbody/tr[3]/td[1]
		// table[@id='customers']/tbody/tr[4]/td[1]
		// table[@id='customers']/tbody/tr[5]/td[1]
		// table[@id='customers']/tbody/tr[6]/td[1]
		// table[@id='customers']/tbody/tr[7]/td[1]
		int rowCount = driver.findElements(By.xpath("//table[@id='customers']//tr")).size();

		String beforeXpath = "//table[@id='customers']/tbody/tr[";
		String afterXpath = "]/td[1]";
		for (int row = 2; row <= rowCount; row++) {
			String actXpath = beforeXpath + row + afterXpath;
			//System.out.println(actXpath);=just for reference
			String compName = driver.findElement(By.xpath(actXpath)).getText();
			System.out.println(compName);
	
		
		}

	}

}
