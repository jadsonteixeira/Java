package projetospraticos.contabancaria;

public abstract class ContaBancaria {

    private double saldo;
    private String nomeTitular;

    public ContaBancaria(double saldo, String nomeTitular) {
        this.saldo = saldo;
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public void show() {
        System.out.println("Olá " + getNomeTitular() + ", seu saldo é: " + getSaldo() + " reais");
    }

    public void creditar(double valor) {
        this.saldo += valor;
    }

    public void debitar(double valor) {
        this.saldo -= valor;
    }
}
