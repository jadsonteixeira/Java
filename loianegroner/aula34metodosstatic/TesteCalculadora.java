package loianegroner.aula34metodosstatic;

public class TesteCalculadora {

    public static void main(String[] args) {

        int[] vetor = new int[10];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i + 1;
        }

        int somaVetor = MinhaCalculadora.soma(vetor);
        System.out.println("Soma da vetor: " + somaVetor);
    }
}
