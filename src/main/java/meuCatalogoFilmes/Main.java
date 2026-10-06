package meuCatalogoFilmes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Filme filme = new Filme();

        int opcao;

        do {
            System.out.println("\n--- MEU CATÁLOGO ---");
            System.out.println("1 - Cadastrar filme");
            System.out.println("2 - Listar filmes");
            System.out.println("3 - Buscar por título");
            System.out.println("4 - Estatísticas");
            System.out.println("5 - Sair");
            System.out.print("Digite uma opção: ");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o titulo do filme: ");
                    filme.titulo = sc.nextLine();

                    System.out.println("Digite o gênero do filme: ");
                    filme.genero = sc.nextLine().toUpperCase();

                    System.out.println("Digite a nota do filme: ");
                    filme.nota = sc.nextInt();

                    if (filme.nota >= 8) {
                        filme.classificacao = "Ótimo";
                    } else if (filme.nota >= 5) {
                        filme.classificacao = "Bom";
                    } else {
                        filme.classificacao = "Ruim";
                    }
                    break;
                case 2:
                    System.out.println("Você escolheu ver calças.");
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }while (opcao != 3);
    }
}
