package testesAtividade;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraDescontoTest {
    @Test
    void deveManterValorParaClienteComum() {
        CalculadoraDesconto calculadora =
                new CalculadoraDesconto();

        double valorCompra = 50.0;

        double resultado =
                calculadora.aplicarDesconto(valorCompra, false);

        assertEquals(50.0, resultado);
    }

    @Test
    void deveAplicarDescontoParaClienteVip() {
        CalculadoraDesconto calculadora =
                new CalculadoraDesconto();

        double valorCompra = 200.0;


        double resultado =
                calculadora.aplicarDesconto(valorCompra, true);


        assertEquals(180.0, resultado);
    }

    @Test
    void deveLancarExcecaoParaValorNegativo() {
        CalculadoraDesconto calculadora =
                new CalculadoraDesconto();

        assertThrows(
                IllegalArgumentException.class,
                () -> calculadora.aplicarDesconto(-10.0, false)
        );
    }
}
