package study.stream.main.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {

	public static void main(String[] args) {
		Student s1 = new Student("Alan", 21, 7.0, 6.8);
		Student s2 = new Student("Bia", 18, 8.6, 7.8);
		Student s3 = new Student("Liz", 20, 6.0, 9.0);
		Student s4 = new Student("Marco", 18, 8.8, 7.8);
		Student s5 = new Student("Alex", 19, 5.5, 7.6);
		Student s6 = new Student("Luna", 18, 6.7, 7.3);
		Student s7 = new Student("Ana", 19, 7.8, 6.5);
		Student s8 = new Student("Bob", 19, 7.7, 5.3);

		List<Student> listStudents = Arrays.asList(s1, s2, s3, s4, s5, s6, s7, s8);
		
		Comparator<Student> melhorNota = (st1, st2) -> {
			if(st1.getMedia() > st2.getMedia()) return 1;
			if(st1.getMedia() < st2.getMedia()) return -1;
			return 0;
		};
		
		listStudents.stream().max(melhorNota).ifPresent(System.out::println);
		listStudents.stream().min(melhorNota).ifPresent(System.out::println);
	}
}
