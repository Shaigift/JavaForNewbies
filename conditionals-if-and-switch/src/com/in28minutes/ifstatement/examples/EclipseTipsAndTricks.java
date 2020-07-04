package com.in28minutes.ifstatement.examples;

import java.math.BigDecimal;

class Test implements Comparable<String> {

	@Override
	public int compareTo(String arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}



public class EclipseTipsAndTricks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		DummyForTest dt = new DummyForTest();
		((DummyForTest) dt).doSomething();
		
		BigDecimal bd = new BigDecimal(25);
		Thread.sleep(1000 * 45 * 456);
	}
	
	private static int returnSomething() {
		return 1000 * 45 *456;
	}
}
