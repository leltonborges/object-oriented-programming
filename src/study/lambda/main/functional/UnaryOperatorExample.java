package study.lambda.main.functional;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

	public static void main(String[] args) {
		UnaryOperator<Integer> moreTwo = num -> num + 2;
		UnaryOperator<Integer> multTwo = num -> num * 2;
		UnaryOperator<Integer> squared = num -> num * num;
		
		Integer result1 = moreTwo
				.andThen(multTwo)
				.andThen(squared)
				.apply(0);
		Integer result2 = squared.compose(multTwo).compose(moreTwo).apply(0);
		
		System.out.println(result1);
	}

}
