package loianegroner.exercicios.aula24;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("CLASSE LÂMPADA");
        Lampada lampada = new Lampada();
        lampada.marca = "Bic";
        lampada.preco = 10.90;
        lampada.volts = 5.0;
        System.out.println("Marca: " + lampada.marca);
        System.out.println("Preço: " + lampada.preco);
        System.out.println("Voltagem: " + lampada.volts);

        System.out.println();

        System.out.println("CLASSE LIVRO");
        Livro livro = new Livro();
        livro.nome = "O Hobbit";
        livro.autor = "Tolkien";
        livro.preco = 49.90;
        livro.anoLanc = 1939;
        livro.qntPag = 300;
        System.out.println("Nome do livro: " + livro.nome);
        System.out.println("Autor: " + livro.autor);
        System.out.println("Preço: " + livro.preco);
        System.out.println("Ano de lançamento: " + livro.anoLanc);
        System.out.println("Quantidade de páginas: " + livro.qntPag);

        System.out.println();

        System.out.println("CLASSE CONTA CORRENTE");
        ContaCorrente cc = new ContaCorrente();
        cc.numeroConta = 1001;
        cc.saldo = 1000;
        cc.status = "Especial";
        cc.limite = 100000;
        System.out.println("Número da conta: " + cc.numeroConta);
        System.out.println("Saldo: " + cc.saldo);
        System.out.println("Status da conta: " + cc.status);
        System.out.println("Limite da conta: " + cc.limite);

        System.out.println();

        System.out.println("CLASSE CONTATO");
        Contato contato = new Contato();
        contato.nome = "Jadson";
        contato.numero = new String[3];
        contato.numero[0] = "(84) 912345678";
        System.out.println("Nome: " + contato.nome);
        System.out.println("Número: " + contato.numero[0]);

        System.out.println();

        System.out.println("CLASSE LIVRO BIBLIOTECA");
        LivroBiblioteca livroB = new LivroBiblioteca();
        livroB.nome = "O Senhor dos Anéis";
        livroB.autor = "Tolkien";
        livroB.anoLanc = 1940;
        livroB.emprestado = true;
        livroB.dataEntrega = new Date();
        livroB.emprestadoPara = "Jadson";
        System.out.println("Nome: " + livroB.nome);
        System.out.println("Autor : " + livroB.autor);
        System.out.println("Ano de lançamento: " + livroB.anoLanc);
        System.out.println("Emprestado? " + livroB.emprestado);
        System.out.println("Data de entrega: " + livroB.dataEntrega);
        System.out.println("Emprestado para: " + livroB.emprestadoPara);
    }
}
