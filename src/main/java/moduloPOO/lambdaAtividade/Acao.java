package moduloPOO.lambdaAtividade;

@FunctionalInterface
public interface Acao {
    void executar();

    static void repetir(Acao acao){
        acao.executar();
        acao.executar();
    }
}
