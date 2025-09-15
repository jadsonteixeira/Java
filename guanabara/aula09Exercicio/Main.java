package guanabara.aula09Exercicio;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Jadson", 24, "Masculino");

        Livro l1 = new Livro("O Senhor dos Anéis", "Tolkein", 600, 1, true, p1);

        l1.detalhes();
    }
}
