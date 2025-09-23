package nelioalves.section10.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class NumerosPares {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int qntNum = sc.nextInt();

        int[] numeros = new int[qntNum];

        for (int i = 0; i < qntNum; i++) {
            sc.nextLine();
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("NUMEROS PARES: ");
        for (int i = 0; i < qntNum; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.print(numeros[i] + " ");
            }
        }

        int qntPares = 0;
        for (int i = 0; i < qntNum; i++) {
            if (numeros[i] % 2 == 0) {
                qntPares++;
            }
        }
        System.out.println("\nQUANTIDADE DE PARES: " + qntPares);

        sc.close();
    }
}
