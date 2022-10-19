package testcases.suite_one;

import org.testng.ITestContext;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class SearchAndBuyPhone {

	boolean isSkip = false;
	@Test(priority = 1)
	public void searchPhone(ITestContext context) {
		System.out.println("The thread ID for searchPhone "+ Thread.currentThread().getId());
		if(isSkip) {
			throw new SkipException("Skipping search phone test");
		}
		System.out.println("Search phone");
		context.setAttribute("name", "Apple");
	}

	@Test(priority = 2, dependsOnMethods = {"searchPhone"})
	public void selectPhone(ITestContext context) {
		System.out.println("The thread ID for selectPhone "+ Thread.currentThread().getId());
		String name = (String) context.getAttribute("name");
		System.out.println("Select phone: "+name);
		context.setAttribute("model", "iPhone 13");
	}

	@Test(priority = 3, dependsOnMethods = {"searchPhone", "selectPhone"})
	public void buyPhone(ITestContext context) {
		System.out.println("The thread ID for buyPhone "+ Thread.currentThread().getId());
		String name = (String) context.getAttribute("name");
		String model = (String) context.getAttribute("model");
		System.out.println("Buy phone: "+name +" "+model);
	}

}
