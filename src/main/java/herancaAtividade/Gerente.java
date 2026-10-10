package herancaAtividade;

public class Gerente extends Funcionario implements Notificavel, Exportavel{

    public void aprovarFerias(String quem){
        System.out.println("Quem aprova as férias? " + quem);
    }

    @Override
    public void notificar(String mensagem) {
        System.out.println("Notificando: " + mensagem);
    }

    @Override
    public void exportar() {
        System.out.println("Exportando");
    }
}
