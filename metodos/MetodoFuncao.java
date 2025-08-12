package metodos;

public class MetodoFuncao {
    // exemplo de função
    public static int soma(int a, int b) {
        int soma = a + b;
        return soma;
    }

    public static void main(String[] args) {
        int resultado = soma(10,5);
        System.out.println("Resultado: " + resultado);
    }
}
