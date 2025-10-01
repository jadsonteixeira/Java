package loianegroner.aula31modificadoresdeacesso;

public class TesteCarro {

    public static void main(String[] args) {

        Carro carro = new Carro();
        carro.consumoCombustivel = 10;
        System.out.println(carro.calcularCombustivel(50));
    }
}
