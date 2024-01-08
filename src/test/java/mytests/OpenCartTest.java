package mytests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCartTest extends BaseTest {
//when we run this testng automatically call parent class method due to annotation BeforeTest
//then run the functions a/c to priority then again call AfterTest
	@Test(priority = 1)
	public void isOpenCartLogoIsVisibleTest() {
		boolean flag = driver.findElement(By.xpath("//img[contains(@alt,'naveen')]")).isDisplayed();
		// img[@title='naveenopencart']
		Assert.assertEquals(flag, true);
	}

	@Test(priority = 3)
	public void openCartTitleTest() {
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle, "Your Store");
	}

	@Test(priority = 2)
	public void openCartURLTest() {
		String actualUrl = driver.getCurrentUrl();
		System.out.println(actualUrl);
		Assert.assertTrue(actualUrl.contains("opencart"));
		
	}

}
