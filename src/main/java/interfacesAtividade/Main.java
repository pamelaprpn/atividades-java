package interfacesAtividade;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Animal lola = new Cachorro();
        Animal jujuba = new Gato();

        lola.emitirSom();
        jujuba.emitirSom();
        System.out.println("*-----------------------------*");

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Cachorro());
        animals.add(new Gato());

        for(Animal animal : animals){
            animal.emitirSom();
        }

        System.out.println("*-----------------------------*");
        ArrayList<Notificacao> notificacoes = new ArrayList<>();
        notificacoes.add(new Email());
        notificacoes.add(new Sms());

        for(Notificacao notifica : notificacoes){
            notifica.enviar("Sua compra foi aprovada!");
        }

        System.out.println("*-----------------------------*");
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(new Carro());
        veiculos.add(new Moto());

        for(Veiculo modoVeiculo : veiculos){
            modoVeiculo.ligar();
            modoVeiculo.acelerar();
        }

    }
}
