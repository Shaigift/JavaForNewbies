package com.in28minutes.tips.nestedclass;

class Person{
	
}

public class NestedClassRunner {
	
	int i;
	class InnerClass {
		public void method() {
			i = 5;
		}
		
	}
	
	static class StaticNestedClass {
	
	}

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		InnerClass innerClass = new InnerClass();
		StaticNestedClass staticNestedClass = new StaticNestedClass();
		
		NestedClassRunner nestedClassRunner = new NestedClassRunner();
		InnerClass innerClass = nestedClassRunner.new InnerClass();
		

	}

}
