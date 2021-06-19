package study.lambda.main.functional;

import java.util.function.Function;

import study.lambda.main.entity.Product;

public class FunctionlExample {

	public static void main(String[] args) {

		Product p1 = new Product("Rice", 40.00, 0.9);
		Product p2 = new Product("Notebook", 3999.00, 0.8);

		Function<Product, Double> prodWithDiscount = p -> p.getDiscount() * p.getPrice();

		System.out.println(prodWithDiscount.apply(p1));
		System.out.println(prodWithDiscount.apply(p2));

		Function<Integer, String> evenOrOdd = num -> num % 2 == 0 ? "Par" : "Ímpar";

		System.out.println();
		System.out.println(evenOrOdd.apply(3));
		System.out.println(evenOrOdd.apply(4));

		System.out.println();
		Function<String, String> result = value -> "O resultado é " + value;
		System.out.println(evenOrOdd.andThen(result).apply(42));
	}

}
