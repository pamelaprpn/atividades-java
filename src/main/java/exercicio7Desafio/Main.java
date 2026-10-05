package exercicio7Desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int quantidadeAlunas = 0;
        int opcao;
        Aluna aluna = new Aluna();


        do{
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Para continuar");
            System.out.println("2 - Para sair");
            System.out.print("Deseja iniciar? ");

            opcao = sc.nextInt();



            switch (opcao){
                case 1:


                    do {
                        System.out.println("Digite a primeira nota: ");
                        aluna.nota1 = sc.nextDouble();
                    } while (aluna.nota1 < 0 || aluna.nota1 > 10);

                    do {
                        System.out.println("Digite a segunda nota: ");
                        aluna.nota2 = sc.nextDouble();
                    } while (aluna.nota2 < 0 || aluna.nota2 > 10);

                    sc.nextLine();

                    System.out.println("Digite seu nome: ");
                    aluna.nome = sc.nextLine();

                    aluna.media = (aluna.nota1 + aluna.nota2) / 2;

                    quantidadeAlunas++;

                    if( aluna.media >= 6 ) {
                        aluna.alunoPassou = true;
                    }else {
                        aluna.alunoPassou = false;
                    }

                    System.out.printf("O nome da aluna é " + aluna.nome + " , sua primeira nota foi " + aluna.nota1 + " , sua segunda nota foi " + aluna.nota2 + " e sua média foi " + aluna.media);

                    if(aluna.alunoPassou) {
                        System.out.println(" Aprovada!");
                    }else {
                        System.out.println(" Reprovada!");
                    }
                    break;
                case 2:
                    System.out.println("Quantidade de alunas cadastradas: " + quantidadeAlunas);
                    System.out.println("Encerrando o sistema. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida");



            }



        }while(opcao != 2);

    }

}
