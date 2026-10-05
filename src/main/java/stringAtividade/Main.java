package stringAtividade;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome completo: ");
        String nome = sc.nextLine();

        System.out.println("Seu nome tem " + nome.length() + " letras");
        System.out.println("Seu nome em maiúsculo: " + nome.toUpperCase());
        System.out.println("Seu nome em maiúsculo: " + nome.toLowerCase());
        System.out.println("A primeira letra do nome é: " + nome.charAt(0));

        System.out.println("*------------------------------------------*");
        System.out.println("Digite uma frase: ");
        String frase = sc.nextLine();

        System.out.println("Digite uma palavra: ");
        String palavra = sc.nextLine();

        System.out.println("A palavra aparece na frase? " + frase.contains(palavra));

        System.out.println("*------------------------------------------*");
        System.out.println("Digite seu nome: ");
        String nome1 = sc.nextLine();

        System.out.println("Digite seu nome de novo: ");
        String nome2 = sc.nextLine();

        System.out.println("Os nomes são iguais? " + nome1.equalsIgnoreCase(nome2));

    }
}
