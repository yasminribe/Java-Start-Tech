public class atvargs1 {
    public static void main(String[] args) {
        int anoNascimento =Integer.parseInt(args[0]), anoAtual = Integer.parseInt(args[1]),
                idade = anoAtual - anoNascimento;
        System.out.printf("O ano de nascimento informado é %d. %nA pessoa tem " +
                "(ou vai completar) %d anos",anoNascimento,idade);
    }
}
