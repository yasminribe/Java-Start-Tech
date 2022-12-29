package estudoPOO_ByteBank;


public class TesteSacaValoresNegativos {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.deposita(100);
        c1.saca(200);
        System.out.println(c1.getSaldo());

        //proibido:
//        c1.saldo -= 101;
//        System.out.println(c1.saldo);

    }
}
