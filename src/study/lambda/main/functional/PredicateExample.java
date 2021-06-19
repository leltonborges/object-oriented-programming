package study.lambda.main.functional;

import java.util.function.Predicate;

import study.lambda.main.entity.Product;

public class PredicateExample {

	public static void main(String[] args) {

		Predicate<Product> isExpensiveProduct = p -> 
				(p.getPrice() * p.getDiscount()) >= 500;
		
		Product p1 = new Product("Rice", 40.00, 0.9);
		Product p2 = new Product("Notebook", 3999.00, 0.8);
		
		System.out.println(isExpensiveProduct.test(p2)); // true
		System.out.println(isExpensiveProduct.test(p1)); // false
		
	}

}
