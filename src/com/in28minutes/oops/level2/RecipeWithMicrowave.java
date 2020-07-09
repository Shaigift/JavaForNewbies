package com.in28minutes.oops.level2;

public class RecipeWithMicrowave extends AbstractRecipe {
	
	@Override
	void getReady() {
		// TODO Auto-generated method stub
		System.out.println("Get the raw materials");
		System.out.println("Switch on the microwave");
		
	}

	@Override
	void doTheDish() {
		// TODO Auto-generated method stub
		System.out.println("get stuff ready");
		System.out.println("Put it in the microwave");
		
	}

	@Override
	void cleanup() {
		// TODO Auto-generated method stub
		System.out.println("Cleanup the utensils");
		System.out.println("Switch off the microwave");
		
	}
	


}
