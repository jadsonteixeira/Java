package poo.nelioalves.section8.problemasempoo;

import java.util.Scanner;
import java.util.Locale;

public class Triangulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double xA, xB, xC, yA, yB, yC;

        System.out.println("Digite os lados do triângulo X");
        System.out.print("Lado A: ");
        xA = sc.nextDouble();
        System.out.print("Lado B: ");
        xB = sc.nextDouble();
        System.out.print("Lado C: ");
        xC = sc.nextDouble();

        System.out.println("Digite os lados do triângulo Y");
        System.out.print("Lado A: ");
        yA = sc.nextDouble();
        System.out.print("Lado B: ");
        yB = sc.nextDouble();
        System.out.print("Lado C: ");
        yC = sc.nextDouble();

        double pX = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(pX * (pX - xA) * (pX - xB) * (pX - xC));

        double pY = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(pY * (pY - yA) * (pY - yB) * (pY - yC));

        System.out.printf("Área do triângulo X: %.4f\n", areaX);
        System.out.printf("Área do triângulo Y: %.4f\n", areaY);

        System.out.println("Qual a maior área? ");
        if (areaX > areaY) {
            System.out.println("Maior área: Triângulo X");
        } else {
            System.out.println("Maior área: Triângulo Y");
        }

        sc.close();
    }
}
