package moduloPOO.lambda2Atividade;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        System.out.println("*----------------Runnable-------------------*");
        Runnable tarefa1 = () -> System.out.println("executando tarefa");
        Runnable tarefa2 = () -> System.out.println("executando segunda tarefa");
        tarefa1.run();
        tarefa2.run();

        System.out.println("*----------------Consumer-------------------*");
        Consumer<String> saudacao = nome -> System.out.println("Olá, " + nome);
        Consumer<String> nomeMaiusculo = nome -> System.out.println("Olá, " + nome.toUpperCase());
        saudacao.accept("Pamela");
        nomeMaiusculo.accept("Pamela");

        System.out.println("*----------------Supplier-------------------*");
        Supplier<String> aviso = () -> "Aviso: O sistema está online!";
        System.out.println(aviso.get());

        Supplier<Integer> numeroAleatorio =
                () -> new Random().nextInt(100);

        System.out.println(numeroAleatorio.get());
        System.out.println(numeroAleatorio.get());

        System.out.println("*----------------Predicate-------------------*");
        Predicate<Integer> maiorQueDez = numero -> numero > 10;
        System.out.println(maiorQueDez.test(5));
        System.out.println(maiorQueDez.test(15));

        Predicate<String> textoVazio = texto -> texto.isEmpty();
        System.out.println(textoVazio.test(""));
        System.out.println(textoVazio.test("Java"));

        System.out.println("*----------------Function-------------------*");
        Function<Integer, String> notaFiscal = numero -> "Nota fiscal nº: " + numero;
        System.out.println(notaFiscal.apply(1542));

        Function<String, Integer> quantidadeLetras = palavra -> palavra.length();
        System.out.println(quantidadeLetras.apply("Professora"));
    }
}
