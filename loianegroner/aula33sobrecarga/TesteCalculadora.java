package loianegroner.aula33sobrecarga;

public class TesteCalculadora {

    public static void main(String[] args) {

        int[] vetor = new int[10];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i + 1;
        }

        MinhaCalculadora calculadora = new MinhaCalculadora();
        int somaVetor = calculadora.soma(vetor);
        System.out.println(somaVetor);
    }
}
