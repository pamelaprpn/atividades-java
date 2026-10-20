package moduloPOO.atividadeRevisao;

public abstract class Funcionario {
    private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase){
        this.nome = nome;
        setSalarioBase(salarioBase);
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if(salarioBase < 0){
            System.out.println("Valor inválido");
        }
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();
}
