package nelioalves.section10.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        double[] vect = new double[n];
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }
        System.out.println();

        double soma = 0.0;

        System.out.print("VALORES: ");
        for (int i = 0; i < vect.length; i++) {
            System.out.print(vect[i] + " ");
            soma += vect[i];
        }
        double media = soma / vect.length;

        System.out.println();
        System.out.println("SOMA = " + soma);
        System.out.println("MEDIA = " + media);

        sc.close();
    }
}
