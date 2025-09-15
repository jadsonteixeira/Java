package guanabara.aula09Exercicio;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    public Pessoa (String nome, int idade, String sexo) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    private void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void fazerAniver() {
        this.setIdade(idade++);
    }
}
