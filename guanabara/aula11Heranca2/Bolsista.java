package guanabara.aula11Heranca2;

public class Bolsista extends Aluno {

    private float bolsa;

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

    public void renovarBolsa() {
        System.out.println("Renovando bolsa de " + this.getNome());
    }

    @Override
    public void pagarMensalidade() {
        System.out.println(this.getNome() + " é bolsita! Pagamento facilitado");
    }

    @Override
    public String toString() {
        return "Dados\n"
                + "Nome: " + getNome()
                + "\nIdade: " + getIdade()
                + "\nSexo: " + getSexo()
                + "\nBolsa: " + getBolsa();
    }
}
