package study.exceptions.main.examplo;

public class CheckAndNoCheck {
	
	public static void main(String[] args) {
		try {
			gereneErroOne();			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			gereneErroTwo();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	// Exceção não checada ou não verificada
	static void gereneErroOne() {
		throw new RuntimeException("Ocorreu um erro legal #1");
	}

	// Exceção checada ou verificada.
	static void gereneErroTwo() throws Exception {
		throw new Exception("Ocorreu um erro doido #2");
	}
}
