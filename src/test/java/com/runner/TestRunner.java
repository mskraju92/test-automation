package com.runner;

import org.junit.Test;

import com.common.Configuration;

public class TestRunner {
	@Test
	public void testRun() {
		System.out.println(Configuration.EXECUTION_ENVIRONMENT);
		System.out.println(Configuration.SELENIUM_BROWSER);
	}

}
