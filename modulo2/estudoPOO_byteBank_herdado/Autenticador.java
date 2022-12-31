package estudoPOO_byteBank_herdado;
//contrato Autenticador
//quem assinar esse contrato precisa implementar
//metodo setSenha
//metodo autentica
public abstract interface Autenticador {

    //    private int senha;
//
//    public boolean autentica(int senha){
//        return this.getSenha() == senha;
//
//    }
//
//    public int getSenha() {
//        return senha;
//    }
//
//    public void setSenha(int senha) {
//        this.senha = senha;
//    }
    public abstract int setSenha(int senha);

    public abstract boolean autentica(int senha);


}
