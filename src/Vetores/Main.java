package Vetores;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        arrayNumeros();
        arrayLetras();
        arrayLetrasValores();
        maiorMenorMedia();
    }

    public static void arrayNumeros() {
        int[] numeros = new int[5];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        System.out.println("\n");
    }

    public static void arrayLetras() {
        String[] letras = new String[5];
        letras[0] = "A";
        letras[1] = "B";
        letras[2] = "C";
        letras[3] = "D";
        letras[4] = "E";

        for (int i = 0; i < letras.length; i++) {
            System.out.println(letras[i]);
        }

        System.out.println("\n");
    }

    public static void arrayLetrasValores() {
        String[] letras = {"A", "B", "C", "H", "P"};

        for (int i = 0; i < letras.length; i++) {
            System.out.println(letras[i]);
        }

        System.out.println("\n" + Arrays.toString(letras));
    }

    public static void maiorMenorMedia() {
        int[] numeros = {9, 10, 12, 25, 4};
        int maior = numeros[0];
        int menor = numeros[0];
        int media = 0;

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }

            media += numeros[i];

        }

        System.out.println("\n" + "Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Média: " + media / numeros.length);
    }
}
