package moduloPOO.polimorfismoAtividade;

public class Painel {

    public void exibir(String msg){
        System.out.println("Mensagem do Painel: " + msg);
    }

    public void exibir(boolean ativo){
        if(ativo){
            System.out.println("Painel está ativo");
        }else{
            System.out.println("Painel está desativado");
        }
    }

    public void exibir(int valor){
        System.out.println("Nível de brilho do painel: " + valor);
    }

    public void exibir(double temp){
        System.out.printf("Temperatura do painel: %.1f °C%n", temp);
    }


}
