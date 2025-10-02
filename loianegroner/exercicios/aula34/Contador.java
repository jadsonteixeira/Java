package loianegroner.exercicios.aula34;

public class Contador {

    private static int contador;

    public Contador() {
        this.contador++;
    }

    public static int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public void zerar() {
        setContador(0);
    }

    public void incrementar() {
        setContador(getContador() + 1);
    }
}
