package loianegroner.exercicios.aula25a27;

public class MainLampada {
    public static void main(String[] args) {
        Lampada lamp = new Lampada();
        lamp.marca = "Elgin";
        lamp.tipoLuz = "LED";
        lamp.potencia = 10;
        lamp.desligar();
        lamp.status();
    }
}
