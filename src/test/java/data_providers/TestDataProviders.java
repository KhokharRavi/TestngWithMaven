package data_providers;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class TestDataProviders {

	@DataProvider
	public static Object[][] getData(Method method) {
		System.out.println(method.getName());
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
