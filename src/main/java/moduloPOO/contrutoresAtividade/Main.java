package moduloPOO.contrutoresAtividade;

public class Main {
    public static void main(String[] args) {

        Agendamento thor = Agendamento.builder().nomePet("Thor").servico("banho").horario("14h")
                .perfume(true).laco(true).hidratacao(false).observacao("alérgico a shampoo").desconto(10).build();

        Agendamento luna = Agendamento.builder().nomePet("Luna").servico("tosa").horario("10h")
                .perfume(false).laco(false).hidratacao(false).observacao(null).desconto(0).build();

        Agendamento mel = Agendamento.builder().nomePet("Mel").servico("banho").horario("16h")
                .perfume(false).laco(false).hidratacao(true).observacao(null).desconto(0).build();

        thor.mostrar();
        luna.mostrar();
        mel.mostrar();

    }
}

