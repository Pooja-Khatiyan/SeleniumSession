package totalelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {
//get the total links on the page
//get the text of each link
	public static void main(String[] args) {
//USING TAGNAME
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		System.out.println("total no of links: " + linksList.size());

		// to get the text of each link
//for(int i = 0 ; i<linksList.size() ; i++) {
//	String text = linksList.get(i).getText();
//	System.out.println(text);
//}

//to ignore the blank text links
//for(int i=0; i<linksList.size();i++) {
//	String text = linksList.get(i).getText();
//if(text.length()!=0) {
//	System.out.println(i +" : "+text);
//}
//}

//with advance loop 
//for (WebElement e : linksList) {
//	String text = e.getText();
//	if(text.length()!=0) {
//		System.out.println(text);
//	}
//}

//to capture href value for each link
		for (WebElement e : linksList) {
			String text = e.getText();
			if (text.length() != 0) {
				String hrefVal = e.getAttribute("href");
				System.out.println(text + " : " + hrefVal);
			}
		}

//the process of capturing the href value/or any other values from web element is called WEB SCRAPPING
	}

}
