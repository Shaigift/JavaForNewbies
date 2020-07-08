package com.in28minutes.exceptionhandling;

public class CheckedExceptionRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try {
//			someOtherMethod();
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.getStackTrace();
//		}
		someOtherMethod();
	}
	
	private static void someOtherMethod2() throws RuntimeException {
		// TODO Auto-generated method stu
	}
	

	private static void someOtherMethod() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
	}

}
