package estudoPOO_byteBank_herdado;

public class ControleBonificacao {
    private double soma;

    public void registra(Funcionario f){
        this.soma += f.getBonificacao();

    }
    //NÃO PRECISA REPETIR OU FAZER UM METEDO PARA CADA PODE CRIAR UM É USAR UMA REFERENCIA GENERICA PARA TODOS
//    public void registra(EditorVideo e){
//        this.soma += e.getBonificacao();
//
//    }
//    public void registra(Gerente g){
//        this.soma += g.getBonificacao();
//
//    }



    public double getSoma() {
        return soma;
    }
}
