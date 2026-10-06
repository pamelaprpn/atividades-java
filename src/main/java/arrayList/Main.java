package arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<>();
        nomes.addAll(List.of("Maria", "Pamela", "Patricia"));
        System.out.println( nomes );

        ArrayList<String> frutas = new ArrayList<>(List.of("Maça", "Banana", "Melão", "Uva"));
        System.out.println("Primeira posição: " + frutas.getFirst() + ". Ultima posição: " + frutas.getLast() + ". Tamanho da lista: " + frutas.size());

        nomes.add("Júlia");
        nomes.set(1, "João");
        System.out.println(nomes);

        ArrayList<String> cidades = new ArrayList<>(List.of("São Paulo", "Itajubá", "Pouso Alegre", "Monte Sião"));
        cidades.remove(0);
        System.out.println(cidades);

        nomes.addAll(List.of("Rafaela", "Túlio"));
        for(int i = 0; i < nomes.size(); i++){
            System.out.println(i + ": " + nomes.get(i));
        }

        nomes.removeLast();
        System.out.println("Digite um nome: ");
        String name = sc.nextLine();

        if(nomes.contains(name)){
            System.out.println("Esta na lista, na posição "+ nomes.indexOf(name));
        }else{
            System.out.println("Não está lista");
        }


        }

    }