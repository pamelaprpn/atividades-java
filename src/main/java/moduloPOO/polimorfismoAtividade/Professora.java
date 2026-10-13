package moduloPOO.polimorfismoAtividade;

import moduloPOO.polimorfismoAtividade.Pessoa;

public class Professora extends Pessoa {

    String diciplina;

    public void lancarNota(String aluna, double nota) {
        System.out.printf("Flora lançou nota %.1f para %s%n", nota, aluna);
    }


}
