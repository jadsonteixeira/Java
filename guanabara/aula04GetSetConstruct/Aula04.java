package guanabara.aula04GetSetConstruct;

public class Aula04 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("BIC", "Preto", 0.5f);
        c1.status();

        System.out.println();

        Caneta c2 = new Caneta("BIC", "Azul", 1.0f);
        c2.status();
    }
}
