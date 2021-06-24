package study.stream.main.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class StreamMap {
	
	public static void main(String[] args) {
		
		Consumer<String> print = System.out::println;
		UnaryOperator<String> firstLetter = n -> n.charAt(0) + "";		
		
		List<String> carBrand = Arrays.asList("BMW","Ford", "Kia", "Audi", "Honda");
		
		carBrand.stream().map(c -> c.toUpperCase()).forEach(print);
		
		System.out.println();
		
		carBrand.stream().map(firstLetter).forEach(print);
		
	}

}
