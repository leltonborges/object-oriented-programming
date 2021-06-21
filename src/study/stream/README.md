# Stream

A Streams API facilita o desenvolvimento, reduz o tamanho do código e simplifica o uso do paralelismo.

Uma Stream pode ser definida como uma “sequência de elementos de uma fonte de dados que oferece suporte a diferentes tipos de operações de agregação”

**Sequência de elementos**: Uma stream provê uma interface para um conjunto sequencial de valores de um determinado tipo. Contudo, streams não armazenam elementos. Eles são processados sob demanda;

**Fonte de dados:** Streams consomem dados de uma fonte, como coleções, arrays ou mesmo recursos de E/S (entrada e saída);

**Operações de agregação:** Streams suportam operações comuns a linguagens de programação funcionais, como filtrar, modificar, transformar o elemento em outro e assim por diante. Essas operações podem ser realizadas em série ou em paralelo.

Além disso, as operações relacionadas a streams têm duas características fundamentais que as tornam muito diferentes das operações sobre coleções.

**Pipeline:** Streams são projetadas de tal maneira que a maior parte de suas operações retornam novas streams. Dessa forma, é possível criar uma cadeia de operações que formam um fluxo de processamento. A isso damos o nome de pipeline;

**Iteração interna:** Tradicionalmente as coleções usam loops ou iteradores para percorrer seus elementos. Esse tipo de operação é conhecido como iteração externa e é claramente perceptível no código. Já a partir do Java 8, através da Streams API, é possível encontrar métodos como **map()**, **forEach()**, **filter()**, entre outros, que percorrem uma sequência de elementos internamente focando apenas no que “fazer” com os elementos, livrando o desenvolvedor de ter que se preocupar com a forma de iterar sobre a lista e como manipular cada um dos seus elementos. Ou seja, o modo como ocorre a iteração/loop agora fica encapsulado na API.