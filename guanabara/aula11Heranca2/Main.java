package guanabara.aula11Heranca2;

public class Main {

    public static void main(String[] args) {

        // herança de implementação
        System.out.println("VISTANTE");
        Visitante p1 = new Visitante();
        p1.setNome("Joao");
        p1.setIdade(20);
        p1.setSexo("M");
        System.out.println(p1.toString());

        // herança de diferença
        System.out.println("\nALUNO");
        Aluno p2 = new Aluno();
        p2.setNome("Jadson");
        p2.setIdade(24);
        p2.setSexo("M");
        p2.setCurso("TADS");
        p2.setMatricula(2024001);
        p2.pagarMensalidade();
        System.out.println(p2.toString());

        // herança de diferença com sobreposição de métodos
        System.out.println("\nBOLSISTA");
        Bolsista p3 = new Bolsista();
        p3.setNome("Teixeira");
        p3.setIdade(30);
        p3.setSexo("M");
        p3.setCurso("PPGES");
        p3.setMatricula(2027001);
        p3.setBolsa(15.f);
        p3.pagarMensalidade();
        System.out.println(p3.toString());

        System.out.println("\nPROFESSOR");
        Professor p4 = new Professor();
        p4.setNome("Danilo");
        p4.setIdade(50);
        p4.setSexo("M");
        p4.setEspecialidade("Arquitetura");
        p4.setSalario(7000f);
        System.out.println(p4.toString());
    }
}
