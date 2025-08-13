package exercicios.metodos;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num1 = sc.nextInt();
        System.out.print("Digite outro número: ");
        int num2 = sc.nextInt();

        maiorNumero(num1, num2);

        sc.close();
    }

    public static void maiorNumero(int num1, int num2) {
        int maior;
        if (num1 > num2) {
            System.out.println(num1 + " é o maior");
        } else {
            System.out.println(num2 + " é o maior");
        }
    }
}
