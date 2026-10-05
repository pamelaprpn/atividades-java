package methodosAtividade;

public class Utilidades {

    public void saudar(String nome){
        System.out.println("Olá, " + nome + "! Tudo bem?");

    }

    public int dobro(int numero){
        return numero * 2;
    }

    public double calcularMedia(double n1, double n2){
        return (n1 + n2) / 2;
    }

    public boolean ehMaiorDeIdade(int idade){
        if(idade >= 18){
            return true;
        }else{
            return false;
        }
    }

    public int somar(int n1, int n2){
        return n1 + n2;
    }

    public int somar(int n1, int n2, int n3){
        return n1 + n2 + n3;
    }

    public double somar(double n1, double n2){
        return n1 + n2;
    }

    public String saudacao (){
        return  "Olá";
    }

    public String saudacao(String nome){
        return "Olá, " + nome + "!";
    }

}
