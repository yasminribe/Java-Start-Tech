package estudoPOO_byteBank_herdado;

public class EditorVideo extends Funcionario{

    public double getBonificacao(){
        return super.getBonificacao() + 100;
    }

}

