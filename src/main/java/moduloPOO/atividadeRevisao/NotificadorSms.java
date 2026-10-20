package moduloPOO.atividadeRevisao;

public class NotificadorSms implements Notificador{
    @Override
    public void notificar(String mensagem) {
        System.out.println("SMS enviado: " + mensagem);
    }
}
