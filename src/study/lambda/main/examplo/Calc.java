package study.lambda.main.examplo;

@FunctionalInterface
public interface Calc {

	double execute(double a, double b);

	default void defaulMethod() {
		System.out.println("Método default");
	}

	static String staticMethod() {
		return "Método estático";
	}

}
