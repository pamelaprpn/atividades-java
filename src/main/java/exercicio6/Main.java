package exercicio6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu ano de nascimento: ");
        int anoNascimento = sc.nextInt();

        sc.nextLine();

        System.out.println("Digite o seu nome completo: ");
        String nome = sc.nextLine();

        System.out.println("O usuário " + nome + " nasceu em " + anoNascimento);

    }
}
