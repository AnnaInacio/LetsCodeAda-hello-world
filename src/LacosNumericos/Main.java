package LacosNumericos;

public class Main {
    public static void main(String[] args) {
        numeros();
        tabuada();
    }

    public static void numeros() {
        // 1 a 10
        // para uma variável que inicia em 1 e vai até 10, mudando 1-por-1, faça:
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void tabuada() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(j + "x" + i + " = " + j * i);
            }
        }
    }
}
