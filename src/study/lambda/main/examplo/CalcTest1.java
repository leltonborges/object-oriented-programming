package study.lambda.main.examplo;

public class CalcTest1 {

	public static void main(String[] args) {
		
		// Este exemplo não tem o uso das funções lambdas
		
		// create instance of Sum
		Calc calc= new Sum();
		System.out.println(calc.execute(4, 3)); // 7.0
		
		// Polymorphism
		calc  = new Mult(); // calc recebe outra de instancia de mesmo contrato
		System.out.println(calc.execute(4, 3)); // 12.0
		
	}
	
}
