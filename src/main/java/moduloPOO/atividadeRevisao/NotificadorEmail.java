package moduloPOO.atividadeRevisao;

public class NotificadorEmail implements Notificador{

    @Override
    public void notificar(String mensagem) {
        System.out.println("Email enviado: " + mensagem);
    }
}
