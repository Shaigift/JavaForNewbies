package com.in28minutes.arrays;

import java.math.BigDecimal;

public class StudentRunner {
	
	public static void main(String[] args) {
		
		Student student = new Student("Ranga", new int[] {67,89,18});
		
		Student student1 = new Student("Adam", new int[] {67,89,18});
	

		Student student2 = new Student("Eve ", new int[] {67,89,18});
		
		
	
		int number = student.getNumberOfMarks(); 
		System.out.println("number of marks: " + number);
		
		int sum = student.getTotalSumOfMarks();
		System.out.println("sum of marks " + sum);
		
		int maximumMark = student.getMaximumMark();
		System.out.println("sum of marks " + maximumMark);
		
		int minimumMark = student.getMinimumMark();
		System.out.println("minimum of marks " + minimumMark);
		
		BigDecimal average = student.getAverageMarks();
		System.out.println("avarage " + average);
		
		System.out.println(student);
		
		student.addNewMark(35);
		
		System.out.println(student);
		
		student.removeMarkAtIndex(1);
		
		System.out.println(student);
			

		
	}

}
