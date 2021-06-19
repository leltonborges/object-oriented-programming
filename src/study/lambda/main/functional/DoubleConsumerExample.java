package study.lambda.main.functional;

import java.util.function.DoubleConsumer;

public class DoubleConsumerExample {

	public static void main(String[] args) {
		DoubleConsumer num = n1 -> {
			boolean isN = n1 % 2 == 0;
			System.out.println(isN == true ? n1 +" é par" : n1 + " é impar");
		};
		
		num.accept(18);
	}
	
}
