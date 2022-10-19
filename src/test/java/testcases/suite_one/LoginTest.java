package testcases.suite_one;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest {

	private String userName;
	private String password;

	@BeforeTest
	public void init() {
		userName = "ravi23";
		password = "ravi@123";
	}

	@AfterTest
	public void complete() {
		userName = null;
		password = null;
	}

	// @Test
	public void validateLogin() {
		System.out.println("The thread ID for validateLogin "+ Thread.currentThread().getId());
		String expectedUserName = "ravi23";
		String expectedPassword = "ravi@123";

		// check username
		// Assert.assertEquals(userName, expectedUserName);
		// check password
		// Assert.assertEquals(password, expectedPassword);

		Assert.assertTrue(userName.equals(expectedUserName), "Incorrect UserName: " + userName);
		Assert.assertTrue(password.equals(expectedPassword), "Incorrect Password: " + password);
	}

	@Test
	public void softAssert() {
		System.out.println("The thread ID for softAssert "+ Thread.currentThread().getId());
		String expectedUserName = "ravi23";
		String expectedPassword = "ravi@123";
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(userName, expectedUserName);
		softAssert.assertEquals(password, expectedPassword);
		softAssert.assertTrue(5 > 3, "Error:: Number is larger: ");
		softAssert.assertAll();
	}
}
