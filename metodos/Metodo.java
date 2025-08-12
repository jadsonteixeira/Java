package metodos;

public class Metodo {
    // exemplo de procedimento
    public static void soma(int a, int b) {
        int soma = a + b;
        System.out.println("Soma: " + soma);
    }

    public static void main(String[] args) {
        soma(5, 2);
    }
}
