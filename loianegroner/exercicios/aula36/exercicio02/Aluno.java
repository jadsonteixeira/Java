package loianegroner.exercicios.aula36.exercicio02;

public class Aluno {

    private String nome;
    private String matricula;
    private int[] notas;

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Dados dos alunos"
                + "\nNome: " + getNome()
                + "\nMatrícula: " + getMatricula();
    }
}
