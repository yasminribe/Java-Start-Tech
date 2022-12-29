package banco;

import java.util.Objects;

public class ContaBanco {
    public int numconta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t.equals("CC")) {
            this.setSaldo(50);
        } else if (t.equals("PP")) {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }
    public void estadoAtual(){
        System.out.println("------------------------------");
        System.out.println("Conta: " + this.getNumconta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo R$ " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
    }
    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("conta não pode ser fechada, ainda tem dinheiro");
        } else if (this.getSaldo() < 0) {
            System.out.println("Erro , conta em debito não pode ser fechada");
        } else {
            this.setStatus(false);
            System.out.println("conta fechada com sucesso!");
        }
    }

    public void depositar(double v) {
        if (this.isStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("deposito realizado com sucesso" +
                    "\n Conta: " + this.getDono());
        }else {
            System.out.println("Deposito invalido, conta fechada");
        }
    }

    public void sacar(double v) {
        if (this.isStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("saque efetuado");
            } else {
                System.out.println("Saldo insuficiente ");
            }
        } else {
            System.out.println("Conta fechada, impossivel sacar");
        }
    }

    public void pagarMensal() {
        int v = 0;
        if (this.getTipo() == "CC"){
            v = 12;
        }else if (this.getTipo() == "PP"){
            v = 20;
        }
        if (this.isStatus()){
            if (this.getSaldo() > 0){
                this.setSaldo(this.getSaldo()-v);
            }else {
                System.out.println("Saldo insuficiente");
            }
        }else {
            System.out.println("Impossivel efetuar pagamento");
        }
    }

    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public int getNumconta() {
        return numconta;
    }

    public void setNumconta(int numconta) {
        this.numconta = numconta;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
