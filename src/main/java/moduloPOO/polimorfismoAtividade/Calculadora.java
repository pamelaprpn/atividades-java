package moduloPOO.polimorfismoAtividade;

public class Calculadora {

    public void calcularArea(double lado){
        System.out.printf("lado ao quadrado: %.2f%n" , lado * lado);
    }

    public void calcularArea(double base, double altura){
        System.out.printf("Base x altura: %.2f%n" , base * altura);
    }

    public void calcularArea(int raio){
        System.out.printf("Calcula o raio: %.2f%n" , (3.14159 * raio * raio));
    }

}
