package moduloPOO.atividadeRevisao;

public abstract class Forma {
    String nome;

    public Forma(String nome){
        this.nome = nome;
    }

    public void exibirNome(){
        System.out.println("Nome da forma: " + nome);
    }

    public abstract double calcularArea();
}
