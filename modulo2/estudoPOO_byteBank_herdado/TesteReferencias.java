package estudoPOO_byteBank_herdado;

public class TesteReferencias {
    public static void main(String[] args) {
        Funcionario g1 = new Gerente();
        g1.setNome("Lucas");
        // g1.autentica(); não vai compilar pois a referencia é do tipo funcionario
        // então só pode ser chamado métodos definidos dentro da classe funcionario
        System.out.println(g1.getNome());

        Gerente g2 = new Gerente();
        g2.setNome("Marcos");
        g2.setSalario(5000.0);

        Funcionario f1 = new Funcionario();
        f1.setNome("Pedro");
        f1.setSalario(3000);

        EditorVideo editor = new EditorVideo();
        editor.setSalario(2000);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g2);
        controle.registra(f1);
        controle.registra(editor);
        System.out.println(controle.getSoma());
    }
}
