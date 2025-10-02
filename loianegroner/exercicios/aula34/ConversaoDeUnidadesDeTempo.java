package loianegroner.exercicios.aula34;

public class ConversaoDeUnidadesDeTempo {

    public static int minParaSeg(int minutos) {
        return minutos * 60;
    }

    public static int horasParaMin(int horas) {
        return horas * 60;
    }

    public static int diasParaHoras(int dias) {
        return dias * 24;
    }

    public static int semanasParaDias(int semanas) {
        return semanas * 7;
    }

    public static int mesParaDias(int mes) {
        return mes * 30;
    }

    public static int anoParaDias(int ano) {
        return ano * 365;
    }
}
