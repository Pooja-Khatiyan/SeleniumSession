package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDownHandling {
static WebDriver driver; 
	public static void main(String[] args) {
	driver=new ChromeDriver();
		//here we can select multiple country : select based dropdown
		driver.get("https://html.com/attributes/select-multiple/");
//in select class we have to supply WebElement:we can do as did below or can maintain a By locator and supply
		Select select = new Select(driver.findElement(By.xpath("//select")));
		if(select.isMultiple()) {//Whether this select element support selecting multiple options at the same time?
//			//This is done by checking the value of the "multiple" attribute.
//			System.out.println("yes,it is multi select drop down");
		select.selectByVisibleText("Chilean flamingo");	
		select.selectByVisibleText("Lesser flamingo");	
		select.selectByVisibleText("Greater flamingo");	
		}
		int selectedCount=select.getAllSelectedOptions().size();//to check how many elements are selected
		System.out.println(selectedCount);
		//for deselecting
		select.deselectByIndex(3);
		select.deselectByVisibleText("Lesser flamingo");
		select.selectByVisibleText("Lesser flamingo");
		select.deselectAll();
	
	}
	

}
