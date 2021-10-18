package org.java_unit;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestResult {
	@Test
	public void result() {
		Result rs = JUnitCore.runClasses(Ques1.class, Ques2.class, Ques4.class, Ques5.class, Ques8.class);
		System.out.println("Run Count......." + rs.getRunCount());
		System.out.println();
		System.out.println("Ignore Count........." + rs.getIgnoreCount());
		System.out.println();
		System.out.println("Failure Count......." + rs.getFailureCount());
		System.out.println();
		System.out.println("Run Time........." + rs.getRunCount());
		System.out.println();

		boolean sw = rs.wasSuccessful();
		System.out.println("Suit Result......" + sw);
		System.out.println();
		System.out.println("..........Failures...........");
		List<Failure> fail = rs.getFailures();
		for (Failure x : fail) {
			System.out.println(x);
			System.out.println();
			System.out.println("Test Name...." + x.getTestHeader());
			System.out.println();
			System.out.println("Message....." + x.getMessage());
			System.out.println();
			System.out.println("Exception....." + x.getException());

		}

	}

}
