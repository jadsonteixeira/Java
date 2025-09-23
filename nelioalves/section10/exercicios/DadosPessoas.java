package nelioalves.section10.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class DadosPessoas {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int qntPessoas = sc.nextInt();

        double[] alturas = new double[qntPessoas];
        char[] generos = new char[qntPessoas];

        for (int i = 0; i < qntPessoas; i++) {
            sc.nextLine(); // consome a quebra de linha
            System.out.print("Altura da " + (i+1) + "a pessoa: ");
            alturas[i] = sc.nextDouble();
            System.out.print("Genero da " + (i+1) + "a pessoa: ");
            generos[i] = sc.next().charAt(0);
        }

        double menorAltura = alturas[0];
        double maiorAltura = alturas[0];
        double somaAlturaMulheres = 0.0;
        int qntMulheres = 0;
        double mediaAlturaMulheres = 0.0;
        int qntHomens = 0;

        for (int i = 0 ; i < qntPessoas; i++) {
            if (alturas[i] > maiorAltura) {
                maiorAltura = alturas[i];
            }
            if (alturas[i] < menorAltura) {
                menorAltura = alturas[i];
            }
        }

        for (int i = 0; i < qntPessoas; i++) {
            if (generos[i] == 'F') {
                somaAlturaMulheres += alturas[i];
                qntMulheres++;
            } else if (generos[i] == 'M') {
                qntHomens++;
            }
        }

        mediaAlturaMulheres = (somaAlturaMulheres / qntMulheres);

        System.out.println("\nMenor altura: " + menorAltura);
        System.out.println("Maior altura: " + maiorAltura);
        System.out.println("Media das alturas das mulheres: " + String.format("%.2f", mediaAlturaMulheres));
        System.out.println("Numero de homens: " + qntHomens);

        sc.close();
    }
}
