package nelioalves.section10.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int qntElementos = sc.nextInt();

        int[] elementos = new int[qntElementos];
        int somaPares = 0;
        int qntPares = 0;

        for (int i = 0; i < elementos.length; i++) {
            System.out.print("Digite um numero: ");
            elementos[i] = sc.nextInt();

            if (elementos[i] % 2 == 0) {
                somaPares += elementos[i];
                qntPares++;
            }
        }

        if (qntPares == 0) {
            System.out.println("NENHUM NUMERO PAR");
        } else {
            double mediaPares = somaPares / qntPares;
            System.out.println("MEDIA DOS PARES: " + mediaPares);
        }

        sc.close();
    }
}
