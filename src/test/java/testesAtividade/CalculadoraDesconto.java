package testesAtividade;

public class CalculadoraDesconto {
    public double aplicarDesconto(
            double valorCompra,
            boolean clienteVip) {

        if (valorCompra <= 0) {
            throw new IllegalArgumentException(
                    "Valor inválido"
            );
        }

        if (clienteVip) {
            return valorCompra * 0.90;
        }

        return valorCompra;
    }
}
