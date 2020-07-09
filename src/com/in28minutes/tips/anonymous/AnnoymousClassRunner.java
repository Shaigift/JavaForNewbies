package com.in28minutes.tips.anonymous;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;

class LengthComparator implements Comparator <String>{

	@Override
	public int compare(String str1,String str2) {
		// TODO Auto-generated method stub
		return Integer.compare(str1.length(), str2.length());
	}
	
}

public class AnnoymousClassRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> animals = new ArrayList<String>(
				List.of("Ant", "Cat", "Ball", "Elephant"));
		
		Comparator<String> lengthComparator = new Comparator<String>() {
			@Override
			public int compare(String str1, String str2) {
				return Integer.compare(str1.length(), str2.length());
			}
		};
		
		Collections.sort(animals,
				lengthComparator
		);
		System.out.println(animals);
	}

}
