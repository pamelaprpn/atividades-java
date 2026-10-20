package moduloPOO.atividadeRevisao;

public class Main {
    public static void main(String[] args) {

        Produto produto = new Produto();

        produto.setNome("Notebook");
        produto.setPreco(3500.00);
        produto.setQuantidade(10);

        produto.setPreco(-500.00);

        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preço: R$ " + produto.getPreco());
        System.out.println("Quantidade: " + produto.getQuantidade());

        System.out.println("-----------------Exercicio retangulo---------------------------");
        Retangulo retangulo = new Retangulo("Retangulo"); //como a classe Forma possui um contrutor que recebe nome, precisa chamar esse contrutor na classe filha
        retangulo.exibirNome();
        retangulo.calcularArea();

       //Forma f = new Forma("teste"); // O código apresenta um erro de compilação porque uma classe abstrata não pode ser instanciada diretamente.

        System.out.println("------------Exercicio Sistema de funcionarios-------------------");
        Desenvolvedor pam = new Desenvolvedor("Pamela", 7000);
        Gerente flora = new Gerente("Flora", 10000);
        FolhaPagamento folhaEmail = new FolhaPagamento(new NotificadorEmail());
        folhaEmail.pagar(pam);
        folhaEmail.pagar(flora);

        FolhaPagamento folhaSms = new FolhaPagamento(new NotificadorSms());
        folhaSms.pagar(pam);
        folhaSms.pagar(flora);




    }
}
