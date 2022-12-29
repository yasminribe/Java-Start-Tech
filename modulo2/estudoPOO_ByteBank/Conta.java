package estudoPOO_ByteBank;

public class Conta {
    private double saldo;
    int agencia;
    int numero;
    public Cliente titula;

    //sem retorno
    public void deposita(double valor){
        this.saldo += valor;
    }

   public boolean saca(double valor) {
       if (this.saldo >= valor) {
           this.saldo -= valor;
           return true;
       }
       return false;
    }
    public boolean transfere(double valor, Conta destino){
        if (this.saldo >= valor){
            saca(valor);
            destino.deposita(valor);
            return true;
        }
        return false;
    }
//   public double pegaSaldo(){
//        return this.saldo;
//    }


    public double getSaldo() {
        return this.saldo;
    }

}

