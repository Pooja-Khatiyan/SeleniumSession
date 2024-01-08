package testngpackage;
import org.testng.annotations.Test;

public class InvocationCountConcept {
//invocation means calling the method
//by default value of invocation count = 1,execute one time
	
@Test(invocationCount = 10)
public void searchproductTest() {
	System.out.println("search product");
}
//we can use it like some feature is there which will enable when it run 10 times 	
	
	
	
}
