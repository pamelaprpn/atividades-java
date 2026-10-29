package moduloPOO.lambdaAtividade;

public class Main {
    public static void main(String[] args) {

        System.out.println("*-------------Exercicio 1---------------");
        Saudacao saudacao = () -> System.out.println("oi");
        saudacao.executar();

        System.out.println("*-------------Exercicio 2---------------");
        Impressora minusculo = texto ->  System.out.println(texto.toLowerCase());
        minusculo.imprimir("Xicara Quebrada");

        Impressora maiusculo = texto ->  System.out.println(texto.toUpperCase());
        maiusculo.imprimir("Xicara Quebrada");

        System.out.println("*-------------Exercicio 3---------------");
        Calculo soma = (a, b) ->   a + b;
        System.out.println("Soma: " + soma.calcular(3, 6));

        Calculo multiplicacao = (a, b) -> a * b;
        System.out.println("Multiplicação: " + multiplicacao.calcular(3, 6));

        Calculo qualMaior = (a, b) -> {
            if (a > b) {
             return a;
            } else {
                return b;
            }
                };
        System.out.println(qualMaior.calcular(3, 6) + " é maior.");

        System.out.println("*-------------Exercicio 4---------------");
        Acao.repetir(() -> System.out.println("oi"));

        System.out.println("*-------------Exercicio 5---------------");
        Operacao.mostrarResultado(n -> n * 2, 5);
        Operacao.mostrarResultado(n -> n * n, 5);
        Operacao.mostrarResultado(n -> -n, 5);

        System.out.println("*-------------Exercicio 6---------------");
        Condicao.executarSe(
                n -> n % 2 == 0,
                4,
                () -> System.out.println("é par!")
        );

        Condicao.executarSe(
                n -> n % 2 == 0,
                7,
                () -> System.out.println("é par!")
        );



    }
}
