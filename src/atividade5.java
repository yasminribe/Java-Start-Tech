//5. Converter de celsius para farenheit

public class atividade5 {
    public static void main(String[] args) {
        double celsius = 32.5, f = (celsius * 9/5)+32;
        System.out.printf("A temperatura informada é %.1fºC.\n" +
                "O valor convetido é %.1fºF.",celsius,f);
    }
}
