package exercicios.metodos;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num1 = sc.nextInt();
        System.out.print("Digite outro número: ");
        int num2 = sc.nextInt();

        System.out.println("Soma: " + somar(num1, num2));

        sc.close();
    }

    public static int somar(int num1, int num2) {
        return num1 + num2;
    }
}
