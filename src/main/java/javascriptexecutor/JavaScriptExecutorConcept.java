package javascriptexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
JavascriptExecutor js = (JavascriptExecutor)driver;
String title=js.executeScript("return document.title").toString();
	System.out.println(title);
	System.out.println("*********************");
//accessing javascriptutil	
	JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
	String Title =jsUtil.getTitleByJS();                                                                                                                                                                                  
	System.out.println(Title);
	String URL=jsUtil.getURLByJS().toString();
	System.out.println(URL);
	Thread.sleep(1000);
	jsUtil.generateJSAlert("hello java");//this alert is freezing the entire page
	Thread.sleep(1000);
	jsUtil.generateJConfirm("are you robot");
	Thread.sleep(1000);
	jsUtil.generateJSPrompt("enter your name", "Pooja");
	
	driver.get("https://classic.freecrm.com/index.html");
String pageText=jsUtil.getPageInnerTextWithJS();//important &good for
//context testing
	System.out.println(pageText);
	if(pageText.contains("Customer Support")) {
		System.out.println("Test---Pass");
	}
	
	//for scrolling we use window object: for vertical scrolling
	jsUtil.scrollPageDown();
	jsUtil.scrollPageUp();
		
	
	
	
	
	
	
	}

	
	
	
	
	
	
	
}
