package pgs.asta.tests.cucumberTests.listener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import pgs.asta.utilities.Log;

public class StepsListener implements ITestListener{
    public void onTestStart(ITestResult iTestResult) {
        Log.startTestCase(iTestResult.getInstanceName());
    }

    public void onTestSuccess(ITestResult iTestResult) {
        Log.endTestCaseSuccess();
    }

    public void onTestFailure(ITestResult iTestResult) {
        /*screenshot(iTestResult.getInstanceName());*/
        Log.endTestCaseFailure();
    }

    public void onTestSkipped(ITestResult iTestResult) {
        Log.endTestCaseSkipped();
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
    }

    public void onStart(ITestContext iTestContext) {
    }

    public void onFinish(ITestContext iTestContext) {
    }
}