package forEachAtividade;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        1. Crie um array (não arrayList, array normal) com 4 nomes e imprima todos usando for-each,
//                um por linha.
        String[] nomes = {"Pamela", "Maria", "João", "Pedro"};

        for(String nome : nomes){
            System.out.println("forEach: " + nome);
        }

//        2. Crie um ArrayList com 5 notas e imprima todas usando for-each.
        ArrayList<Integer> notas = new ArrayList<Integer>(List.of(10, 7, 5, 2, 9));

        for(int nota : notas){
            System.out.println(nota);
        }

//        3. Com o array de notas {8, 6, 10, 7}, use for-each para somar
//        todas e mostrar a soma e a média.
        int[] notasAluno = {8, 6, 10, 7};
        int soma = 0;

        for(int notaAluno : notasAluno){
            soma += notaAluno;
        }

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + soma / notasAluno.length);

//        4. Com um array de nomes, use for-each e um if para contar quantos
//        têm mais de 5 letras. Mostre o total. Dica: usem o método length.
        String[] nomesAluno = {"Pamela", "Maria", "João", "Pedro", "Larissa"};

        int total = 0;

        for(String nomeAluno : nomesAluno){
            if(nomeAluno.length() > 5){
                total++;
            }
        }

        System.out.println("Total de nomes com mais de 5 letras: " + total);

//        5. Pegue o exercício 1 e escreva ele DE NOVO com o for normal,
//                usando o índice. Deixe os dois na mesma classe e compare.
        for(int i=0; i < nomes.length; i++){
            System.out.println("for normal: " + nomes[i]);
        }



    }
}
