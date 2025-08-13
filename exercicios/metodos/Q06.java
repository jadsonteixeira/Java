package exercicios.metodos;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double num = sc.nextDouble();

        System.out.println((int) num + "² = " + (int) calcularQuadrado(num));

        sc.close();
    }

    public static double calcularQuadrado(double num) {
        return Math.pow(num, 2);
    }
}
