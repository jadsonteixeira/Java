package nelioalves.section9.exercicio.entities;

public class BankAccount {
    private String numberAccount;
    private String name;
    private double depositInitial;
    private double balance;

    public BankAccount(String numberAccount, String name, double depositInitial) {
        this.numberAccount = numberAccount;
        this.name = name;
        this.depositInitial = depositInitial;
    }

    public String getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(String numberAccount) {
        this.numberAccount = numberAccount;
    }

    public String getName() {
        return name;
    }

    public void serName(String name) {
        this.name = name;
    }

    public double getDepositInitial() {
        return depositInitial;
    }

    public void setDepositInitial(double depositInitial) {
        this.depositInitial = depositInitial;
    }

    public double getBalance() {
        return balance + depositInitial;
    }

    public void deposit(double deposit) {
        this.balance += deposit;
    }

    public void withdraw(double withdrawValue) {
        this.balance -= withdrawValue + 5;
    }

    public String toString() {
        return getNumberAccount()
                + ", Holder: " + getName()
                + ", Balance: " + String.format("%.2f", getBalance())
                + "\n";
    }
}
