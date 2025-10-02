package loianegroner.aula36relacionamentotemum;

public class TesteContato {

    public static void main(String[] args) {

        Contato contato = new Contato();
        contato.setNome("Jadson");
        //contato.setEndereco("Nova Cruz");
        //contato.setTelefone("84 91234-5678");

        // relacionamento tem-um endereço
        Endereco end = new Endereco();
        end.setNomeRua("The Lord Of The Rings");
        end.setNumero("n/a");
        end.setComplemento("-");
        end.setCidade("Floresta Negra");
        end.setEstado("Valfenda");
        end.setCep("999000999");

        contato.setEndereco(end);

        // relacionamento tem-um telefone
        Telefone telefone = new Telefone();
        telefone.setTipo("Celular");
        telefone.setDdd("84");
        telefone.setNumero("91234-5678");

        Telefone telefone2 = new Telefone();
        telefone2.setTipo("Casa");
        telefone2.setDdd("84");
        telefone2.setNumero("91234-0000");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = telefone;
        telefones[1] = telefone2;

        //contato.setTelefone(telefone);
        contato.setTelefones(telefones);

        // saída no terminal
        System.out.println("Nome: " + contato.getNome());

        if (contato != null && contato.getEndereco() != null) {
            System.out.println("Cidade: " + contato.getEndereco().getCidade());
        }

//        if (contato != null && contato.getTelefone() != null) {
//            System.out.println("Telefone: (" + contato.getTelefone().getDdd() + ")" + " " + contato.getTelefone().getNumero());
//        }

        if (contato != null && contato.getTelefones() != null) {
            for (Telefone t : contato.getTelefones()) {
                System.out.println("Telefone: " + t.getDdd() + " " + t.getNumero());
            }
        }
    }
}
