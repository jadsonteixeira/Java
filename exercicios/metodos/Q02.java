package exercicios.metodos;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um nome: ");
        String nome = sc.nextLine();

        saudarPessoa(nome);

        sc.close();
    }

    public static void saudarPessoa(String nome) {
        System.out.println("Olá " + nome);
    }
}
