# Lambdas 

Funções lambdas ou funções anónimas é uma expressão que representa uma definição de método "em-linha", com outras palavras e de modo simples, são funções sem declaração, isto é, não é necessário colocar um nome, um tipo de retorno e o modificador de acesso.

Em função lambda seus parâmetros são passados entre parenteses (), mas se a função não tiver parâmetros basta colocar parentes vazio, também, não há necessidade de informa o tipo dos atributos.

Características de função anónima: 

+ Função **implícito**, não a necessidade de colocar `return` no corpo do método/função.
+ Função **explícito**, é necessidade de colocar `return` no corpo do método/função.
+ Não têm a obrigatoriedade de colocar os tipos dos atributos na assinatura do método/função.

```java
// interface para usarmos lambdas
public interface Calc {	
	double execute(double a, double b);
}

public class CalcTest1 {
	public static void main(String[] args) {
        
        // sem declarar os tipos dos atributos
        // return implícito
        Calc sum = (n1, n2) -> n1 + n2;
        
        // declarando os tipos dos atributos
        // return explícito
        Calc mult = (int n1, int n2) -> {
            return n1 * n2;
        };
    }
}
```



