package nelioalves.section10.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class MaisVelho {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int qntPessoas = sc.nextInt();

        String[] nomes = new String[qntPessoas];
        int[] idades = new int[qntPessoas];

        for (int i = 0; i < qntPessoas; i++) {
            sc.nextLine();
            System.out.println("Dados da " + (i+1) + "a pessoa: ");
            System.out.print("Nome: ");
            nomes[i] = sc.nextLine();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
        }

        String pessoaMaisVelha = null;
        int maiorIdade = 0;

        for (int i = 0; i < qntPessoas; i++) {
            if (idades[i] > maiorIdade) {
                maiorIdade = idades[i];
                pessoaMaisVelha = nomes[i];
            }
        }

        System.out.println("PESSOA MAIS VELHA: " + pessoaMaisVelha);

        sc.close();
    }
}
