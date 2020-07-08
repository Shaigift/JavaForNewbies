package com.in28minutes.datatypes;

public class MyCharRunner {

	public static void main(String[] args) {
		MyChar myChar = new MyChar('B');
		System.out.println(myChar.isVowel());
//		myChar.isConsonant();
//		// TODO Auto-generated method stub
        System.out.println(myChar.isDigit());
		System.out.println(myChar.isAlphabet());
		
		
		System.out.println(myChar.isConsonant());
		MyChar.printLowerCaseAlphabets();
		MyChar.printUpperCaseAlphabets();

	}

}
