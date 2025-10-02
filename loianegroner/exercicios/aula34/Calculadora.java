package loianegroner.exercicios.aula34;

public class Calculadora {

    public static int somar(int n1, int n2) {
        return n1 + n2;
    }

    public static int subtrair(int n1, int n2) {
        return n1 - n2;
    }

    public static int multiplicar(int n1, int n2) {
        return n1 * n2;
    }

    public static int dividir(int n1, int n2) {
        return n1 / n2;
    }

    public static int potencia(int num, int potencia) {
        int result = 1;

        for (int i = 1; i <= potencia; i++) {
            result *= num;
        }

        return result;
    }

    public static int fatorial(int num) {
        if (num == 0) {
            return 1;
        }

        int result = 1;
        for (int i = num; i > 1; i--) {
            result *= i;
        }

        return result;
    }
}
