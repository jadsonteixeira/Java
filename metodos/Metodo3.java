package metodos;

public class Metodo3 {
    // métodos com retornos (saídas)
    public static void main(String[] args) {
        int adicao = soma2(10, 5);
        System.out.println(adicao);
        System.out.println(soma2(20, 20));
        System.out.println("Múltiplos números de entrada: " + soma(10, 20, 30, 40, 50));
        System.out.println();
        System.out.println("Sobrecarga: ");
        System.out.println(soma(2.5, 1.5));
    }

    public static int soma2(int n1, int n2) {
        int result = n1 + n2;
        return result;
    }

    // múltiplos parâmetros de entrada
    public static int soma(int... numeros) {
        int result = 0;
        for (int n : numeros) {
            result += n;
        }
        return result;
    }

    // sobrecarga de métodos
    public static double soma(double... numeros) {
        double result = 0;
        for (double n : numeros) {
            result += n;
        }
        return result;
    }

}
