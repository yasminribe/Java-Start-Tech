package estudoPOO_byteBank_herdado;

public class Administrador extends Funcionario implements Autenticador {
    @Override
    public double getBonificacao() {
        return 50;
    }

    private int senha;
    @Override
    public int setSenha(int senha) {
        return this.senha = senha;
    }

    @Override
    public boolean autentica(int senha) {
        if (this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }
}
