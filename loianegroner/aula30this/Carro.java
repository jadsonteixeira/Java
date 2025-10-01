package loianegroner.aula30this;

public class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    public Carro() {

    }

    public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }

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
