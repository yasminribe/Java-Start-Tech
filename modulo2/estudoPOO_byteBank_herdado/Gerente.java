package estudoPOO_byteBank_herdado;
//gerente é um funcionario --- gerente herda da classe funcionario
public class Gerente extends Funcionario implements Autenticador{

    public double getBonificacao(){
        return super.getSalario(); //super quando vem de outra classe
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

