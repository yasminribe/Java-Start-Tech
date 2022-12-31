package estudoPOO_herdado_conta;

public class Testecontas {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(254 , 10157);
        cc.deposita(100);

        ContaPoupanca cp = new ContaPoupanca(145 , 45879);
        cp.deposita(200);

        cc.transfere(10.0, cp);

        System.out.println("CC: "+cc.getSaldo());
        System.out.println("CP: "+cp.getSaldo());
    }
}
