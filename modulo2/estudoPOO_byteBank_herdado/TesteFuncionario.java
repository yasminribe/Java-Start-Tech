package estudoPOO_byteBank_herdado;

public class TesteFuncionario {
    public static void main(String[] args) {
        Gerente funcionario = new Gerente();
        funcionario.setNome("nico");
        funcionario.setCpf("446.658.589.11");
        funcionario.setSalario(2200);
        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getCpf());
        System.out.println(funcionario.getSalario());
        System.out.println(funcionario.getBonificacao());
    }
}
