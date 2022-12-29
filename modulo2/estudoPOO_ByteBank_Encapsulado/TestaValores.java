package estudoPOO_ByteBank_Encapsulado;

public class TestaValores {
    public static void main(String[] args) {

        Conta conta = new Conta(1015,534358);
        Conta conta2 = new Conta(1015,534358);

        //conta está inconsistente
//        conta.setAgencia(-50);
//        conta.setNumero(-1200);
        System.out.println(Conta.getTotal());
    }
}
