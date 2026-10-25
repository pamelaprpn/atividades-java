1.(Cenário Real) A equipe mexeu na classe CalculadoraFrete para adicionar entrega por Drone, mas sem querer estragou o cálculo antigo do Sedex. <br>
Qual é a principal vantagem de ter Testes Unitários nesse momento?<br>
A) O teste unitário corrige o código do Sedex sozinho usando Inteligência Artificial.<br>
B) <span style="color: green;">O teste apita Vermelho imediatamente na máquina da programadora antes de o bug ir para o cliente (evitando regressão)</span>.<br>
C) O teste substitui a necessidade de usar interfaces e princípios S.O.L.I.D. no projeto.<br>
D) O teste deixa o banco de dados do sistema duas vezes mais rápido.<br><br>

2. Olhando para a Pirâmide de Testes, por que os Testes Unitários ficam na base (representando cerca de 70% dos testes de uma empresa)?<br>
   A) Porque eles testam a tela inteira clicando nos botões como um humano.<br>
   B) Porque eles exigem que o banco de dados oficial esteja ligado.<br>
   C) <span style="color: green;">Porque eles testam pequenas partes isoladas do código, rodando em milissegundos e sendo muito mais baratos e fáceis de manter.</span><br>
   D) Porque são feitos manualmente usando System.out.println no main.<br>
   /Quiz Rápido: Vamos testar o conhecimento? (2/3)/<br><br>

3. No JUnit 5, nós organizamos nosso método de teste seguindo o padrão AAA (Arrange, Act, Assert). O que fazemos na etapa "Assert"?<br>
   A) Damos new na classe que queremos testar e preparamos as variáveis.<br>
   B) <span style="color: green;">Usamos os comandos do JUnit (como assertEquals ou assertTrue) para verificar se o resultado obtido bateu com o esperado.</span><br>
   C) Apagamos os dados do banco de dados após o teste terminar.<br>
   D) Imprimimos o resultado no console com System.out.println para conferir no olho.<br><br>

4. Qual comando do JUnit 5 você deve usar para garantir que o método conta.sacar(-50.0) bloqueia a operação lançando uma exceção (IllegalArgumentException)?<br>
   A) assertEquals(-50.0, conta.sacar(-50.0));<br>
   B) assertFalse(conta.sacar(-50.0));<br>
   C) assertNull(conta.sacar(-50.0));<br>
   D) <span style="color: green;">assertThrows(IllegalArgumentException.class, () -> conta.sacar(-50.0));</span><br><br>

5. No TDD (Test-Driven Development), trabalhamos no ciclo Red ➡️ Green ➡️ Refactor. O que significa a etapa "GREEN" (Verde)?<br>
   A) Escrever o teste primeiro e ver ele falhar porque a classe ainda não existe.<br>
   B) <span style="color: green;">Escrever o código mais simples e direto possível na classe principal apenas para fazer o teste passar e ficar verde.</span><br>
   C) Limpar o código, tirar repetições e aplicar boas práticas sem alterar o resultado.<br>
   D) Enviar o código direto para o servidor de produção sem testar.<br><br>

6. Responda:Na sinceridade: Por que testar o sistema apenas dando System.out.println() dentro do método main ("teste no olho") não funciona quando<br>
o projeto cresce na empresa?Detetive de Código: Uma colega escreveu um método de teste perfeito com assertEquals, clicou para rodar a classe de teste,<br>
mas o JUnit ignorou o método dela completamente! Qual anotação ela esqueceu de colocar em cima do método? Refatoração sem medo: No ciclo do TDD, por que a <br>
gente só faz o Refactor (deixar o código bonito e limpo) depois que o teste já ficou Verde?<br>

<span style="color: green;">Porque precisamos conferir os resultados manualmente. Conforme o projeto cresce, fica difícil verificar todas as funcionalidades e identificar<br> 
quando uma alteração quebra algo que já funcionava. Com testes unitários, conseguimos automatizar essas verificações.</span>
```
class CalculadoraTest {

    @Test
    void deveSomarDoisNumeros() {
        assertEquals(5, 2 + 3);
    }
}
```
<span style="color: green;">Porque fazemos rafctor depois?
Porque primeiro precisamos garantir que a funcionalidade está funcionando corretamente. Depois que o teste passa, podemos melhorar a organização e a qualidade do código,<br> executando os testes novamente para garantir que nada foi quebrado. </span>

