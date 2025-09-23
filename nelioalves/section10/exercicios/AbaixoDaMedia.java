package nelioalves.section10.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int qntElementos = sc.nextInt();

        double[] numeros = new double[qntElementos];
        for (int i = 0; i < qntElementos; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextDouble();
        }

        double somaElementos = 0.0;
        for (int i = 0; i < numeros.length; i++) {
            somaElementos += numeros[i];
        }
        double mediaElementos = somaElementos / qntElementos;

        System.out.println("\nMEDIA DO VETOR: " + String.format("%.3f", mediaElementos));
        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < mediaElementos) {
                System.out.println(numeros[i]);
            }
        }

        sc.close();
    }
}
