package exercicios.metodos;

import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();
        String stringInvertida = inverterString(palavra);

        System.out.println("String original: " + palavra);
        System.out.println("String invertida: " + stringInvertida);

        System.out.println();

        System.out.println("Utilizando o StringBuilder");
        System.out.print("Digite outra palavra: ");
        String palavra2 = sc.nextLine();
        String inversaoComStringBuilder = inverterString2(palavra2);

        System.out.println("String original: " + palavra2);
        System.out.println("String invertida: " + inversaoComStringBuilder);

        sc.close();
    }

    public static String inverterString(String palavra) {
        String stringInvertida = "";

        for (int i = palavra.length() - 1; i >= 0; i--) {
            stringInvertida += palavra.charAt(i);
        }
        return stringInvertida;
    }

    // utilizando StringBuilder
    public static String inverterString2(String palavra) {
        StringBuilder sb = new StringBuilder(palavra);
        return sb.reverse().toString(); // inverte e transforma em String
    }
}
