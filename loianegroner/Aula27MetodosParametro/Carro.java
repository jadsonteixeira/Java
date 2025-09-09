package loianegroner.Aula27MetodosParametro;

public class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    void exibirAutonomia() {
        System.out.println("Autonomia do carro: " + (capCombustivel * consumoCombustivel) + " km");
    }

    double obterAutonomia() {
        System.out.println("Método obterAutonomia foi chamado");

        return capCombustivel * consumoCombustivel;
    }

    double calcularCombustivel(double km) {
        double qtdCombustivel = km / consumoCombustivel;

        return  qtdCombustivel;
    }
}
