package exercicios.metodos;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um palavra: ");
        String palavra = sc.nextLine();

        System.out.println("Na palavra " + palavra + " temos " + contarVogais(palavra) + " vogais");
        System.out.println("Na palavra " + palavra + " temos " + contarConsoantes(palavra) + " consoantes");

        sc.close();
    }

    public static int contarVogais(String palavra) {
        int qntVogais = 0;
        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) == 'a' || palavra.charAt(i) == 'e' || palavra.charAt(i) == 'i' || palavra.charAt(i) == 'o' || palavra.charAt(i) == 'u') {
                qntVogais++;
            }
        }
        return qntVogais;
    }

    public static int contarConsoantes(String palavra) {
        int qntConsoantes = 0;
        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) != 'a' && palavra.charAt(i) != 'e' && palavra.charAt(i) != 'i' && palavra.charAt(i) != 'o' && palavra.charAt(i) != 'u') {
                qntConsoantes++;
            }
        }
        return qntConsoantes;
    }
}
