Questão 1. Explique com suas palavras qual problema o Factory resolve. O que aconteceria se os ifs que decidem qual objeto criar ficassem espalhados pelo main e por outras partes do programa, e depois surgisse um tipo novo? <br>
***O factory centraliza a criação de objetos em uma classe especifica, evitando que a logica de descição sobre qual objeto criar fique espalhado pelo programa <br>
Sobre o ifs, cada novo tipo de animal exegiria alterações em varios lugares, tornando o código mais dificil de manter, com o factory a logica da criação fica centralizada em um unico local*** <br><br>


Questão 2. O método da fábrica normalmente devolve o objeto criado com qual tipo? <br>
• a) O tipo da classe concreta (ex.: Cachorro)<br>
• b) ***O tipo da interface (ex.: Animal)***<br>
• c) String<br>
• d) Não devolve nada (void)<br><br>

Questão 4. Seu sistema precisa usar uma classe de pagamento de outra empresa, mas ela não implementa a sua interface. Por que não dá para simplesmente escrever implements na classe dela? O que você faz no lugar? <br>
***Porque não podemos simplesmente adicionar implements se não temos perminssão prar alterar a classe externa. A solução é criar uma classe adapter, que implementa a nossa interface e usa a classe externa por dentro, assim ela adapta a comunicação entre as duas classes sem precisar modificar o código original.***<br><br>

Questão 5. Em um Adapter, onde fica a tradução (por exemplo, a conversão de dólar para real)?<br>
• a) Na classe de fora<br>
• b) Na interface<br>
• c) ***No método implementado da interface, dentro do adapter***<br>
• d) No main, antes de chamar o método<br><br>

Questão 7. Explique com suas palavras qual problema o Facade resolve. Se quiser, use o exemplo do síndico do condomínio ou crie outro. <br>
***Simplifica o uso de um sistema que possui varias classes, ao inves de chamar cada classse separada e conhecer a ordem das operações, o cliente usa uma unica classe que corrdena tudo.<br>
Exemplo: sindico de um condominio centraliza as solicitações dos moradores e aciona os responsaveis por cada serviço, assim o morador não precisa entrar em contato com cada setor individual.*** <br><br>

Questão 8. Marque V (verdadeiro) ou F (falso):<br>
• ( **F** ) A fachada precisa implementar uma interface.<br>
• ( **V** ) A fachada guarda as classes envolvidas no processo em atributos.<br>
• ( **D** ) Depois que a fachada existe, é proibido usar as outras classes diretamente.<br><br>