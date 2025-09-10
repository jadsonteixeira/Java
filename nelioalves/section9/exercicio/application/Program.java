package nelioalves.section9.exercicio.application;

import nelioalves.section9.exercicio.entities.BankAccount;

import java.util.Scanner;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: " );
        String accountNumber = sc.nextLine();
        System.out.print("Enter account holder: ");
        String name = sc.nextLine();
        /*System.out.print("Is there an initial deposit (y/n)? ");
        String isDeposit = sc.nextLine();*/
        System.out.print("Enter initial deposit value: ");
        double initialDeposit = sc.nextDouble();

        BankAccount bankAccount = new BankAccount(accountNumber, name, initialDeposit);

        System.out.println();
        System.out.println("Account data: " + bankAccount);

        System.out.print("Enter a deposit value: ");
        double newDeposit = sc.nextDouble();
        bankAccount.deposit(newDeposit);
        System.out.println("Updated account data: ");
        System.out.println("Account data: " + bankAccount);

        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        bankAccount.withdraw(withdrawValue);
        System.out.println("Updated account data: ");
        System.out.println("Account data: " + bankAccount);
    }
}
