package guanabara.aula11Heranca2;

public class Professor extends Pessoa {

    private String especialidade;
    private double salario;

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void receberAumento(float aumento) {
        this.salario += aumento;
    }

    @Override
    public String toString() {
        return "Dados\n"
                + "Nome: " + getNome()
                + "\nIdade: " + getIdade()
                + "\nSexo: " + getSexo()
                + "\nEspecialidade: " + getEspecialidade()
                + "\nSalário R$: " + getSalario();
    }
}
