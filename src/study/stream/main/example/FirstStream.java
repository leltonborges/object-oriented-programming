package study.stream.main.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class FirstStream {
	public static void main(String[] args) {

		Consumer<String> printString = System.out::println;
		Consumer<Integer> printInt = System.out::println;

		Stream<String> langs = Stream.of("Java", "Lua", "Php", "Go Lang");
		langs.forEach(printString);

		System.out.println("");

		String[] names = { "Alex", "Maria", "José", "Bia", "Lia", "Ana" };
		Arrays.stream(names, 1, 3).forEach(printString);
		System.out.println("");
		Arrays.stream(names).forEach(printString);

		System.out.println("");

		List<String> concat = Arrays.asList("Alex", "Maria", "Java", "Lua", "Php", "Go Lang", "José", "Bia", "Lia",
				"Ana");
		concat.stream().forEach(printString);
		
//		Stream.generate(() -> "a").forEach(print); // Infinita
//		Stream.iterate(0, n -> n + 1  ).forEach(printInt); // Infinita
	}
}
