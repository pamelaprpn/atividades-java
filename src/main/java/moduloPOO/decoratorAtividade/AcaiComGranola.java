package moduloPOO.decoratorAtividade;

public class AcaiComGranola extends AcaiDecorator {

    public AcaiComGranola(Acai acai){
        super(acai);
    }

    @Override
    public String getDescricao() {
        return acaiEmbrulhado.getDescricao() + " + Granola";
    }

    @Override
    public double getPreco() {
        return acaiEmbrulhado.getPreco() +  3.00;
    }
}
