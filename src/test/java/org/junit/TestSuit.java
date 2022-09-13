package org.junit;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestSuit {
	public static void main(String[] args) {
		Result runClasses = JUnitCore.runClasses(AdactinTestRunner.class);
		List<Failure> failures = runClasses.getFailures();
		for (Failure f : failures) {
			String string = f.toString();
			System.out.println(string);
		}

	}
}
