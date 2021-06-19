# Pilares da Orientação a Objeto

## Encapsulamento

> É o processo de esconder todos os detalhes de um objeto que não contribuem para as suas características essenciais.

Para exemplificar, pense em um carro, no qual o motorista tem acesso ao volante, embreagem, caixa de marcha, entre outros, todas essas funcionalidades são acessível, exposta para o motorista fazer o carro funcionar e andar, mas existe coisas que não são necessárias o motorista sabem para dirigir o veiculo, com toda a parte mecânica, como o motor, o sistema elétrico, a queima de combustível, esta parte esta escondidas (encapsulada) do motorista, não à necessidade o motorista conhece ou ver acontecendo para dirigir. Desta forma isso se chama de **encapsulamento**, esconder e proteger o sistema do motorista e vice-versa, **expondo** somente o necessário para o funcionamento.

<img src="https://2.bp.blogspot.com/-01oyUkStQYg/Wmel1eUo2oI/AAAAAAAAA5g/Ny9yX7irulIVxAYXv5ZyAeUq5IKC42EWQCEwYBhgL/s320/acessibilidade-0.png" alt="fonte: Tecnopode" style="zoom:100%; align: center;" />

## Tipos de visibilidade

Public

+ Quem tem acesso à classe tem acesso também a qualquer membro com visibilidade **public**;
+ O alvo aqui é o programador cliente que usa suas classes;
+ É raro ter atributos públicos mas é comum ter métodos públicos.

### Private

+ O membro **private** não é acessível fora da classe;
+ A intenção aqui é permitir que apenas você que escreve a classe possa usar esse membro.

### Protected

