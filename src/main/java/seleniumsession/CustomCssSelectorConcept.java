package seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomCssSelectorConcept {

	public static void main(String[] args)  {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.findElement(By.cssSelector("#input-firstname")).sendKeys("pooja");
//driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("pooja");
		driver.findElement(By.cssSelector("input.form-control#input-lastname")).sendKeys("khatiyan");
//driver.findElement(By.cssSelector(".form-control#input-lastname")).sendKeys("khatiyan");
		driver.findElement(By.cssSelector("input[placeholder*='E-']")).sendKeys("pooja@gmail.com");
		driver.findElement(By.cssSelector("input[name^='tele']")).sendKeys("98789669");
		driver.findElement(By.cssSelector("input[placeholder$='Confirm']")).sendKeys("admin@123");
		// driver.findElement(By.className("form-control
		// input-lg")).sendKeys("Mobiles");
		// InvalidSelectorException: Compound class names not permitted
		driver.findElement(By.cssSelector("input.form-control.input-lg")).sendKeys("Mobiles");
		
		
		
		System.out.println("**************************************************");
		
		driver.get("https://app.hubspot.com/login");
		//driver.findElement(By.cssSelector("input.form-control.private-form__control.login-email#username"))
			//	.sendKeys("pooja@gmail.com");
		driver.findElement(By.xpath("//input[@class='form-control private-form__control login-email']")).sendKeys("pooja@gmail.com");
		// driver.findElement(By.cssSelector("input[type='password']")).sendKeys("123");
		// driver.findElement(By.cssSelector("input[id='password']")).sendKeys("vihu");
//MULTIPLE ATTRIBUTE
		// driver.findElement(By.cssSelector("input[id='password'][type='password']")).sendKeys("Test@123");
		// driver.findElement(By.cssSelector("input[type='password']#password")).sendKeys("Test@123");
		driver.findElement(By.cssSelector("input#password[type='password']")).sendKeys("Test@123");
		// input[id][type]-right css but doesn't have any specific use case
	int loginEles = driver.findElements(By.cssSelector("input#username,input#password,button#loginBtn,input#remember")).size();
	System.out.println(loginEles);
	if(loginEles==4) {
		System.out.println("all the important elements are included");
	}else {
		System.out.println("FAIL");
	}

/**whenever we write wrong cssselector, xpath & write multiple classes with class locator we will get 
	*	InvalidSelectorException
	*text in css not available-css don't support text function
	*caret ^ : use for start with
	*dollar $: use for end with
	*contains*:use for contains
	*
	*
	*>:use to select all for css--for direct child element : parent >child
	*for indirect element we have to use space ex:registration page : div#content input
	*div#content input : give direct+indirect child element ;one space or more space doesn't matter
	*div#content>input : indirect child element
	*child to parent : not allowed -- backward traversing is not allowed in css selector
	*chil to ancestor : not allowed in css selector
	*preceding sibling not allowed
	*
	*
	*in css for sibling we use + 
	*caret sign ~ : give all the following sibling 
	*+ sign : give immediate following sibling
	*
	*COMMA in css
	*we can use , if we want to maintain only one locator that include more than 1 element
	*ex: input#username,input#password,button#loginBtn,input#remember
	*
	*
	*not in css: use if we want to exclude any element from the selected list of element
	*/
	driver.get("https://www.orangehrm.com/30-day-free-trial/");
	//driver.findElement(By.xpath("//select[@class='dropdown']")).click();
	//xpath: //select[@class='dropdown']/option 
	//cssSelector: select[class='dropdown']>option = for direct child
	driver.findElement(By.cssSelector("select[class='dropdown']>option:nth-of-type(3)")).click();
	
	
	
	System.out.println("***************************************************************");
	driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	driver.findElement(By.cssSelector("label[class='control-label'] +input")).sendKeys("test@gmail.com");
	
	driver.findElement(By.cssSelector("div.form-group>input:not(#input-password)")).sendKeys("vihu@gmail.com");
	//div.form-group>input:not(input[type='password'])
	
	
	
	
	}

}
