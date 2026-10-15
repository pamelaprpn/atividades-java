package moduloPOO.encapsulamentoAtividade;

public class Produto {

    private String codigoInterno = "X-99";
    String nome = "Caneta";
    public double preco = 5.50;

    public String getCodigoInterno() {
        return codigoInterno;
    }

    public void setCodigoInterno(String codigoInterno) {
        this.codigoInterno = codigoInterno;
    }
}
