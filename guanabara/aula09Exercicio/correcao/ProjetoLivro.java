package guanabara.aula09Exercicio.correcao;

public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Jadson", 24, "M");
        p[1] = new Pessoa("Teixeira", 24, "M");

        l[0] = new Livro("O Senhor dos Anéis", "Tolkien", 600, p[0]);
        l[1] = new Livro("Algoritmos", "Leandro", 500, p[1]);
        l[2] = new Livro("Java POO", "Martins", 1000, p[0]);

        l[0].abrir();
        l[0].avancarPag();
        System.out.println(l[0].detalhes());
        System.out.println();
        System.out.println(l[1].detalhes());
    }
}
