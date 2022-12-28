package estudoOrientacaoAObjeto;

public class TestaMetodo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.titular = "Lucas Gabriel";
        conta.saldo=50;
        //deposita
        conta.deposita(100);
        System.out.println(conta.saldo);
        //saca
        boolean statusDoSaque = conta.saca(50);
        System.out.println(conta.saldo);
        System.out.println(statusDoSaque);
        //nova conta
        Conta contaPedro = new Conta();
        contaPedro.titular = "Pedro Darmaceno";
        contaPedro.deposita(1000);
        //transfere
        if (contaPedro.transfere(200,conta)){
            System.out.println("trânsferido com sucesso");
        }else {
            System.out.println("Saldo insuficiênte");
        }
        System.out.printf("%s seu saldo R$ %.2f %n",contaPedro.titular,contaPedro.saldo);
        System.out.printf("%s seu saldo R$ %.2f",conta.titular,conta.saldo);

    }
}
