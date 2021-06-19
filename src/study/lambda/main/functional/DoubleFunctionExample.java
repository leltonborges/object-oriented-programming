package study.lambda.main.functional;

import java.util.function.DoubleFunction;

public class DoubleFunctionExample {

	public static void main(String[] args) {
		
		DoubleFunction<String> sum = (n1) -> "Numero: " + n1;
		System.out.println(sum.apply(32));
		
	}
	
}
