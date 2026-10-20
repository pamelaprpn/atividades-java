package moduloPOO.atividadeRevisao;

public class Retangulo extends Forma{
    private double largura;
    private double altura;

    public Retangulo(String nome){
        super(nome);
    }

    @Override
    public double calcularArea() {
        return largura * altura;
    }
}
