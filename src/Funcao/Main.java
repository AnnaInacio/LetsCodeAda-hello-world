package Funcao;

public class Main {
    public static void main(String[] args) {

        String nomeOriginal = "Anna";
        saudacao(nomeOriginal);

        int resultado = soma(2, 3);
        System.out.println("\n" + resultado);
    }

    public static void saudacao(String nomeParametro) {
        System.out.println("Hello, " + nomeParametro);
    }

    public static int soma(int a, int b) {
        return a + b;
    }
}
