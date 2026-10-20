1. O que o padrão Singleton garante? <br>
   a) Que a classe tenha vários construtores <br>
   b) ***Que exista apenas um objeto da classe no programa*** <br>
   c) Que a classe não tenha atributos <br>
   d) Que a classe possa ser herdada <br><br>

2. Por que o construtor de um Singleton é private? <br>
***Pra impedir que outras classes criem objetos diretamente usando o new*** <br><br>

3. Complete a lacuna:

java
```
private ______ Configuracao instancia;
```
a) final <br>
b) public <br> 
c) ***static*** <br>
d) void <br>

4. O que acontece se alguém tentar escrever isto fora da classe?

java
```
Configuracao c = new Configuracao();
```
Qual é a forma correta de obter o objeto de um Singleton chamado Configuracao? <br>
   a) new Configuracao() <br>
   b) ***Configuracao.getInstancia()*** <br>
   c) Configuracao.instancia <br>
   d) this.getInstancia() <br>