+ Acessível por **[herança](#herança)**
+ O membro **protected** é acessível à classe e a suas subclasses;
+ A intenção é dar acesso ao programadores que estenderão sua classe.

### "Package"

+ Um membro de classe sem especificador de controle de acesso é dito ter a visibilidade **package** (ou "friendly");
+ É como **public**, mas somente dentro do **package**;
+ Todas as classes do **package** (default) podem acessar um membro "friendly";
+ É usado para permitir acesso mais liberal, mas somente dentro de um mundo controlado e não pelo usuários da classe;
+ Deve-se ter cuidado com a visibilidade **default** para atributos pois pode abrir muito o acesso, principalmente em **package** grandes.

<img src="https://lh3.googleusercontent.com/gspCYElnrB3pnTgduNtUzMccPVzvEVYSQfAgph7CfUw8bMYh1FUFdr9v5F5X4zvUA5g4MSAMPTAV1KZNnDaIeTWTufiEI1GkTvg8OAV2sRKj4l7VlZM11rcIu62IhS3r6d7RMg" alt="fonte: Mauda" style="align: center;" />

## Herança ##

> ***Devmedia***
>
> A herança é um mecanismo da Orientação a Objeto que permite criar novas classes a partir de classes já existentes, aproveitando-se das características existentes na classe a ser estendida. Este mecanismo é muito interessante, pois promove um grande reúso e reaproveitamento de código existente. Com a herança é possível criar classes derivadas, subclasses, a partir de classes bases, superclasses. As subclasses são mais especializadas do que as suas superclasses, mais genéricas. As subclasses herdam todas as características de suas superclasses, como suas variáveis e métodos. A linguagem Java permite o uso de herança simples, mas não permite a implementação de herança múltipla. Para superar essa limitação o Java faz uso de interfaces, o qual pode ser visto como uma “promessa”que certos métodos com características previamente estabelecidas serão implementados, usando inclusive a palavra reservada **implements** para garantir esta implementação. As interfaces possuem sintaxe similar as classes, no entanto apresentam apenas a especificação das funcionalidades que uma classe deve conter, sem determinar como essa funcionalidade deve ser implementada. Apresentam apenas protótipos dos métodos.

<img src="https://www.testeavelocidade.com.br/wp-content/uploads/2020/06/h1-1.jpg" alt="fonte: testeavelocidade" style="align: center;" />

## Polimorfismo

> *Polimorfismo é o princípio pelo qual duas ou mais classes derivadas de uma mesma superclasse podem invocar métodos que têm a mesma identificação (assinatura) mas comportamentos distintos, especializados para cada classe derivada, usando para tanto uma referência a um objeto do tipo da superclasse. A decisão sobre qual o método que deve ser selecionado, de acordo com o tipo da classe derivada, é tomada em tempo de execução, através do mecanismo de [ligação tardia](#ligação-tardia).*

- **Polimorfismo Estático** ou **Sobrecarga**
- **Polimorfismo Dinâmico** ou **Sobreposição**

O **Polimorfismo Estático** se dá quando temos a mesma operação implementada várias vezes na mesma classe. A escolha de qual operação será chamada depende da assinatura dos métodos sobrecarregados.

O **Polimorfismo Dinâmico** acontece na **[herança](#herança)**, quando a subclasse sobrepõe o método original. Agora o método escolhido se dá em tempo de execução e não mais em tempo de compilação. A escolha de qual método será chamado depende do tipo do objeto que recebe a mensagem.

<img src="https://image.slidesharecdn.com/polimorfismo-100526222948-phpapp02/95/polimorfismo-8-728.jpg?cb=1274913023" alt="Fonte: SlideShare" style="align: center;" />

## Abstração

> É a habilidade de concentrar nos aspectos essenciais de um contexto qualquer, ignorando características menos importantes ou acidentais. Em modelagem orientada a objetos, uma classe é uma **abstração** de entidades existentes no domínio do sistema de software.

Em outras palavras, é pegar um conceito do mundo real e simplificar para o seu software, também pode ser entendida como uma **simplificação**.


## Ligação tardia

Quando o método a ser invocado é definido durante a compilação do programa, o mecanismo de **ligação prematura** *(early binding)* é utilizado.

Para a utilização de polimorfismo, a linguagem de programação orientada a objetos deve suportar o conceito de **ligação tardia** *(late binding)*, onde a definição do método que será efetivamente invocado só ocorre durante a execução do programa. O mecanismo de ligação tardia também é conhecido pelos termos *dynamic binding* ou *run-time binding*.

Em Java, todas as determinações de métodos a executar ocorrem através de ligação tardia exceto em dois casos:

1. métodos declarados como `final` não podem ser redefinidos e portanto não são passíveis de invocação polimórfica da parte de seus descendentes; e
2. métodos declarados como `private` são implicitamente finais.

# Enum

<img src="https://i.imgur.com/IXAPeJC.png" alt="Fonte: carbon" style="zoom:60%;" />

São tipos de campos que consistem em um conjunto fixo de constantes (static final), sendo como uma lista de valores pré-definidos. Na linguagem de programação **Java**, pode ser definido um tipo de enumeração usando a palavra chave **enum**. Todos os tipos **enums** implicitamente estendem a classe **java**.

# Interfaces

Uma interface java têm como objetivo principal criar um "**contrato**" onde a Classe que a implementa deve obrigatoriamente obedecer, exemplo:

```java
public interface FirstInterface{
    public void method1();
    Integer method2();
    public abstract void method3(Integer number);
}
```

Uma interface não têm copo, apenas assinatura, onde todos os métodos será sempre *público* e *abstratos*, por mais que o programador não coloque-os no corpo do método. Agora faremos um **contrato** que deve ser seguido caso alguma classe à implemente, exemplo:

```java
public class FistClass implements FirstInterface{
    
    @Override
    public void method1(){
        // TODO auto-gererated
    }
    
    @Override
    public Integer method2(){
        // TODO auto-gererated
    }
    
    @Override
    public void method3(Integer number){
        // TODO auto-gererated
    }
}
```

A interface é muito utilizada em grandes projetos para obrigar o programador seguir o padrão do projeto, por esta tratar-se de um contrato onde o mesmo é obrigado a implementar seus métodos.  E quando bem utilizada, a interface acaba tornando-se uma poderosa ferramenta nas mãos de um programador ou Analista, e torna-se indispensável o seu uso no dia-a-dia. As boas práticas de programação regem que o uso da Interface é indispensável para um bom projeto de software

# Classes abstratas 

Uma classe abstrata é um **"modelo"** para outras classes que dela herdem, não podendo ser instanciada por si só. Para ter um objeto de uma classe abstrata é necessário criar uma classe mais especializada herdando dela e então instanciar essa nova classe. Classe abstrata pode ter método abstrato, no qual, não terá corpo e a classe herdeira é obrigada implementar, **sobrescrito**.

```java
public abstract class Animal {
    private int idade;
    
    public void emitirSOm(){
        System.out.println("HUMM");
    }

    //Método abstrato
	public abstract void tipoAlimentar();
}
```
Classe filha

~~~java
public class Cachorro extends Animal{
    
    //Método obrigatório a implementação
    @Override
    public void tipoAlimentar(){
        System.out.println("Alimenta-se de carne");
    }
}
~~~

