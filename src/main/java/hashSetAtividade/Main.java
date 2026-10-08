package hashSetAtividade;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

//        1. Crie um HashSet de nomes e adicione quatro valores, sendo um deles
//        repetido. Imprima o conjunto e o tamanho. Repare no que aconteceu
//        com o repetido.
        HashSet<String> nomes = new HashSet<>();

        nomes.addAll(List.of("Pamela", "Raul", "Janaina", "Pamela"));
        System.out.println(nomes);
        System.out.println(nomes.size());

//        2. Crie um HashSet de cores usando addAll. Depois use contains dentro
//        de um if para avisar se a cor "verde" já está no conjunto ou não.
        HashSet<String> cores = new HashSet<>();
        cores.addAll(List.of("Azul", "Verde", "Vermelho"));
        System.out.println("Verde está no mapa? " + cores.contains("Verde"));

//        3. Crie um ArrayList com nomes repetidos. Use new HashSet<>(lista) para
//        tirar os repetidos. Imprima os dois e compare.
        ArrayList<String> nomesRepetido = new ArrayList<>(List.of("Maria", "João", "Maria", "Maria"));
        System.out.println("ArrayList: " + nomesRepetido);

        HashSet<String> nomeSemRepetido = new HashSet<>(nomesRepetido);
        System.out.println("HashSet: " + nomeSemRepetido);


//        4. Crie um HashSet com três CPFs e imprima. Depois remova um deles e
//        imprima de novo, junto com o tamanho.
        HashSet<String> cpfs = new HashSet<>(Set.of("158588985-45", "156789456-58", "156852456-23"));
        System.out.println("CPFs: " + cpfs);
        cpfs.remove("158588985-45");
        System.out.println("Remover um CPF: " + cpfs + ". Tamanho: " + cpfs.size());

//        5. Crie um HashSet com três frutas e percorra ele com for,
//        imprimindo uma por linha.
        HashSet<String> frutas = new HashSet<>(Set.of("Maça", "Banana", "Abacaxi"));
        for(String fruta : frutas){
            System.out.println(fruta);
        }

//        6. Crie um HashSet vazio. Imprima o isEmpty(). Adicione um valor e
//        imprima o isEmpty() de novo.
        HashSet<Integer> numero = new HashSet<>();
        System.out.println("Array vazio: " + numero.isEmpty());
        numero.add(4);
        System.out.println("Array com valor: " + numero.isEmpty());



    }
}
