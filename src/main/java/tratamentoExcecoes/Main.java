package tratamentoExcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite primeiro numero inteiro: ");
        int n1 = sc.nextInt();

        System.out.println("Digite primeiro numero inteiro: ");
        int n2 = sc.nextInt();

        try {
            int divisao = n1 / n2;
            System.out.println("Divisão: " + divisao);
        } catch (ArithmeticException e) {
            System.out.println("Não é possivel dividir por zero");
        }

        int[] notas = {4, 6, 7, 8, 6};


        System.out.print("Digite uma posição de 0 a 4: ");
        int posicao = sc.nextInt();

        try {
            System.out.println("Nota: " + notas[posicao]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posição inválida! O array só vai de 0 a 4.");
        }

        try {
            System.out.print("Digite sua idade: ");
            int idade = sc.nextInt();

            System.out.println("Sua idade é: " + idade);

        } catch (InputMismatchException e) {
            System.out.println("Digite uma idade usando apenas números.");

        }


        String nome = null;

        try {
            System.out.println(nome.length());

        } catch (NullPointerException er) {
            System.out.println("O nome não foi preenchido.");
        }

        try {
            System.out.print("Digite um número: ");
            int numero = sc.nextInt();

            int resto = 100 % numero;

            System.out.println("O resto da divisão é: " + resto);

        } catch (ArithmeticException err) {
            System.out.println("Não é possível dividir por zero.");
        }

        String[] nomes = {"Ana", "João", "Maria"};

        try {
            System.out.println(nomes[5]);
        } catch (ArrayIndexOutOfBoundsException erro) {
            System.out.println("Essa posição não existe.");
        }

        System.out.println("O programa continua funcionando.");

        }
}


