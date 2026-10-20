Questão 1: Abstração
a) Explique, com suas palavras, o que é abstração em programação orientada a objetos.
mostrar o que é importante e esconder os detalhes de como algo funciona, em java podemos trabalhar usando classes abstratas e interfaces

b) Qual a diferença entre abstração e encapsulamento?
abstração significa que mostrar o que um objeto faz, sem exigir que quem o utiliza conheça todos os detalhes de como funciona e o
encapsulamento significa controlar o acesso aos dados e as operações internas do objeto

c) Quando você usa lista.add("Ana"), você sabe como o Java guarda esse elemento na memória? Por que isso é um exemplo de abstração?
internamente o java utiliza um array para armazenar referencias aos elementos, quando você chama add("Ana"), o ArrayList cuida de detalhes
como verificar se existe espaço disponível e, se necessário, aumentar a capacidade do array interno.
é um exemplo de abstração porque utiliza um operação simples, sem precisar conhecer todos os detalhes internos da implementação

Questão 2: SOLID
Para cada código abaixo, diga qual princípio do SOLID está sendo violado e explique como você corrigiria.

a) Princípio violado: S, corrigiria separando as responsabilidades em classes diferentes:
        java
```
        class Relatorio {
            void calcularTotais() { /* ... */ }
            void formatarEmPdf() { /* ... */ }
            void salvarNoDisco() { /* ... */ }
            void enviarPorEmail() { /* ... */ }
        }
```

b) Princípio violado: O , corrigiria utilizando interfaces e polimorfismo para permitir novos tipos de mensagens sem modificar a logica de envio
        java
```
        class EnviadorEmail {
            void enviar(String tipo) {
                if (tipo.equals("aniversario")) {
                    System.out.println("Feliz aniversário!");
                } else if (tipo.equals("seguranca")) {
                    System.out.println("Alerta de segurança!");
                } else if (tipo.equals("promocao")) {
                    System.out.println("Promoção imperdível!");
                }
            }
        }
```
c) Princípio violado: D corrigiria aplicando interface e injeção de dependencia - Para corrigir, criaria uma interface PedidoRepositorio
e faria PedidoService receber essa dependência pelo construtor. Dessa forma, seria possível trocar a implementação do repositório sem modificar a lógica do serviço
        java
```
        class PedidoService {
            private MySQLRepositorio repo = new MySQLRepositorio();

            void finalizar() {
                repo.salvar();
            }
        }
```
Questão 4: Modificadores de acesso

Explique quem pode acessar um atributo ou método declarado com cada modificador:

a) private: Só pode ser acessado dentro da propria classe
b) default (sem modificador): pode ser acessado por qualquer classe que esteja no mesmo pacote
c) protected: pode ser acessada pela propria classe, por outras classes do mesmo pacote, por classes filhas, mesmo que estejam em outro pacote, respeitando as regras de acesso por herança 
d) public: pode ser acessado por qualquer classe, inclusive outros pacotes, desde que a classe que contém o membro seja acessivel

Quais princípios e conceitos de POO você usou em cada etapa do exercicio Sistema de funcionarios?

1 - Encapsulamento, ao declarar atributos como private e utilizar getters e setter para controlar acesso
```
public abstract class Funcionario {
private String nome;
private double salarioBase;
}
```
2 - na classe funcionário o metodo abstrato é usado pra definir que todo funcionario deve calcularSalario, mas deixa a implementação para as 
classes filhas - abstração
```
public abstract double calcularSalario();
```
3 - Polimorfismo, permite que uma variavel do tipo funcionario referencie objetos de diferentes subclasses, como desenvolvedor e gerente
com isso, cada objeto executa sua propria implementação 
E temos tbm Herança que permite que Desenvolvedor e Gerente sejam tipos de Funcionario
```
Funcionario funcionario = new Desenvolvedor("Pamela", 7000);
System.out.println(funcionario.calcularSalario());
```
4 - implementação de interfaces, quando uma classe usa implements, ela assume o compromisso de implementar os metodos abstratos definidos
pela interface
```
public interface Notificador {
void notificar(String mensagem);
}
```
5 - Principio de inversão de dependencia, queremos que folhaPagamento dependa de uma abstração permitindo trocar a implementação
de notificação sem modificar seu código

```
public class FolhaPagamento {

    private Notificador notificador;

    public FolhaPagamento(Notificador notificador) {
        this.notificador = notificador;
    }
}
```

6 - Polimorfismo - podemos passar objetos diferentes que podem ser utilizados por meio de um mesmo tipo

```
FolhaPagamento folhaEmail =
new FolhaPagamento(new NotificadorEmail());

FolhaPagamento folhaSms =
new FolhaPagamento(new NotificadorSms());
```


