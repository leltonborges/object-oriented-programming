package study.lambda.main.examplo;

public class CalcTest2 {

	public static void main(String[] args) {

		// Exemplo com lambdas
		
		// Função lambda, return implícito
		Calc sum = (n1, n2) -> n1 + n2;
		
		// Função lambda, return emplícito
		Calc mult = (n1, n2) -> {
			return n1* n2;
		};
		
		System.out.println(sum.execute(2, 3)); // 5.0
		System.out.println(mult.execute(2, 3)); // 6.0
		
		sum.defaulMethod(); // default method
		System.out.println(Calc.staticMethod()); // static method

	}

}
