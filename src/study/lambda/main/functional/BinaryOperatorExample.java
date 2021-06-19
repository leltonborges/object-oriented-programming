package study.lambda.main.functional;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

	public static void main(String[] args) {
		
		BinaryOperator<Double> sum = (x, y) -> x + y;
		BinaryOperator<Double> mult = (x, y) -> x * y;
		
		double resultSum = sum.apply(4.0, 3.0); // 7.0
		double resultMult = mult.apply(4.0, 3.0); // 12.0
		
		System.out.println(resultSum);
		System.out.println(resultMult);
	
		
	}
}
