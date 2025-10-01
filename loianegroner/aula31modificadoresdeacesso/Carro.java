package loianegroner.aula31modificadoresdeacesso;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    public void exibirAutonomia() {
        System.out.println("Autonomia do carro: " + (capCombustivel * consumoCombustivel) + " km");
    }

    public double obterAutonomia() {
        System.out.println("Método obterAutonomia foi chamado");

        return capCombustivel * consumoCombustivel;
    }

    private double divideKMPorConsumoCombustivel(double km) {
        return km / consumoCombustivel;
    }

    public double calcularCombustivel(double km) {
        return this.divideKMPorConsumoCombustivel(km);
    }
}
