package projetospraticos.contabancaria;

public class ContaCorrente extends ContaBancaria {

    private double limiteCredito;

    public ContaCorrente(double saldo, String nomeTitular) {
        super(saldo, nomeTitular);
        this.limiteCredito = 100;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    @Override
    public void show() {
        System.out.println("Olá " + getNomeTitular() + ", seu saldo é: " + mostrarSaldoTotal() + " reais já incluso os " + getLimiteCredito() + " reais de crédito");
    }

    public double mostrarSaldoTotal() {
        return this.getSaldo() + this.getLimiteCredito();
    }
}
