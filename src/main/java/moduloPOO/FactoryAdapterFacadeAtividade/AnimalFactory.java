package moduloPOO.FactoryAdapterFacadeAtividade;

public class AnimalFactory {

    public Animal getAnimal(String tipo){
        if (tipo.equalsIgnoreCase("cachorro")) {
            return new Cachorro();
        } else if (tipo.equalsIgnoreCase("gato")) {
            return new Gato();
        }

        throw new IllegalArgumentException("Tipo de animal inválido: " + tipo);
    }
}
