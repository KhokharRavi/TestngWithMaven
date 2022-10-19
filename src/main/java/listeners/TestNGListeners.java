package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener {
	
	
	public void onTestStart(ITestResult result) {
		//System.out.println("onTestStart: "+result.getName());
	}
	
	
	public void onTestFailure(ITestResult result) {
		System.out.println("--->>> onTestFailure: <<<---");
		System.out.println("* "+result.getName());
		System.out.println("* "+result.getStatus());
		System.out.println("* "+result.getThrowable().getMessage());
		System.out.println("----------------------------");
	}
	
	
	public void onTestSkipped(ITestResult result) {
		//System.out.println("onTestSkipped: "+result.getName());
	}
	
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccess: "+result.getName());
	}
}
