package moduloPOO.polimorfismoAtividade;

public class Main {
    public static void main(String[] args) {

        Calculadora calcularArea = new Calculadora();
        calcularArea.calcularArea(6);
        calcularArea.calcularArea(2.5, 5);
        calcularArea.calcularArea(2.5);

        System.out.println("*-------------Exercicio 2--------------------*");
        Painel painel = new Painel();
        painel.exibir("Monitor ligado");
        painel.exibir(7);
        painel.exibir(true);
        painel.exibir(19.5);

        System.out.println("*-------------Exercicio 3--------------------*");
        Aluna ana = new Aluna();
        ana.nome = "Ana";
        ana.idade = 20;
        ana.curso = "Engenharia";

        Professora flora = new Professora();
        flora.nome = "Flora";
        flora.idade = 30;
        flora.diciplina = "Java e IA";

        ana.apresentar();
        ana.estudar();

        flora.apresentar();
        flora.lancarNota(ana.nome, 9.5);

        System.out.println("*-------------Exercicio 4--------------------*");
        Estagiaria julia = new Estagiaria();
        julia.nome = "Julia";
        julia.idade = 22;

        Pessoa pessoa = julia;
        pessoa.apresentar();

        System.out.println("*-------------Exercicio 5--------------------*");
        mostrarFicha(ana);
        mostrarFicha(flora);
        mostrarFicha(julia);

        System.out.println("*-------------Exercicio 6--------------------*");
        MeioDePagamento forma;

        forma = new Pix();
        forma.pagar(150.00);

        forma = new Boleto();
        forma.pagar(150.00);


    }

    static void mostrarFicha(Pessoa p) {
        p.apresentar();
    }

}
