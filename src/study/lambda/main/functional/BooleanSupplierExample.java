package study.lambda.main.functional;

import java.util.function.BooleanSupplier;

public class BooleanSupplierExample {
	
	public static void main(String[] args) {
		Integer num = 0;
		
		BooleanSupplier isNull = () -> num != null; 
		
		System.out.println(isNull.getAsBoolean());
	}

}
