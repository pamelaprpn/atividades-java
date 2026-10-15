package moduloPOO.encapsulamentoAtividade;

public class ContaBancaria {
    private String titular;
    private double saldo;
    private String numeroConta = "001-X";

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        if(titular == null || titular.isEmpty()){
            System.out.println("Inválido! Mantido " + this.titular);
            return;
        }
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor){
        if(valor <= 0){
           System.out.println(" Valor inválido!");
           return;
        }

        saldo = saldo + valor;
        registrarLog("Deposito de " + valor);
        System.out.println("Saldo: " + saldo);

    }

    public void sacar(double valor){
        if (valor <= 0) {
            System.out.println("Valor inválido!");
            return;
        }

        if(!temSaldo(valor)){
            System.out.println("Saldo insuficiente!");
            return;
        }

        saldo -= valor;
        registrarLog("Saque de " + valor);
        System.out.println("Saldo: " + saldo);

    }

    private boolean temSaldo(double valor){
      return saldo >= valor;
    }

    private void registrarLog(String acao){
        System.out.println("[LOG] "+ titular + ": " + acao);
    }
}
