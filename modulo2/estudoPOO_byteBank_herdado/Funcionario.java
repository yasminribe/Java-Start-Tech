package estudoPOO_byteBank_herdado;

public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    //protected double salario; apenas visivel para a prorpria classe e os filhos


    public double getBonificao(){
        return this.getSalario()*0.1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
