package exercicio1;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do lanche: ");
        String nomeLanche = sc.nextLine();

        System.out.println("Digite o valor do lanche: ");
        double valor = sc.nextDouble();

        if (valor > 30 ){
            System.out.printf("O lanche " + nomeLanche + " custa R$ %.2f%n", (valor - 5.00));
        }else{
            System.out.printf("O lanche " + nomeLanche + " custa R$ %.2f%n", (valor));
        }
    }
}
