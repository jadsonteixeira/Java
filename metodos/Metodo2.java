package metodos;

public class Metodo2 {
    // métodos com e sem parâmetros de entrada
    public static void main(String[] args) {
        saida();
        msg("Mensagem");
        msg2("Oi", 5);
    }

    public static void saida() {
        System.out.println("Olá");
    }

    // método com parâmetro de entrada
    public static void msg(String m) {
        System.out.println(m);

    }

    public static void msg2(String m, int loop) {
        for (int i = 0; i < loop; i++) {
            System.out.println(m);
        }
    }
}
