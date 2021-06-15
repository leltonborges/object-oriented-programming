# Pilares da Orientação a Objeto

## Encapsulamento

> É o processo de esconder todos os detalhes de um objeto que não contribuem para as suas características essenciais.

Para exemplificar, pense em um carro, no qual o motorista tem acesso ao volante, embreagem, caixa de marcha, entre outros, todas essas funcionalidades são acessível, exposta para o motorista fazer o carro funcionar e andar, mas existe coisas que não são necessárias o motorista sabem para dirigir o veiculo, com toda a parte mecânica, como o motor, o sistema elétrico, a queima de combustível, esta parte esta escondidas (encapsulada) do motorista, não à necessidade o motorista conhece ou ver acontecendo para dirigir. Desta forma isso se chama de **encapsulamento**, esconder e proteger o sistema do motorista e vice-versa, **expondo** somente o necessário para o funcionamento.

![](https://2.bp.blogspot.com/-01oyUkStQYg/Wmel1eUo2oI/AAAAAAAAA5g/Ny9yX7irulIVxAYXv5ZyAeUq5IKC42EWQCEwYBhgL/s320/acessibilidade-0.png)

## Tipos de visibilidade

### Public

+ Quem tem acesso à classe tem acesso também a qualquer membro com visibilidade **public**;
+ O alvo aqui é o programador cliente que usa suas classes;
+ É raro ter atributos públicos mas é comum ter métodos públicos.

### Private

+ O membro **private** não é acessível fora da classe;
+ A intenção aqui é permitir que apenas você que escreve a classe possa usar esse membro.

### Protected

+ Acessível por **[herança](#heranca)**
+ O membro **protected** é acessível à classe e a suas subclasses;
+ A intenção é dar acesso ao programadores que estenderão sua classe.

### "Package"

+ Um membro de classe sem especificador de controle de acesso é dito ter a visibilidade **package** (ou "friendly");
+ É como **public**, mas somente dentro do **package**;
+ Todas as classes do **package** (default) podem acessar um membro "friendly";
+ É usado para permitir acesso mais liberal, mas somente dentro de um mundo controlado e não pelo usuários da classe;
+ Deve-se ter cuidado com a visibilidade **default** para atributos pois pode abrir muito o acesso, principalmente em **package** grandes.


## Herança

## Polimorfismo

## Abstração

