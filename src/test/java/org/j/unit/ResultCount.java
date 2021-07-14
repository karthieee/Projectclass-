package org.j.unit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runners.Suite;

public class ResultCount {

	public static void main(String[] args) {

		Result runClasses = JUnitCore.runClasses(SuiteLevelExecution.class);

		int runCount = runClasses.getRunCount();
		System.out.println("Total Method Executed:" + runCount);

		int failureCount = runClasses.getFailureCount();
		System.out.println("Total failure count:" + failureCount);

		int ignoreCount = runClasses.getIgnoreCount();
		System.out.println("Total ignore count:" + ignoreCount);

	}

}
