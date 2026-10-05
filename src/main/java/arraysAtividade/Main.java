package arraysAtividade;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] nomes = { "Maria", "João", "Pamela", "Rafaela", "katia"};
        int[] notas = {8, 6, 10, 7, 9};
        int soma = 0;
        int[] numeros = new int[5];

        for(int i=0; i < nomes.length; i += 2){
            System.out.println(nomes[i]);
        }

        System.out.println("*--------------------------------*");

        for(int i=0; i < notas.length; i++){

            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
            soma = soma + notas[i];
        }

        System.out.println("*--------------------------------*");
        System.out.println("A soma das notas é: " + soma);
        System.out.println("A media das notas é: " + soma/ notas.length);


        System.out.println("*--------------------------------*");
       for (int i=0; i < numeros.length; i++){
            System.out.println("Digite numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
       }

        System.out.println("*--------------------------------*");
        System.out.println("Array invertido: ");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

    }
}
