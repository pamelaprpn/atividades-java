package moduloPOO.lambdaAtividade;

@FunctionalInterface
public interface Condicao {
    boolean testar(int n);

    static void executarSe(Condicao cond, int valor, Acao acao) {
        if (cond.testar(valor)) {
            acao.executar();
        }
    }
}
