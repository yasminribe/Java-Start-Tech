package estudoPOO_byteBank_herdado;

public class TesteGerente {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setNome("Alberto melo");
        gerente.setCpf("564.582.111-88");
        gerente.setSalario(5000.0);

        System.out.printf("Nome: %s%nCPF: %s%nSalario R$ %.2f%n",gerente.getNome(),gerente.getCpf(),gerente.getSalario());
        gerente.setSenha(5555);
        System.out.println("Senha de autenticação: " +gerente.autentica(5555));
        System.out.println("Bomificação R$ "+ gerente.getBonificacao());

    }
}
