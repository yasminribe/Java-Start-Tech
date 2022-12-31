package estudoPOO_byteBank_herdado;

public class SistemaInterno {
    private int senha = 2222;
    public void autentica (Autenticador g){
      boolean autenticou =  g.autentica(this.senha);
        if (autenticou){
            System.out.println("Acesso liberado");
        }else {
            System.out.println("Acesso negado");
        }
    }
}

