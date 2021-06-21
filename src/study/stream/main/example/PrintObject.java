package study.stream.main.example;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class PrintObject {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Ana", "Alex", "Bob", "Lú", "Maria");

		System.out.println("Usando Foreach");
		for(String name:  names) {
			System.out.println(name);
		}	
		
		System.out.println("\nUsando Iterator");
		Iterator<String> itNames = names.iterator();
		while(itNames.hasNext()) {
			System.out.println(itNames.next());
		}
		
		System.out.println("\nUsando stream");
		names.forEach(System.out::println);
	}
}
