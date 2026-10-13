package moduloPOO.petShop;

public class Pet {
    String nome;
    String especie;
    double peso;
    String porte;

    public String definirPorte(double peso){
        if(peso >= 25){
           return porte = "Grande";
        }else if(peso >=10){
            return porte = "Médio";
        }else {
            return porte = "Pequeno";
        }
    }

    public void emitirSom(){
        if(especie == "cachorro"){
            System.out.println(nome + " faz Auau");
        } else if (especie == "gato") {
            System.out.println(nome + " faz miau");
        }
    }
}
