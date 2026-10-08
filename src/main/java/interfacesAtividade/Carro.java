package interfacesAtividade;

public class Carro implements Veiculo{

    @Override
    public void ligar() {
        System.out.println("Ligando carro");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando carro");
    }
}
