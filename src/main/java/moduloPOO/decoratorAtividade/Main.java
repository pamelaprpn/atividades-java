package moduloPOO.decoratorAtividade;

public class Main {
    public static void main(String[] args) {

        Acai acai = new AcaiSimples();
        acai = new AcaiComGranola(acai);

        System.out.println(acai.getDescricao());
        System.out.println(acai.getPreco());
    }
}
