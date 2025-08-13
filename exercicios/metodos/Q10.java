package exercicios.metodos;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        System.out.println("Método isPrime()");
        if (isPrime(num)) {
            System.out.println(num + " é PRIMO");
        } else {
            System.out.println(num + " não é PRIMO");
        }
        System.out.println();

        System.out.println("Método numeroPrimo()");
        if (numeroPrimo(num)) {
            System.out.println(num + " é PRIMO");
        } else {
            System.out.println(num + " não é PRIMO");
        }

        sc.close();
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean numeroPrimo(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
