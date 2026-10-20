package moduloPOO.singleton;

public class Main {
    public static void main(String[] args) {

        System.out.println("*---------------Exercicio 6-----------------------*");
        ContadorVisitas pagina1 = ContadorVisitas.getInstance();
        ContadorVisitas pagina2 = ContadorVisitas.getInstance();
        ContadorVisitas pagina3 = ContadorVisitas.getInstance();

        pagina1.registrarVisita();
        System.out.println(pagina1.getTotal());

        pagina2.registrarVisita();
        System.out.println(pagina2.getTotal());

        pagina3.registrarVisita();
        System.out.println(pagina3.getTotal());

        System.out.println("*---------------Exercicio 7-----------------------*");
        Carrinho item1 = Carrinho.getInstance();
        Carrinho item2 = Carrinho.getInstance();
        Carrinho item3 = Carrinho.getInstance();
        Carrinho item4 = Carrinho.getInstance();

        item1.adicionarItem();
        System.out.println(item1.getQuantidadeItens());

        item2.adicionarItem();
        System.out.println(item2.getQuantidadeItens());

        item3.adicionarItem();
        System.out.println(item3.getQuantidadeItens());

        item4.adicionarItem();
        System.out.println(item4.getQuantidadeItens());



    }
}
