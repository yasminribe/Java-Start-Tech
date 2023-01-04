package estudoPOO_herdado_conta;

public class ContaCorrente extends Conta {
    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

    @Override //é importante utilizarmos o @Override,
    // assim, o compilador sabe que a intenção é de sobrescrever o método
    public void saca(double valor) throws SaldoInsuficienteException {
        super.saca(valor + 0.20);
    }
}
