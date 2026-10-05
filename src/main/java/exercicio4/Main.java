package exercicio4;

public class Main {
    public static void main(String[] args) {
        Pet cachorro = new Pet();
        Pet gato = new Pet();

        cachorro.nome = "Lolita";
        cachorro.raca = "Shih Tzu";
        cachorro.peso = 9.50;

        gato.nome = "Chico";
        gato.raca = "Siamês";
        gato.peso = 5.20;


        System.out.println("Cachorro: " + cachorro.nome + ", Peso: " + cachorro.peso + ", raça: " + cachorro.raca);
        System.out.println("Gato: " + gato.nome + ", Peso: " + gato.peso + ", raça: " + gato.raca);

    }
}
