package estudoTratamentoErros;

public class FluxoComError {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {

            metodo1();
        } catch (ArithmeticException | NullPointerException e) {
            String msg = e.getMessage();
            System.out.println("Exception" + msg);
        }
        System.out.println("Fim do main");
    }


    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
    }

    private static void metodo2() {
        System.out.println("chamando método 2");
        metodo2();
        System.out.println("fim método 2"); //gera um StackOverflowError
    }

}

