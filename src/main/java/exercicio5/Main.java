package exercicio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i=0; i < 3; i++){

            Produto produto = new Produto();

            System.out.println("Digite o nome do produto: ");
            produto.nome = sc.nextLine();

            System.out.println("Digite o preço do produto: ");
            produto.preco = sc.nextDouble();

            sc.nextLine();

            if( produto.preco > 100){
                System.out.println("Produto caro!");
            }else{
                System.out.println("Produto com preço acessível!");
            }

            System.out.printf("Produto: %s | Preço: R$ %.2f%n", produto.nome, produto.preco);
        }

    }

}
