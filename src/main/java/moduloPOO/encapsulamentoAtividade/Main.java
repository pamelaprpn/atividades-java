package moduloPOO.encapsulamentoAtividade;

import moduloPOO.polimorfismoAtividade.Professora;

public class Main {
    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria();

        conta1.setTitular("Anna");
        conta1.depositar(500);
        conta1.depositar(-100);
        conta1.sacar(2000);
        conta1.sacar(200);

        Produto caneta = new Produto();
        System.out.println(caneta.nome);
        System.out.println(caneta.preco);
        System.out.println(caneta.getCodigoInterno());

        conta1.getNumeroConta();

    }
}
