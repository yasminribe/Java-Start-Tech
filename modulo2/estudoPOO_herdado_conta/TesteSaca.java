package estudoPOO_herdado_conta;

public class TesteSaca {
    public static void main(String[] args) {
        Conta conta = new ContaCorrente(125 , 2587);
        conta.deposita(200);
        try{
        conta.saca(210);
        }catch (Exception e){
            System.out.println("e: "+e.getMessage());
        }

        System.out.println(conta.getSaldo());

    }
}
