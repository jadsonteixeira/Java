package guanabara.aula09Exercicio;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro (String titulo, String autor, int totPaginas, int pagAtual, boolean aberto, Pessoa leitor) {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setTotPaginas(totPaginas);
        this.setPagAtual(pagAtual);
        this.setAberto(aberto);
        this.setLeitor(leitor);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public void detalhes() {
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Total Paginas: " + this.getTotPaginas());
    }

    public void abrir() {
        if (this.isAberto()) {
            System.out.println("Livro aberto");
        } else {
            System.out.println("Livro fechado");
        }
    }

    public void fechar() {
        if (!this.isAberto()) {
            this.setAberto(false);
            System.out.println("Livro fechado");
        } else {
            System.out.println("Livro aberto");
        }
    }

    public void folhear() {
        if (this.isAberto()) {
            if (this.getPagAtual() > 0 && this.getPagAtual() <= this.getTotPaginas()) {
                this.setPagAtual(this.getPagAtual() + 1);
            } else {
                System.out.println("Livro fechado");
            }
        } else {
            System.out.println("Livro fechado");
        }
    }

    public void avancarPag() {
        if (this.isAberto()) {
            if (this.getPagAtual() > 0 && this.getPagAtual() <= this.getTotPaginas()) {
                this.setPagAtual(this.getPagAtual() + 1);
            } else {
                System.out.println("Livro fechado");
            }
        } else {
            System.out.println("Livro fechado");
        }
    }

    public void voltarPag() {
        if (this.isAberto()) {
            if (this.getPagAtual() > 0 && this.getPagAtual() <= this.getTotPaginas()) {
                this.setPagAtual(this.getPagAtual() - 1);
            } else {
                System.out.println("Livro fechado");
            }
        } else {
            System.out.println("Livro fechado");
        }
    }
}
