package moduloPOO.FactoryAdapterFacadeAtividade;

public class Main {
    public static void main(String[] args) {

        System.out.println("*---------------Factory-----------------------*");
        AnimalFactory factory = new AnimalFactory();

        Animal cachorro = factory.getAnimal("cachorro");
        Animal gato = factory.getAnimal("gato");

        cachorro.emitirSom();
        gato.emitirSom();

        System.out.println("*---------------Adapter-----------------------*");
        //PayPalAPI pagamento = new PayPalAPI();
        // Não compila como Pagamento, pois PayPalAPI não implementa essa interface.

        Pagamento pagamento = new PayPalAdapter();
        pagamento.pagar();

        System.out.println("*---------------Facade-----------------------*");
        ManhaFacade manha = new ManhaFacade();
        manha.acordar();
    }
}
