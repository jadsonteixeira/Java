package loianegroner.Aula27MetodosParametro;

public class TesteCarro {
    public static void main(String[] args) {
        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println("Marca: " + van.marca);
        System.out.println("Modelo: " + van.modelo);

        van.exibirAutonomia();

        double autonomia = van.obterAutonomia();
        System.out.println("Autonomia do carro: " + autonomia);
        System.out.println("Autonomia do carro: " + van.obterAutonomia());

        double qtdCombustivel10Km = van.calcularCombustivel(10);

        System.out.println("Quantidade de combustível para 10Km: " + qtdCombustivel10Km);
    }
}
