package nelioalves.section8.exerciciofixacao;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();
        System.out.print("How many dollars will be bougth? ");
        double valueInReais = sc.nextDouble();
        System.out.println("Amount to be paid in reais = " + String.format("%.2f", CurrencyConverter.converterDollars(dollarPrice, valueInReais)) );

        sc.close();
    }
}
