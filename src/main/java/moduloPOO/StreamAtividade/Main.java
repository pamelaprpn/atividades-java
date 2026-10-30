package moduloPOO.StreamAtividade;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("*------------------Atividade 1-------------------*");
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6);

        List<Integer> pares = numeros.stream()
                .filter(numero -> numero % 2 == 0)
                .toList();

        System.out.println(pares);

        System.out.println("*------------------Atividade 2-------------------*");
        List<String> frutas = List.of("banana", "maçã", "uva");

        frutas.stream()
                .map(fruta -> fruta.toUpperCase())
                .forEach(fruta -> System.out.println(fruta));

        System.out.println("*------------------Atividade 3-------------------*");
        List<String> cidades = List.of(
                "São Paulo",
                "Campinas",
                "Santos",
                "Sorocaba",
                "Belo Horizonte"
        );

        long quantidade = cidades.stream()
                .filter(cidade -> cidade.startsWith("S"))
                .count();

        System.out.println(quantidade);

    }
}
