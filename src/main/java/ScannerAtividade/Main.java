package ScannerAtividade;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Oi " + nome + ", você tem " + idade + " e vai fazer " + (idade + 1) + " no próximo aniversário.");

        System.out.println("*---------------------------------------------------*");
        System.out.println("Digite primeiro numero inteiro: ");
        int numero1 = sc.nextInt();

        System.out.println("Digite segundo numero inteiro: ");
        int numero2 = sc.nextInt();

        System.out.println("A soma é: " + (numero1 + numero2) + ". A subtração é: " + (numero1 - numero2) + ". A multiplicação é: " + (numero1 * numero2) + ". A divisão é: "
        + (numero1 / numero2) + ". O resto é: " + (numero1 % numero2));

        System.out.println("*---------------------------------------------------*");
        System.out.println("Digite sua nota: ");
        double nota = sc.nextDouble();

        if( nota >= 7){
            System.out.println("Aprovada");
        }else if(nota >=5){
            System.out.println("Recuperação");
        }else{
            System.out.println("Reprovada");
        }

        System.out.println("*---------------------------------------------------*");
        System.out.println("Digite um numero: ");
        int num = sc.nextInt();

        for(int i=1; i <= 10; i++){
            System.out.println(num + " x " + i + " = " + (num * i));
        }

    }
}
