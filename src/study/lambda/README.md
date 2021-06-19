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

## Interface Funcional

Leia a documentação oficial do java 8 [aqui](https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html).

É um **interface** que possui um único método abstrato. E é através delas que podemos usar as expressões lambdas, ou seja, podemos dizer que uma expressão lambda representa a implementação do método abstrato de uma **interface funcional**.

```java
@FunctionalInterface
public interface Calc {	
	double execute(double a, double b);
}
```

Toda **Interface funcional** pode ser acompanhada da anotação `@FunctionalInterface`, qual está anotação irá informar ao compilador que está interface só pode existir um único método, e se por acaso o programador tentar adicionar mais de um método na **interface** o *automatic complication* dará erro. `@FunctionalInterface` força ter um único método abstract.

Cabe ressaltar que, uma função funcional interface usando a anotação `@FunctionalInterface` pode receber dois outros tipos de métodos `default`  e `static` sem causar erros.

```java
@FunctionalInterface
public interface Calc {	
	double execute(double a, double b);
    
    default void defaulMethod(){
        System.out.println("Método default");
    }
    
    static void staticMethod(){
        System.out.println("Método estático");
    }
}
```

Existe diversas interfaces funcionais já pré definida na linguagem java, e todo elas só receber **Wrapper** do seu tipo primitivo, ou seja, não aceitar `int, double, float, char, boolean` como tipo de parâmetro, mas aceita `Integer, Double, Float, String, Boolean, Character`, ou seja, sempre será uma classe/objeto.

## Interfaces

O conceito de interface funcional, que contém apenas um método abstrato. Este tipo de Interface é usado em situações específicas, sendo comum a instanciação é através de uma classe anónima. 

Agora! irei estudar e repassar o meu conhecimento de todas as interfaces funcionais, existe algumas que nunca usei mas irei descreve-las aqui.

Name | Entrada | Return | Leitura
:-------: | :-------: | :-------: | :-----:
BiConsumer| <T, U> | nada | Recebe dois parâmetros distintos e sem retorna
BiFunction | <T, U, R> | < R > | Recebe três parâmetros distintos e retorna o tipo < R > declarado 
BinaryOperator | <T, T> | < T > | Recebe dois parâmetros iguais e retorna o mesmo tipo
Supplier | nada | < T > | Não recebe nada e retorna um tipo < T >
Consumer | < T > | nada | Recebe um tipo < T > e não tem retorna 
UnaryOperation | < T > | < T > | Recebe um tipo < T > e retorna o mesmo tipo < T > 
Function | < T, R > | < R > | Recebe um tipo < T > e retorna um tipo < R > 
Predicate | < T > | boolean | Recebe um tipo < T > e retorna um Boolean 

É possível encadear varias funções de acordo com o retorno da função anterior, que será o valor para a próxima função, e para isso existem métodos para fazer este encadeamento, conhecida como composição de função.

+ **and(otherFunction)** - Têm o mesmo conceito do operador lógico *&&* , onde as duas condições tem que ser satisfeita.

  ```java
  myFunction.and(other1.test(3));
  // other1(3) se satisfazer a condição para myFunction().
  ```

+ **or(otherFunction)** - Têm o mesmo conceito do operador lógico *OU* `||`.

+ **negate()** - É a negação do função, inversão de valores de verdadeiro para falso, e vice-versa.

+ **andThen(*otherFunction*)** - recebe o valor do método anterior e aplica na outra interface **otherFunction**, sucessivamente e este valor tem que ser compatível  com o parâmetro da função anónima **otherFunction**, se fossemos ler seria: *Execute myfunction, e depois execute other1, e depois execute other2, e depois execute ...*;

  ```java
  myFunction.andThen(other1).andThen(othe2).andThen(other3).apply(3);
  // executa myFunction(3) -> passa para other1 -> passa para other2 -> passa para other3.
  // Á leitura é do ínicio para o fim da declaração.
  ```

+ **compose(otherFunction)** - É o inverso do **andThen()**, antes de executar a função, chame a outra função, sucessivamente. Se fosse ler seria: *Antes de executar myFunction execute other1, antes de executar other1 execute other2, antes de executar other2 execute ...*

  ```java
  myFunction.compose(other1).compose(othe2).compose(other3).compose(3);
  // Executa a ultima e vai até a primeira. other3 -> other2 -> other1 -> myFunction
  ```

### Foreach

É uma das formas de lê todos os elementos de uma lista e aplicar uma determinada lógica.

```java
List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Bob", "Alex");

System.out.println("\nLambda");
//Lambda
aprovados.forEach( name -> System.out.println(name));
		
System.out.println("\nLambda com referencia de método #2");
// Method reference
aprovados.forEach(System.out::println);
```

Também é possível criar métodos personalizados e usa-los como referencia de método, e só se usa referencia quando possui um único parâmetro em qualquer interface funcional.

```java
public class Example {
    public static void main(String[] args){
    
        // Method reference custom
		aprovados.forEach(Example::print);
    }
 
    // Criando uma método de referencia
    static void print(String value) {
        System.out.println("Valor impresso é: " + value);
    }
}
```

### BinaryOperator<T>

É uma **interface funcional** que recebe dois operando de mesmo tipo e retorna o mesmo tipo.

```java
// Recebe dois valores Double e retorna Double
BinaryOperator<Double> mult = (x, y) -> x * y;
```

