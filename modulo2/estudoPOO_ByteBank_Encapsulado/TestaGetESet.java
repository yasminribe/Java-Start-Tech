package estudoPOO_ByteBank_Encapsulado;

public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta();
        // conta.numero = 1335; não compila

        conta.setNumero(133790);
        System.out.println("Conta: "+ conta.getNumero());
        conta.setAgencia(1051);
        System.out.println("Agência: "+ conta.getAgencia());

        Cliente bruno = new Cliente();
        //conta.tutular = bruno;
        bruno.setNome("Bruno Andrade");
        conta.setTitular(bruno);
        System.out.println(conta.getTitular().getNome());
        conta.getTitular().setProfissao("dentista");
        System.out.println(conta.getTitular().getProfissao());
    }
}
