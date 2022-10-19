package testcases.suite_two;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import data_providers.TestDataProviders;

public class CreateUser {

//	@Test(priority = 1, dataProvider = "getData")
//	public void createUser(int id, String fName, String lName, String email, long phone) {
//		System.out.println("The thread ID for softAssert "+ Thread.currentThread().getId());
//	}
	
	@Test(priority = 2, dataProviderClass = TestDataProviders.class, dataProvider = "getData")
	public void createUserUsingProviderClass(int id, String fName, String lName, String email, long phone) {
		System.out.println("The thread ID for createUserUsingProviderClass "+ Thread.currentThread().getId());
	}


	@DataProvider
	public Object[][] getData() {
		Object[][] obj = new Object[3][5];

		obj[0][0] = 1;
		obj[0][1] = "Ravi";
		obj[0][2] = "Khokhar";
		obj[0][3] = "rk@gmail.com";
		obj[0][4] = 9876543210l;

		obj[1][0] = 2;
		obj[1][1] = "Nikunj";
		obj[1][2] = "Radadiya";
		obj[1][3] = "nr@gmail.com";
		obj[1][4] = 9886343222l;

		obj[2][0] = 3;
		obj[2][1] = "Jeenal";
		obj[2][2] = "Radadiya";
		obj[2][3] = "nr@gmail.com";
		obj[2][4] = 7776543278l;
		return obj;
	}

}
