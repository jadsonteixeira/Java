package exercicios.metodos;

import java.util.Scanner;

public class EX01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num1 = sc.nextInt();
        System.out.print("Digite outro número: ");
        int num2 = sc.nextInt();

        System.out.println("Soma: " + somar(num1, num2));
        System.out.println("Subtração: " + subtrair(num1, num2));
        System.out.println("Multiplicação: " + multiplicar(num1, num2));
        System.out.println("Divisão: " + dividir(num1, num2));

        sc.close();
    }

    public static int somar(int n1, int n2) {
        return n1 + n2;
    }

    public static int subtrair(int n1, int n2) {
        return n1 - n2;
    }

    public static int multiplicar(int n1, int n2) {
        return n1 + n2;
    }

    public static double dividir(int n1, int n2) {
        if (n2 == 0) {
            System.out.println("Erro: divisão por 0 (zero)");
            return 0;
        }
        return (double) n1 / n2;
    }
}
