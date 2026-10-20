package moduloPOO.atividadeRevisao;

public class Desenvolvedor extends Funcionario{

    public Desenvolvedor(String nome, double salariobase){
        super(nome, salariobase);
    }
    @Override
    public double calcularSalario() {
        return getSalarioBase() * 1.20;
    }
}
