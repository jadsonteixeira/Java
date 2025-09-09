package loianegroner.exercicios.aula25a27;

public class ContaCorrente {
    String numero;
    double saldo;
    boolean tipoEspecial;
    double limite;

    void saque(double valorSaque) {
        if (valorSaque > saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            saldo -= valorSaque;
        }
    }

    void depositar(double valorDeposito) {
        if (valorDeposito < 0) {
            System.out.println("Valor inválido");
        } else {
            saldo = valorDeposito;
        }
    }

    void consultarSaldo() {
        System.out.println("Saldo: R$" + String.format("%.2f", saldo));
    }

    void tipoEspecial() {
        if (tipoEspecial == true) {
            System.out.println("Cliente especial");
        } else {
            System.out.println("Cliente não especial");
        }
    }

    void statusConta() {
        System.out.println("Número: " + numero);
        System.out.println("Saldo: R$" + String.format("%.2f", saldo));
        System.out.println("Conta especial? " + tipoEspecial);
        System.out.println("Limite da conta: R$" + String.format("%.2f", limite));
    }
}
