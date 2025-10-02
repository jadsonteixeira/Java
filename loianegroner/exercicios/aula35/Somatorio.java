package loianegroner.exercicios.aula35;

public class Somatorio {

    public static int somatorio(int num) {

        if (num == 0) {
            return 0;
        }

        return num + somatorio(num - 1);
    }
}
