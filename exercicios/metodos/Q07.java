package exercicios.metodos;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite N1: ");
        double num1 = sc.nextDouble();
        System.out.print("Digite N2: ");
        double num2 = sc.nextDouble();
        System.out.print("Digite N3: ");
        double num3 = sc.nextDouble();

        System.out.println("Média: " + mediaTresNumeros(num1, num2, num3));

        sc.close();
    }

    public static double mediaTresNumeros(double n1, double n2, double n3) {
        double media = (n1 + n2 + n3) / 3;
        return media;
    }
}
