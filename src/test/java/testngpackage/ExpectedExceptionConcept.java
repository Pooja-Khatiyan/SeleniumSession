package testngpackage;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
//here we can write Exception/Throwable also as they are super class
	String name;
	@Test(expectedExceptions = ArithmeticException.class)
	public void loginTest() {
		System.out.println("login step");
		int i = 9/0;
		System.out.println("bye");
	}
	//we can use this trick while giving the review to the manager or client
@Test(expectedExceptions = {ArithmeticException.class, NullPointerException.class})
public void searchTest() {
	System.out.println("macbook");
	ExpectedExceptionConcept obj = null;
	System.out.println(obj.name);
	System.out.println("bye");
}




}
