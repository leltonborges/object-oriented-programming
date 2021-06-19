package study.lambda.main.functional;

import java.util.function.BiPredicate;

public class BiPredicateExample {
	
	public static void main(String[] args) {
		
		BiPredicate<Double, String> result = (note, name) 
				-> note > 6;
		
		System.out.println(result.test(7.0, "Marcos"));
		
	}

}
