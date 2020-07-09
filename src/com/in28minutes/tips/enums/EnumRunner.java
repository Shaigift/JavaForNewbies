package com.in28minutes.tips.enums;

import java.util.Arrays;

enum Season {
	WINTER(1), SPRING(2), SUMMER(3), AUTUMN(4);
	
	private int value;
	
	private Season(int value) {
		this.value = value;
	}
	
	

public int getValue() {
		return value;
	}



public class EnumRunner {
	Season season;

	public void main(String[] args) {
		// TODO Auto-generated method stub
		Season season = Season.AUTUMN;
		
		Season season1 = Season.valueOf("WINTER");
		System.out.println(season1);
		System.out.println(season1.SPRING.ordinal());
		System.out.println(season1.SPRING.getValue());
		
		System.out.println(Arrays.toString(Season.values()));
		

	}

	}
}	
