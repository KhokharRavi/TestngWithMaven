package testcases.suite_two;

import org.testng.Assert;
import org.testng.annotations.Test;

import data_providers.TestDataProviders;

public class DeleteUser {
	
	@Test(dataProviderClass = TestDataProviders.class, dataProvider = "getData")
	public void deleteUser(int id, String fName, String lName, String email, long phone) {
		System.out.println("The thread ID for deleteUser "+ Thread.currentThread().getId());
		Assert.assertTrue(!fName.isEmpty(), "Error! First name is empty");
		Assert.assertTrue(!lName.isEmpty(), "Error! Last name is empty");
		Assert.assertTrue(!email.isEmpty(), "Error! Email is empty");
	}
}
