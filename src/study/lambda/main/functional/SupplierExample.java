package study.lambda.main.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {
	public static void main(String[] args) {
		Supplier<List<String>> list = () ->
			Arrays.asList("Bia", "Lia", "Alex", "Bob");
			
		System.out.println(list.get());
	}

}
