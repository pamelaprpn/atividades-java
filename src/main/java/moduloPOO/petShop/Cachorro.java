package moduloPOO.petShop;

public class Cachorro extends Pet{

    @Override
    public void emitirSom() {
        System.out.println(nome + " faz: Au au!");
    }
}
