package nelioalves.section10.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int qntNum = sc.nextInt();

        double[] numeros = new double[qntNum];

        for (int i = 0; i < numeros.length; i++) {
            sc.nextLine(); // consome a quebra de linha deixada acima
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextDouble();
        }

        double maiorValor = 0.0;
        int posicaoMaiorValor = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maiorValor) {
                maiorValor = numeros[i];
                posicaoMaiorValor = i;
            }
        }

        System.out.println("\nMAIOR VALOR: " + maiorValor);
        System.out.println("POSICAO DO MAIOR VALOR: " + posicaoMaiorValor);

        sc.close();
    }
}
