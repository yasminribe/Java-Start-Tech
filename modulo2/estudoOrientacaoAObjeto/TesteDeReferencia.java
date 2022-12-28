package estudoOrientacaoAObjeto;

public class TesteDeReferencia {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;

        System.out.println("saldo da conta R$ " + primeiraConta.saldo);

        //Referencia, o que altera em uma altera nas demais

        Conta segundaConta = primeiraConta;
        segundaConta.saldo += 100;

        System.out.println("saldo segunda R$ "+ segundaConta.saldo);

        if (primeiraConta == segundaConta){
            System.out.println("são a mesma conta");
        }
    }
}
