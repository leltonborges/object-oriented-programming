package study.lambda.main.functional;

import java.util.function.BiConsumer;

public class BiConsumerExample {

	public static void main(String[] args) {
		BiConsumer<Integer, String> result = (age, name) 
				-> System.out.println("Name: " + name +" idade: " + age );
				
		result.accept(22, "Leo");
	}
	
}
