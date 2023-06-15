package Variaveis;

public class Main {
    public static void main(String[] args) {
        tipoTexto();
        tipoNumerico();
    }

    // Tipo de dado: TEXTO
    public static void tipoTexto() {
        String nome;
        nome = "Anna";
        System.out.println("[Exemplo] Tipo de dado: TEXTO");
        System.out.println("Olá, " + nome + "\n");
    }

    // Tipo de dado: NUMÉRICO
    public static void tipoNumerico() {
        int a;
        int b = 2;
        a = 3;

        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        float divisao = (float) a / b;

        System.out.println("[Exemplo] Tipo de dado: NUMÉRICO - Números [" + a + "]" + "[" + b + "]");
        System.out.println("SOMA: " + soma);
        System.out.println("SUBTRAÇÃO: " + subtracao);
        System.out.println("MULTIPLICAÇÃO: " + multiplicacao);
        System.out.println("DIVISÃO: " + divisao + "\n");
    }
}
