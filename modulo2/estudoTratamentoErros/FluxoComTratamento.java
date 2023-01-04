package estudoTratamentoErros;

public class FluxoComTratamento {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {

            metodo1();
        } catch (ArithmeticException | NullPointerException | MinhaExcecao e) {
            String msg = e.getMessage();
            System.out.println("Exception" + msg);
        }
        System.out.println("Fim do main");
    }


    private static void metodo1() throws MinhaExcecao {
        System.out.println("Ini do metodo1");
        metodo2();
    }

    private static void metodo2() throws MinhaExcecao {
        System.out.println("Ini do metodo2");

//        ArithmeticException e = new ArithmeticException(" ERRO VAZIO");
// não basta apenas instanciar a exceção é necessario lança-la atraves do THROW
//        throw new ArithmeticException(" ERRO VAZIO");
        throw new MinhaExcecao(" ERRO AQUI ESTA VAZIO");
//        System.out.println("Fim do metodo2");
    }
}

