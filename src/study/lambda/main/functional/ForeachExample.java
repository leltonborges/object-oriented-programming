package study.lambda.main.functional;

import java.util.Arrays;
import java.util.List;

public class ForeachExample {

	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Bob", "Alex");
		
		System.out.println("Forma tradicional");
		// Forma tradicional
		for(String name : aprovados ) {
			System.out.println(name);
		}
		
		System.out.println("\nLambda #1");
		//Lambda #1
		aprovados.forEach( name -> System.out.println(name + " #1"));
		
		System.out.println("\nLambda com referencia de método #1");
		// Method reference
		aprovados.forEach(System.out::println);
		
		System.out.println("\nLambda #2");
		//Lambda #1
		aprovados.forEach( name -> ForeachExample.print(name + " #2"));
		
		System.out.println("\nnLambda com referencia de método #2");
		//Method refecence custom
		aprovados.forEach(ForeachExample::print);
	}
	
	// Criando uma método de referencia
	static void print(String value) {
		System.out.println("Valor impresso é: " + value);
	}
}
