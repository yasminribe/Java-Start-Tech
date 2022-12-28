package estudoOrientacaoAObjeto;

public class CriaConta {
    public static void main(String[] args) {
        Conta contaPaulo = new Conta();
        contaPaulo.saldo= 200;
        contaPaulo.saldo += 100;
        System.out.println("Paulo seu saldo R$ "+contaPaulo.saldo);

        Conta contaJulia = new Conta();
        contaJulia.saldo=50;
        System.out.println("Julia seu saldo R$ "+contaJulia.saldo);
        System.out.println(contaPaulo.agencia);
        System.out.println(contaPaulo.numero);

    }
}
