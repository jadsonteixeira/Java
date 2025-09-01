package nelioalves.section8.exercicio2;

import java.util.Scanner;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee funcionario = new Employee();

        System.out.print("Name: ");
        funcionario.name = sc.nextLine();
        System.out.print("Gross salary: ");
        funcionario.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        funcionario.tax = sc.nextDouble();

        System.out.println();

        System.out.println("Employee: " + funcionario);
        System.out.println();

        System.out.print("Which percentagem to increase salary? ");
        double percentage = sc.nextDouble();
        funcionario.increaseSalary(percentage);
        System.out.println();

        System.out.println("Update data: " + funcionario);

        sc.close();
    }
}
