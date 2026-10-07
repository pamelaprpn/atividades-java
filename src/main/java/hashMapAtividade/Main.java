package hashMapAtividade;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> pessoa = new HashMap<>();
        pessoa.put("Pamela", 35);
        pessoa.put("Joana", 30);
        pessoa.put("Diego", 18);

        System.out.println(pessoa);
        System.out.println(pessoa.get("Pamela"));

        HashMap<String, Double> produto = new HashMap<>();
        produto.put("Café", 5.00);
        System.out.println(produto);

        produto.put("Café", 7.50);
        System.out.println(produto);

        HashMap<String, String> agenda = new HashMap<>();
        agenda.put("Pamela", "35 99965-7858");
        agenda.put("Maria", "11 98685-4582");

        String nome = "Pamela";

        if(agenda.containsKey(nome)){
            System.out.println("Está na agenda");
        }else {
            System.out.println("Não está na agenda");
        }

        HashMap<String, Integer> estoque = new HashMap<>();
        estoque.put("Leite", 10);
        estoque.put("Chocolate", 4);

        System.out.println(estoque.getOrDefault("Leite", 0));
        System.out.println(estoque.getOrDefault("Pão", 0));
        System.out.println(estoque.get("Pão"));

        HashMap<String, Double> notas = new HashMap<>();
        notas.put("Maria", 7.5);
        notas.put("Carla", 5.0);
        notas.put("João", 3.5);

        System.out.println(notas);
        System.out.println(notas.size());
        notas.remove("Carla");
        System.out.println(notas);

    }
}
