package nelioalves.section10.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetores {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int qntValores = sc.nextInt();

        int[] vetorA = new int[qntValores];
        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            sc.nextLine(); // consome a quebra de linha
            System.out.print("Valor: ");
            vetorA[i] = sc.nextInt();
        }

        int[] vetorB = new int[qntValores];
        System.out.println("Digite os valores do vetor B: ");
        for (int i = 0; i < vetorB.length; i++) {
            sc.nextLine();
            System.out.print("Valor: ");
            vetorB[i] = sc.nextInt();
        }

        int[] vetorC = new int[qntValores];
        System.out.println("VETOR RESULTANTE (vetor C): ");
        for (int i = 0; i < vetorC.length; i++) {
            vetorC[i] = vetorA[i] + vetorB[i];
            System.out.print(vetorC[i] + " ");
        }

        sc.close();
    }
}
