package loianegroner.exercicios.aula34;

public class ConversaoDeUnidadesDeArea {

    public static double metrosQuadradosParaPesQuadrados(double metrosQuadrados) {
        return metrosQuadrados * 10.7639;
    }

    public static double pesQuadradosParaCentimetrosQuadrados(double pesQuadrados) {
        return pesQuadrados * 929.03129906;
    }

    public static double milhasQuadradasParaAcres(double milhasQuadradas) {
        return milhasQuadradas * 639.9992748;
    }

    public static double acresParaPesQuadrados(double acres) {
        return acres * 43560;
    }
}
