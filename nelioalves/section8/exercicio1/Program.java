package nelioalves.section8.exercicio1;

import java.util.Scanner;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and heigth: ");
        rectangle.width = sc.nextDouble();
        rectangle.heigth = sc.nextDouble();

        System.out.println(rectangle);
    }
}
