package Condicionais;

public class Main {
    public static void main(String[] args) {

        ifElse();
        ifElseIf();
        switchCase();
    }

    static int nota = 100;
    static String graduacao;

    public static void ifElse() {
        // se nota maior ou igual a 70 - APROVADO
        // IF-ELSE
        System.out.println("Estrutura Condicional: IF-ELSE");
        if (nota >= 70) {
            System.out.println("APROVADO");
        } else {
            System.out.println("REPROVADO");
        }
    }

    public static void ifElseIf() {
        // A:80  B:70  C:60  D:0
        // IF-ELSEIF
        System.out.println("\n" + "Estrutura Condicional: IF-ELSEIF");
        if (nota >= 80) { //A
            System.out.println("Graduação A");
        } else if (nota < 80 && nota >= 70) {
            System.out.println("Graduação B");
        } else if (nota < 70 && nota >= 60) {
            System.out.println("Graduação C");
        } else if (nota < 60 && nota >= 0) {
            System.out.println("Graduação D");
        } else {
            System.out.println("Nota inválida");
        }
    }

    public static void switchCase() {
        // A:80  B:70  C:60  D:0
        // SWITCH
        System.out.println("\n" + "Estrutura Condicional: SWITCH");
        if (nota >= 80) { //A
            graduacao = "A";
        } else if (nota < 80 && nota >= 70) {
            graduacao = "B";
        } else if (nota < 70 && nota >= 60) {
            graduacao = "C";
        } else if (nota < 60 && nota >= 0) {
            graduacao = "D";
        } else {
            graduacao = "";
        }

        switch (graduacao) {
            case "A", "B" -> System.out.println("APROVADO");
            case "C", "D" -> System.out.println("REPROVADO");
            default -> System.out.println("GRADUAÇÃO INVÁLIDA");
        }
    }
}
