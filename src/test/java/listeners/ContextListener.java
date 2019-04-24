package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ContextListener implements ITestListener{

	public void onTestStart(ITestResult result) {

 System.out.println("starts test......." + result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Passed test......." + result.getName());
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Failed test......." + result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Skipped test......." + result.getName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("starts test......." + result.getName());
		
	}

	public void onStart(ITestContext context) {
		System.out.println("starts test execution......." + context.getName());
		
	}

	public void onFinish(ITestContext context) {
		
		System.out.println("Finish test execution......." + context.getName());
		
	}

	
}
