package exercicios.metodos;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        isPar(num);

        sc.close();
    }

    public static void isPar(int num) {
        if (num == 0) {
            System.out.println(num + " é NEUTRO");
        } else if (num % 2 == 0) {
            System.out.println(num + " é PAR");
        } else {
            System.out.println(num + " é ÍMPAR");
        }
    }
}
