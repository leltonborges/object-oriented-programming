package study.stream.main.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class StreamReduce1 {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(2, 5, 4, 1, 3, 7, 4, 9, 20);

		BinaryOperator<Integer> sums = (n1, n2) -> n1 + n2;
		Integer sumValue = nums.stream().reduce(sums).get();
		System.out.println(sumValue);

		nums.stream().reduce(sums).ifPresent(System.out::println);
	}

}
