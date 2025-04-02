package com.StoreAPI.resource;

import org.apache.logging.log4j.Logger;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.StoreAPI.test.Test;

public class Listner implements ITestListener
{
	public static Logger logger=Loggerss.getLoggers(Test.class); 

	    @Override
	    public void onTestStart(ITestResult result) {
	        logger.info("Test Started: {}", result.getName());
	    }

	    @Override
	    public void onTestSuccess(ITestResult result) {
	        logger.info("Test Passed: {}", result.getName());
	    }

	    @Override
	    public void onTestFailure(ITestResult result) {
	        logger.error("Test Failed: {}", result.getName());
	        logger.error("Exception: ", result.getThrowable());
	    }
	}


