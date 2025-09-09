package loianegroner.exercicios.aula25a27;

public class Lampada {
    String marca;
    String tipoLuz;
    double potencia;
    boolean ligada;

    void ligar() {
        ligada = true;
    }

    void desligar() {
        ligada = false;
    }

    void status() {
        System.out.println("Marca: " + marca);
        System.out.println("Tipo de luz: " + tipoLuz);
        System.out.println("Potência: " + potencia);
        System.out.println("Está ligada? " + ligada);
    }
}
