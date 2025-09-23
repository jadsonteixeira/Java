package nelioalves.section10.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Aprovados {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados? ");
        int qntAlunos = sc.nextInt();

        String[] alunos = new String[qntAlunos];
        double[] primeiroSem = new double[qntAlunos];
        double[] segundoSem = new double[qntAlunos];

        for (int i = 0; i < qntAlunos; i++) {
            sc.nextLine(); // consome a quebra de linha
            System.out.println("Digite o nome e as notas do " + (i+1) + "o aluno: ");
            System.out.print("Nome: ");
            alunos[i] = sc.nextLine();
            System.out.print("1° semestre: ");
            primeiroSem[i] = sc.nextDouble();
            System.out.print("2° semestre: ");
            segundoSem[i] = sc.nextDouble();
        }

        System.out.println("Alunos aprovados: ");
        for (int i = 0; i < qntAlunos; i++) {
            if (((primeiroSem[i] + segundoSem[i]) / 2) >= 6.0) {
                System.out.println(alunos[i]);
            }
        }

        sc.close();
    }
}
