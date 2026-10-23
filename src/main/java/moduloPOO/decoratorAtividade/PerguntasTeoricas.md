Questão 1. Uma açaiteria vende açaí com qualquer combinação de adicionais: granola, leite ninho, morango, paçoca. Por que criar uma classe para cada combinação (AcaiComGranola, AcaiComGranolaEMorango, AcaiComMorangoEPacoca...) é um problema? O que o Decorator faz no lugar? <br><br>
***Porque precisa criar varias combinações de classes e esse crescimento de classes quando preciso adicionar um novo item pra combinar cresce exponencialmente, gerando muitas classses, O decorator eu criar um decorator vcoe cria uma classe para cada adicional e combina os objetos, e cada decorator acrescenta sua propria responsabilidade.***

Questão 2. Em um Decorator, por que a classe AcaiDecorator tem implements Acai? <br>

a) Para poder ser criada com new <br>
b) ***Para que um adicional também conte como açaí e possa ir dentro de outro adicional*** <br>
c) Para herdar o preço do açaí simples<br>
d) Para não precisar usar o super<br><br>