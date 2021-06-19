package study.lambda.main.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import study.lambda.main.entity.Product;

public class ConsumerExample {

	public static void main(String[] args) {
		Consumer<Product> print = p -> System.out.println(p.getName());
		
		Product p1 = new Product("Rice", 40.00, 0.9);
		Product p2 = new Product("Notebook", 3999.00, 0.8);
		
		List<Product> listProduct = 
				Arrays.asList(
						new Product("Rice", 40.00, 0.9),
						new Product("Notebook", 3999.00, 0.8),
						new Product("Lapis", 1.89, 0.9),
						new Product("Papel", 0.9, 0.8));
		
		print.accept(p1);
		print.accept(p2);
		System.out.println();
		
		listProduct.forEach(print);
		
		
	}
}
