package methodosAtividade;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        mostrarBoasVindas("Bem-vinda ao curso de Java!");

        Utilidades utilidades = new Utilidades();
        utilidades.saudar("Pamela");
        utilidades.saudar("Maria");
        utilidades.saudar("Hugo");

        System.out.println("Dobro: " + utilidades.dobro(2));


        System.out.println("*-----------------------------------*");
        System.out.println("Digite nota 1: ");
        double n1 = sc.nextDouble();

        System.out.println("Digite nota 2: ");
        double n2 = sc.nextDouble();

        sc.nextLine();
        System.out.printf("Média: %.2f" , utilidades.calcularMedia(n1,n2));

        sc.nextLine();
        System.out.println("*-----------------------------------*");
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        if (utilidades.ehMaiorDeIdade(idade)) {
            System.out.println("A pessoa é maior de idade.");
        } else {
            System.out.println("A pessoa é menor de idade.");
        }

        System.out.println("*-----------------------------------*");
        System.out.println(utilidades.somar(2, 4));
        System.out.println(utilidades.somar(3, 4, 5));
        System.out.println(utilidades.somar(3.5, 5.6));

        System.out.println("*-----------------------------------*");
        System.out.println(utilidades.saudacao());
        System.out.println(utilidades.saudacao("Pamela"));


    }

        static void mostrarBoasVindas(String msg){
                System.out.println(msg);
        }
    }

