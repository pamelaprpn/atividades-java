1. O que o padrão Singleton garante?
   a) Que a classe tenha vários construtores
   b) ***Que exista apenas um objeto da classe no programa***
   c) Que a classe não tenha atributos
   d) Que a classe possa ser herdada

2. Por que o construtor de um Singleton é private?
***Pra impedir que outras classes criem objetos diretamente usando o new***

3. Complete a lacuna:

java
```
private ______ Configuracao instancia;
```
a) final
b) public
c) ***static***
d) void

4. O que acontece se alguém tentar escrever isto fora da classe?

java
```
Configuracao c = new Configuracao();
```
Qual é a forma correta de obter o objeto de um Singleton chamado Configuracao?
   a) new Configuracao()
   b) ***Configuracao.getInstancia()***
   c) Configuracao.instancia
   d) this.getInstancia()


