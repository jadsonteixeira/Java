package loianegroner.exercicios.aula25a27;

public class MainContaCorrente {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.numero = "1000-1";
        cc.saldo = 0.0;
        cc.tipoEspecial = true;
        cc.limite = 20000;

        cc.depositar(1000);
        cc.consultarSaldo();
        cc.saque(2000);
        cc.consultarSaldo();
        cc.tipoEspecial();
    }
}
