package moduloPOO.contrutoresAtividade;

public class Main {
    public static void main(String[] args) {

        Agendamento thor = new Agendamento(
                "Thor", "banho", "14h",
                true, true, false,
                "alérgico a shampoo", 10
        );

        Agendamento luna = new Agendamento(
                "Luna", "tosa", "10h",
                false, false, false,
                null, 0
        );

        Agendamento mel = new Agendamento(
                "Mel", "banho", "16h",
                false, false, true,
                null, 0
        );

        thor.mostrar();
        luna.mostrar();
        mel.mostrar();
    }
}

