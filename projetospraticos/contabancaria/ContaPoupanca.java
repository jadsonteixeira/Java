package projetospraticos.contabancaria;

public class ContaPoupanca extends ContaBancaria {

    private double saldoPoupanca;

    public ContaPoupanca(double saldo, String nomeTitular) {
        super(saldo, nomeTitular);
        this.saldoPoupanca = 0;
    }

    public double getSaldoPoupanca() {
        return saldoPoupanca;
    }

    public void setSaldoPoupanca(double saldoPoupanca) {
        this.saldoPoupanca = saldoPoupanca;
    }


}
