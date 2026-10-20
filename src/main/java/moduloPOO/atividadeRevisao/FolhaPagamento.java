package moduloPOO.atividadeRevisao;

public class FolhaPagamento {

    private Notificador notificador;

    public FolhaPagamento(Notificador notificador){
        this.notificador = notificador;
    }

    public void pagar(Funcionario f){
        double salario = f.calcularSalario();
        notificador.notificar(
                "Funcionário: " + f.getNome() +
                        " | Salário: R$ " + salario
        );
    }
}
