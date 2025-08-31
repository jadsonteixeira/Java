package projetospraticos.sistemanotas;

import java.util.Scanner;

public class SistemaNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos deseja cadastrar: ");
        int qntAlunos = sc.nextInt();
        sc.nextLine(); // limpar o buffer

        String[] nomes = new String[qntAlunos];
        double[][] notas = new double[qntAlunos][3];
        double[] medias = new double[qntAlunos];

        // cadastro dos alunos
        for (int i = 0; i < qntAlunos; i++) {
            System.out.println("\nAluno " + (i + 1) + ": ");
            System.out.print("Nome: ");
            nomes[i] = sc.nextLine();

            // receber notas
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite a nota " + (j + 1) + ": ");
                notas[i][j] = sc.nextDouble();
            }
            sc.nextLine(); // limpar o buffer

            // calcular média com método
            medias[i] = calcularMedia(notas[i]);
        }

        // relatório final
        System.out.println("\nRELATÓRIO FINAL DAS NOTAS");
        for (int i = 0; i < qntAlunos; i++) {
            System.out.println("Aluno: " + nomes[i]);
            System.out.println("Média: " + medias[i]);
            System.out.println("Situação: " + verificarSituacao(medias[i]));
            System.out.println("---------------------------");
        }

        sc.close();
    }

    public static double calcularMedia(double[] notas) {
        double soma = 0;
        for (double n : notas) {
            soma += n;
        }
        return soma / notas.length;
    }

    public static String verificarSituacao(double media) {
        if (media >= 6) {
            return "Aprovado";
        } else if (media >= 4) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }
}

