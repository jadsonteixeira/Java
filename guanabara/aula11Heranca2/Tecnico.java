package guanabara.aula11Heranca2;

public class Tecnico extends Aluno {

    private String registroProfissional;

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    public void praticar() {
        System.out.println("Está praticando");
    }

    @Override
    public String toString() {
        return "Dados\n"
                + "Nome: " + getNome()
                + "\nIdade: " + getIdade()
                + "\nSexo: " + getSexo()
                + "\nRegistro Profissional: " + getRegistroProfissional();
    }
}
