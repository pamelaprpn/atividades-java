package interfacesAtividade;

public class Moto implements Veiculo{

    @Override
    public void ligar() {
        System.out.println("Ligando moto");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando moto");
    }
}
