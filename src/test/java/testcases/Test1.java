package testcases;

import com.aventstack.extentreports.ExtentTest;
import reporting.ReportManager;
import reporting.TestManager;
import utils.DriverManager;

public class Test1 {

    public static void main(String[] args) {

        ExtentTest t1 = TestManager.startTest("Test 1","To verify that Test 1 run");
        t1.pass("Test Passed");
        TestManager.endTest();

        ExtentTest t2 = TestManager.startTest("Test 2","To verify that Test 2 Fails");
        ExtentTest t3 = t2.createNode("Test node","Test node");
        t3.info("Jhakass");
        ReportManager.attachScreenshotAsLink();
        try {
            throw new Exception("Exception occurred");
        }catch (Exception e){
            ReportManager.markTestFailAndAttachException(e);
        }
        TestManager.endTest();
        DriverManager.quitDriver();


    }
}
