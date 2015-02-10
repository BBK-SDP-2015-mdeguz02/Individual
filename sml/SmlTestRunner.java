package sml;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * SmlTestRunner class
 * Automates testing of SmlTest classes
 */

public class SmlTestRunner {
	public static void main(String[] args) {
		
		Result result = JUnitCore.runClasses(SmlTest.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println("Passed all tests?: " + result.wasSuccessful());
	}
}
