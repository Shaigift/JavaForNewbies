package com.in28minutes.functionalprogramming;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.function.Consumer;


class EvenNumberPredicate implements Predicate<Integer> {

	@Override
	public boolean test(Integer number) {
		// TODO Auto-generated method stub
		return number%2 == 0;
	}
	
}

class SystemOutConsumer implements Consumer<Integer> {

	@Override
	public void accept(Integer number) {
		// TODO Auto-generated method stub
		System.out.println(number);
		
	}
	
}

public class LambdaBehindTheScreensRunner {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<? super Integer> evenPredicate = n -> n%2 ==0;
		List.of(23,43,45,57).stream()
				.filter(evenPredicate)
				.forEach(e -> System.out.println(e));

		List.of(23,43,45,57).stream()
		.filter(new EvenNumberPredicate())
		.forEach(e -> System.out.println(e));
	}

}
