package nelioalves.section9.exerciciocorrection.entities;

public class Account {
    private int number;
    private String holder;
    private double balance;

    // construtor
    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public Account(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit); // o saldo inicial sempre vai ser 0, o depósito inicial é uma operação
    }

    // get and set
    public int getNumber() {
        return number;
    }
    // como o número da conta não pode ser mudado, não precisamos criar um setNumber

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }
    // só é possível modificar o saldo através de um depósito ou saque, por isso não temos o setBalance

    // métodos
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount + 5.0;
    }

    public String toString() {
        return "Account "
                + number
                + ", Holder: "
                + holder
                + ", Balance: $ "
                + String.format("%.2f", balance);
    }
}
