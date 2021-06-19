package study.lambda.main.functional;

import java.util.function.BiFunction;

public class BiFunctionExample {
	
	public static void main(String[] args) {
		BiFunction<Double, Double, String> result = (n1, n2) 
				-> (n1 + n2) / 2 >= 7 ? "Aprovado": "Reprovado";
				
		System.out.println(result.apply(7.7, 6.7));
			
	}

}
