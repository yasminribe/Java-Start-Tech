package estudoTratamentoErros;

public class TestaContaExcecaoChecked {
    public static void main(String[] args) {

    Conta c = new Conta();
    try {

    c.deposita() ;
    }catch (MinhaExcecao ex){
        System.out.println("tratamento .... ");
    }catch (Exception ex){
        System.out.println("tratamento de todas as exceções");
    }
    }
}
