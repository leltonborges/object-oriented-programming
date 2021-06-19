package study.lambda.main.functional;

import java.util.function.DoubleBinaryOperator;

public class DoubleBinaryOperatorExample {

	public static void main(String[] args) {
		DoubleBinaryOperator num = (n1, n2) -> n1 / n2;
		
		System.out.println(num.applyAsDouble(16, 4));
	}

}
