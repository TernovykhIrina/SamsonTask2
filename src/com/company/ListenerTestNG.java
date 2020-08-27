package com.company;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTestNG implements ITestListener {
    @Override
    public void onTestStart(ITestResult iTestResult) {
        try {
            TestMethodInfo annotation = Main.class.getMethod("annotation").getAnnotation(TestMethodInfo.class);
            String author = annotation.author();
            String lastModified = annotation.lastModified();
            Priority priority = annotation.priority();
            System.out.println(author);
            System.out.println(lastModified);
            System.out.println(priority);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {

    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}
