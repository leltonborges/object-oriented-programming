package study.stream.main.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class StreamFilter {

	public static void main(String[] args) {
		Consumer<Object> print = System.out::println;
		Function<Student, Double> mediaStudent = s -> s.getMedia();
		Predicate<Student> isAprovado = s -> s.getMedia() >= 7.0;
		BinaryOperator<Double> mediaTotal = (n1, n2) -> n1 + n2;

		Student s1 = new Student("Maria", 53, 6.1, 7.9);
		Student s2 = new Student("Maila", 27, 7.3, 8.2);
		Student s3 = new Student("Bia", 7, 7.4, 6.3);
		Student s4 = new Student("Alex", 17, 5.3, 8.4);
		Student s5 = new Student("Gi", 4, 8.5, 8.6);
		Student s6 = new Student("Bob", 39, 9.3, 8.7);
		Student s7 = new Student("Ana", 14, 4.6, 6.7);
		Student s8 = new Student("José", 25, 7.5, 6.5);

		List<Student> students = Arrays.asList(s1, s2, s3, s4, s5, s6, s7, s8);

		students.stream().filter(s -> s.getAge() > 17).filter(s -> s.getAge() < 31)
				.map(s -> s.getName() + ": " + s.getAge()).forEach(print);
		
		students.stream()
				.filter(isAprovado)
				.map(mediaStudent)
				.reduce(mediaTotal)
				.ifPresent(print);

	}

}
