package estudoPOO_byteBank_herdado;
//gerente é um funcionario --- gerente herda da classe funcionario
public class Gerente extends Funcionario{
    private int senha;

    public boolean autentica(int senha){
        return this.getSenha() == senha;

    }
    public double getBonificacao(){
        return super.getBonificao() + super.getSalario(); //super quando vem de outra classe
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
}

