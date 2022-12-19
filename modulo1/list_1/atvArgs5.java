package list_1;

public class atvArgs5 {
    public static void main(String[] args) {
        double celsius = Double.parseDouble(args[0]), f = (celsius * 9/5)+32;
        System.out.printf("A temperatura informada é %.1fºC.\n" +
                "O valor convetido é %.1fºF.",celsius,f);
    }
}
