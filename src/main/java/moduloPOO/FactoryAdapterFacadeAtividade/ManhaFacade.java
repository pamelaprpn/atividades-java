package moduloPOO.FactoryAdapterFacadeAtividade;

public class ManhaFacade {

    private Despertador despertador = new Despertador();
    private Cafeteira cafeteira = new Cafeteira();
    private Chuveiro chuveiro = new Chuveiro();

    public void acordar(){
        despertador.desligar();
        cafeteira.fazerCafe();
        chuveiro.ligar();
    }
}
