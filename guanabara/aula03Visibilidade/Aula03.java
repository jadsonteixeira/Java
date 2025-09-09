package guanabara.aula03Visibilidade;

public class Aula03 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic";
        c1.cor = "Azul";
        //c1.ponta = 0.5f;
        c1.carga = 80;
        //c1.tampada = false;
        c1.destampar(); // permite o acesso ao atributo tampada mesmo ele sendo privado, pois o método destampar() tem acesso ao atributo tampada
        c1.status();
        c1.rabiscar();
    }
}
