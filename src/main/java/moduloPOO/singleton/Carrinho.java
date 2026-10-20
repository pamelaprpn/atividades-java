package moduloPOO.singleton;

public class Carrinho {
    private int quantidadeItens = 0;

    private static Carrinho instancia;

    private Carrinho(){

    }

    public static Carrinho getInstance(){
        if(instancia == null){
            instancia = new Carrinho();
        }
        return instancia;
    }

    public void adicionarItem(){
        System.out.println("Quantidade: " + (quantidadeItens += 1));
    }

    public int getQuantidadeItens(){
        return quantidadeItens;
    }
}
