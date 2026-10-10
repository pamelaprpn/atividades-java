package herancaAtividade;

public class Main {
    public static void main(String[] args) {

        Aluna maria = new Aluna();
        maria.nome = "Maria";
        maria.idade = 35;
        maria.apresentar();

        System.out.println("*-------------Exercicio 2------------*");
        Aluna pietra = new Aluna();
        pietra.nome = "Pietra";
        pietra.idade = 12;
        pietra.curso = "Engenharia da Computação";
        pietra.apresentar();
        pietra.estudar();


        Aluna mirela = new Aluna();
        Professora joana = new Professora();

        System.out.println("*--------------Exercicio 3----------*");
        mirela.nome = "Mirela";
        mirela.idade = 18;
        mirela.curso = "Direito";
        mirela.apresentar();
        mirela.estudar();

        System.out.println("*-----------Exercicio 4-------------*");
        joana.nome = "Joana";
        joana.idade = 45;
        joana.apresentar();
        joana.lancarNota("Mirela", 7);

        System.out.println("*-----------Exercicio 5-------------*");
        Diretora carla = new Diretora();
        carla.nome = "Carla";
        carla.definirMeta("Atrair alunos novos");
        carla.aprovarFerias("Marcos");

        System.out.println("*-----------Exercicio 6------------*");
        Gerente jonas = new Gerente();
        jonas.exportar();
        jonas.notificar("PIPIPI");
        jonas.baterPonto();
        jonas.aprovarFerias("Jonas");






    }
}
